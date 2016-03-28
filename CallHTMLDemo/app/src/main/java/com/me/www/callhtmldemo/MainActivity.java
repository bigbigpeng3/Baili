package com.me.www.callhtmldemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    private Button mBtn;
    private Button mBtnChange;
    private String test;
    private String str;

    @SuppressLint({ "JavascriptInterface", "SetJavaScriptEnabled" })

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str = "http://192.168.32.71:8080/html/test.html";
        test = "http://www.jianshu.com/p/897d9e3bc783";

        mWebView = (WebView) findViewById(R.id.web);
        mBtn = (Button) findViewById(R.id.btn);
        mBtnChange = (Button) findViewById(R.id.btn_change_url);
        //mWebView
        //mWebView.getSettings().setDefaultTextEncodingName("UTF-8");

        //支持js
        mWebView.getSettings().setJavaScriptEnabled(true);

        //设置本地调用对象及其接口
        mWebView.addJavascriptInterface(new JavaScriptObject(this), "myObj");
        //载入js
        //mWebView.loadUrl(str);//这种写法可以正确解码
        mWebView.loadUrl(str);
        //点击调用js中方法
        mBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mWebView.loadUrl("javascript:funFromjs('apple')");
                Toast.makeText(MainActivity.this, "调用javascript:funFromjs()", Toast.LENGTH_LONG).show();
            }
        });

        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWebView.loadUrl(test);
            }
        });

    }

    public class JavaScriptObject {
        Context mContxt;

        public JavaScriptObject(Context mContxt) {
            this.mContxt = mContxt;
        }
        @JavascriptInterface //sdk17版本以上加上注解
        public void fun1FromAndroid(String name) {
            Toast.makeText(mContxt, name, Toast.LENGTH_LONG).show();
        }
        @JavascriptInterface
        public void fun2(String name) {
            Toast.makeText(mContxt, "调用fun2:" + name, Toast.LENGTH_SHORT).show();
        }
    }
}


