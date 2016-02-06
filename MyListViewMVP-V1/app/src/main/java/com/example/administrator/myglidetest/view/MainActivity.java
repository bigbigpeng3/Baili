package com.example.administrator.myglidetest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.administrator.myglidetest.R;
import com.example.administrator.myglidetest.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {


    private ListView lvPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPhoto = (ListView) findViewById(R.id.lv_photo);

        //将Presenter的唯一引用初始化，保证Presenter的唯一性。
        MainPresenter.MAIN_PRESENTER.setMainView(this, this);
        MainPresenter.MAIN_PRESENTER.showListView();

        // lvPhoto.setAdapter(new ImageAdapter(this, images));

    }

    @Override
    public ListView getListView() {
        return lvPhoto;
    }
}

