package com.example.administrator.mymvptest.biz;

import com.example.administrator.mymvptest.bean.User;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-2
 */
public interface OnLoginListener {

    void loginSuccess(User user);

    void loginFailed();
}
