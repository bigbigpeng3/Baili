package com.me.www.myhtmldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnText;
    private Button btnWeb;
    private Button btnWebAdjust;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnText = (Button) findViewById(R.id.btn_text);
        btnWeb = (Button) findViewById(R.id.btn_web);
        btnWebAdjust = (Button) findViewById(R.id.btn_web_adjust);

        btnText.setOnClickListener(this);
        btnWeb.setOnClickListener(this);
        btnWebAdjust.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == btnText){
            go2Where(TextViewActivity.class);
        }else if (view == btnWeb){
            go2Where(WebViewActivity.class);
        }else if (view == btnWebAdjust){
            go2Where(WebViewAdjustActivity.class);
        }
    }

    private void go2Where(Class clzss){
        Intent intent = new Intent(this,clzss);
        startActivity(intent);
    }
}
