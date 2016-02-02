package com.example.administrator.mymvptest.biz;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-2
 */
public interface IUserBiz {

    public void login(String username, String password, OnLoginListener loginListener);

}
