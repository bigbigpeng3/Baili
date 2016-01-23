package com.example.administrator.myjsouptest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    ListView lvNews;
    List<NewsItem> newsObeject = new ArrayList<NewsItem>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lvNews = (ListView) findViewById(R.id.lv_news);
        x.Ext.init(getApplication());
        //从网页上获取数据
        initData();
        NewsAdapter adapter = new NewsAdapter(ListViewActivity.this,R.layout.item_news,newsObeject);
        lvNews.setAdapter(adapter);
        lvNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                NewsItem newsItem = newsObeject.get(position);
                Intent intent = new Intent(ListViewActivity.this, MainActivity.class);
                intent.putExtra("href", newsItem.getHref());
                startActivity(intent);
            }
        });


    }
    private void initData() {

        //String urlStr = "http://www.bailitop.com/case_lx/usabk/";//美国本科留学
        String urlStr = "http://www.bailitop.com/case_lx/usayjs/";
        RequestParams params = new RequestParams(urlStr);
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                // Toast.makeText(x.app(), result, Toast.LENGTH_LONG).show();
               // System.out.println(result);
                parse2NewsItem(result);
                System.out.println("xutils onSuccess");
                lvNews.deferNotifyDataSetChanged();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                // Toast.makeText(x.app(), ex.getMessage(), Toast.LENGTH_LONG).show();
                System.out.println("xutilso onError");
            }

            @Override
            public void onCancelled(Callback.CancelledException cex) {
                Toast.makeText(x.app(), "cancelled", Toast.LENGTH_LONG).show();
                System.out.println("xutilso onCancelled");
            }

            @Override
            public void onFinished() {

                System.out.println("xutilso onFinished");
            }
        });


    }

    public void parse2NewsItem(String html) {
        Document doc = Jsoup.parse(html);
        //找到div class 为contentLcon
        Element news = doc.select("div.contentLcon").first();
        //找到Tag为dt的标签，并遍历出来
        Elements allDetails = news.getElementsByTag("dt");
        //找到dtTags内的<a>里面href属性，然后遍历打印出来。

        List<String> tilesStr = new ArrayList<String>();
        List<String> contentStr = new ArrayList<String>();
        List<String> hrefStr = new ArrayList<String>();

        Elements titles = allDetails.select("a[title]");
        for (Element title : titles) {
            //System.out.println("the content of titles:" + title.attr("title").toString());
            tilesStr.add(title.attr("title").toString());
        }

        Elements hrefs = allDetails.select("a[href]");
        for (Element href : hrefs) {
            //System.out.println("the content of hrefs:" + href.attr("href").toString());
            hrefStr.add(href.attr("href").toString());
        }

        Elements briefs = news.getElementsByTag("dd");
        for (Element brief : briefs) {
            //System.out.println("the content of briefs:" + brief.text());
            contentStr.add(brief.text());
        }

        NewsItem newsItem ;
        for (int i = 0; i < tilesStr.size(); i++) {
            newsItem = new NewsItem(tilesStr.get(i),contentStr.get(i),hrefStr.get(i));
            newsObeject.add(newsItem);
        }
    }


    public class NewsAdapter extends ArrayAdapter<NewsItem> {

        private int resourceId;

        public NewsAdapter(Context context, int textViewResourceId, List<NewsItem> objects) {
            super(context, textViewResourceId, objects);
            resourceId = textViewResourceId;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            NewsItem newsItem = getItem(position);
            View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
            TextView tvContent = (TextView) view.findViewById(R.id.tv_content);
            //ImageView ivImage = (ImageView) view.findViewById(R.id.iv_image);
            tvTitle.setText(newsItem.getTitle());
            tvContent.setText(newsItem.getContent());
            return view;
        }
    }

}
