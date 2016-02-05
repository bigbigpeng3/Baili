package com.example.administrator.mytextviewmvp.presenter;

import android.os.Handler;

import com.example.administrator.mytextviewmvp.model.ITextModel;
import com.example.administrator.mytextviewmvp.model.TextModel;
import com.example.administrator.mytextviewmvp.view.MainView;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-5
 */
public class TextPresenter {

    MainView mainView;

    public static final TextPresenter textPresenter = new TextPresenter();

    ITextModel iTextModel = new TextModel();

    Handler mHandler = new Handler();

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }

    public void startLoad() {
        iTextModel.getText();
    }

    public void setText(final String text) {

        mHandler.post(new Runnable() {
            @Override
            public void run() {
                mainView.setText(text);
            }
        });

    }


}
