package com.example.administrator.myjsouptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    //String result1 = null;

    TextView textView;
    TextView tvTtile;
    TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.tv_html);
        tvTtile = (TextView) findViewById(R.id.tv_title);
        tvTime = (TextView) findViewById(R.id.tv_time);


        x.Ext.init(getApplication());

        //http://www.bailitop.com/case_lx/20150618/3429.html
        //http://see.xidian.edu.cn/index.php/news/click/id/7428

        String urlStr = "http://www.bailitop.com/case_lx/20150618/3429.html";
        RequestParams params = new RequestParams(urlStr);
        // params.setSslSocketFactory(...); // 设置ssl
        // params.addQueryStringParameter("wd", "xUtils");
        x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onSuccess(String result) {
                Toast.makeText(x.app(), result, Toast.LENGTH_LONG).show();
                System.out.println(result);
                parse(result);
                System.out.println("xutils onSuccess");
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(x.app(), ex.getMessage(), Toast.LENGTH_LONG).show();
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

    public void parse(String html) {

        Document doc = Jsoup.parse(html);
        System.out.println("doc" + doc);

        //标题
        Elements title = doc.getElementsByTag("title");
        System.out.println("title + " + title.text());
        tvTtile.setText(title.text());

        //时间

        Elements time = doc.getElementsByClass("tm");
        System.out.println("time + " + time.text());
        textView.setText(time.text() + "\n");

        //内容
        Elements content = doc.getElementsByClass("centershow");
        System.out.println("content + " + content.get(0).text());
        tvTime.setText(content.get(0).text());
    }

}
