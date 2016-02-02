package com.example.administrator.mymvptest.presenter;

import android.os.Handler;

import com.example.administrator.mymvptest.bean.User;
import com.example.administrator.mymvptest.biz.IUserBiz;
import com.example.administrator.mymvptest.biz.OnLoginListener;
import com.example.administrator.mymvptest.biz.UserBiz;
import com.example.administrator.mymvptest.view.IUserLoginView;

/**
 * Description :
 * Email  : bigbigpeng3@gmail.com
 * Author : peng zhang
 * Date   : 2016-2-2
 */
public class UserLoginPresenter
{
    private IUserBiz userBiz;
    private IUserLoginView userLoginView;
    private Handler mHandler = new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView)
    {
        this.userLoginView = userLoginView;
        this.userBiz = new UserBiz();
    }

    public void login()
    {
        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getPassword(), new OnLoginListener()
        {
            @Override
            public void loginSuccess(final User user)
            {
                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        userLoginView.toMainActivity(user);
                        userLoginView.hideLoading();
                    }
                });

            }

            @Override
            public void loginFailed()
            {
                //需要在UI线程执行
                mHandler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        userLoginView.showFailedError();
                        userLoginView.hideLoading();
                    }
                });

            }
        });
    }

    public void clear()
    {
        userLoginView.clearUserName();
        userLoginView.clearPassword();
    }



}