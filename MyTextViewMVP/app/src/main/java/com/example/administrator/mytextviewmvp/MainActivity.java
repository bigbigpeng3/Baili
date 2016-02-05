package com.example.administrator.mytextviewmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.mytextviewmvp.presenter.TextPresenter;
import com.example.administrator.mytextviewmvp.view.MainView;

import org.xutils.x;

public class MainActivity extends AppCompatActivity implements MainView{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv_text);

        //不使用xUtils可以注释这一条
        x.Ext.init(getApplication());
        //利用中间人来直接实现从网络获取的文字直接显示在TextView上
        TextPresenter.textPresenter.setMainView(this);
        TextPresenter.textPresenter.startLoad();

    }

    @Override
    public void setText(String text) {
        textView.setText(text);
    }

}
