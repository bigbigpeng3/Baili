package com.me.www.myhtmldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView = (WebView) findViewById(R.id.web_view);


        webView.getSettings().setDefaultTextEncodingName("UTF -8");
        webView.loadData(HTMLString.strHTML3, "text/html; charset=UTF-8", null);//这种写法可以正确解码

    }
}
