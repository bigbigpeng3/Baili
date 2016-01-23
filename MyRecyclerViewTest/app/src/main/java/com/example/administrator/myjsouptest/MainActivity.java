package com.example.administrator.myjsouptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.sufficientlysecure.htmltextview.HtmlTextView;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    //String result1 = null;

    HtmlTextView textView;
    TextView tvTtile;
    TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        textView = (HtmlTextView) findViewById(R.id.tv_html);
        tvTtile = (TextView) findViewById(R.id.tv_title);
        tvTime = (TextView) findViewById(R.id.tv_time);


        x.Ext.init(getApplication());

        //http://www.bailitop.com/case_lx/20150618/3429.html
        //http://see.xidian.edu.cn/index.php/news/click/id/7428

        //String urlStr = "http://www.bailitop.com/case_lx/20150618/3429.html";

        Intent intent = getIntent();
        String urlStr = intent.getStringExtra("href");

        RequestParams params = new RequestParams(urlStr);
        // params.setSslSocketFactory(...); // 设置ssl
        // params.addQueryStringParameter("wd", "xUtils");
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                parse2Content(result);
                System.out.println("xutils onSuccess");
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                System.out.println("xutilso onError");
            }

            @Override
            public void onCancelled(Callback.CancelledException cex) {
                System.out.println("xutilso onCancelled");
            }

            @Override
            public void onFinished() {
                System.out.println("xutilso onFinished");
            }
        });


    }


    public void parse2Content(String html) {

        Document doc = Jsoup.parse(html);
        //可以通过这个方式打印在控制台上，方便查找节点的ID和Class
        //System.out.println("doc" + doc);
        //标题
        Elements title = doc.getElementsByTag("title");
       // System.out.println("title + " + title.text());
        tvTtile.setText(title.text());

        //时间
        Elements time = doc.getElementsByClass("tm");
       // System.out.println("time + " + time.text());
       tvTime.setText(time.text() + "\n");

        //内容
        Elements content = doc.getElementsByClass("centershow");
       // System.out.println("content + " + content.get(0).text());
        textView.setHtmlFromString(content.get(0).toString(),new HtmlTextView.RemoteImageGetter());
       // textView.setHtmlFromString(html,new HtmlTextView.RemoteImageGetter());

       // textView.setText(content.get(0).text());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
