package com.example.administrator.mymvptest.view;

import com.example.administrator.mymvptest.bean.User;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-2
 */
public interface IUserLoginView {

    String getUserName();

    String getPassword();

    void clearUserName();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
