package com.example.administrator.myglidetest.presenter;

import android.content.Context;
import android.widget.ListView;

import com.example.administrator.myglidetest.adapter.ImageAdapter;
import com.example.administrator.myglidetest.Model.ImageModeImp;
import com.example.administrator.myglidetest.Model.ImageModel;
import com.example.administrator.myglidetest.view.MainView;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-6
 */
public class MainPresenter {


    public static final MainPresenter MAIN_PRESENTER = new MainPresenter();

    //创建一个ImageModelImp对象，然后在后面调用它的方法
    ImageModel imageModel = new ImageModeImp();

    MainView mainView;
    Context context;
    ListView lvPhoto;

    //需要从MainView中获得Context, MainView的实现，ListView控件
    public void setMainView(Context context, MainView mainView) {
        this.mainView = mainView;
        this.context = context;
        lvPhoto = mainView.getListView();
    }

    //首先初始化ModelImp中的数据，然后给ListView设置Adapter
    public void showListView() {
        imageModel.getData();
        lvPhoto.setAdapter(new ImageAdapter(context, ImageModeImp.images));
    }
}
