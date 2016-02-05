package com.example.administrator.mytextviewmvp.utils;

import com.example.administrator.mytextviewmvp.commons.Urls;
import com.example.administrator.mytextviewmvp.presenter.TextPresenter;
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
public class OkhttpUtils {

    //创建okHttpClient对象
    public static final OkHttpClient mOkHttpClient = new OkHttpClient();

    public static void startLoading(String url) {

        //创建一个Request
        final Request request = new Request.Builder()
                .url(url)
                .build();

        //new call
        Call call = mOkHttpClient.newCall(request);

        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(final Response response) throws IOException {

                TextPresenter.textPresenter.setText(response.body().string());

            }
        });

    }




}
