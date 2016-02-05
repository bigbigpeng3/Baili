package com.example.administrator.mytextviewmvp.utils;

import android.widget.Toast;

import com.example.administrator.mytextviewmvp.presenter.TextPresenter;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;
/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-5
 */
public class xUtils {

    public static void startLoading(String url) {
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                System.out.println("xutils onSuccess");
                Toast.makeText(x.app(), result, Toast.LENGTH_LONG).show();
                TextPresenter.textPresenter.setText(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                // Toast.makeText(x.app(), ex.getMessage(), Toast.LENGTH_LONG).show();
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
}
