package com.example.administrator.mytextviewmvp.model;

import com.example.administrator.mytextviewmvp.commons.Urls;
import com.example.administrator.mytextviewmvp.presenter.TextPresenter;
import com.example.administrator.mytextviewmvp.utils.OkhttpUtils;
import com.example.administrator.mytextviewmvp.utils.xUtils;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


import java.io.IOException;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-5
 */
public class TextModel implements ITextModel {


    @Override
    public void getText() {

        //使用okhttp
       OkhttpUtils.startLoading(Urls.imageUrl);

        //使用xUtils
       // xUtils.startLoading(Urls.imageUrl);
    }
}
