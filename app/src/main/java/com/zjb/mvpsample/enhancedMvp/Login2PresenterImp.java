package com.zjb.mvpsample.enhancedMvp;


/**
 * Copyright (C) 2017  ben
 *
 * @author ben
 * @version 1.0
 * @createDate 2017/7/5 10:40
 * @description
 */

public class Login2PresenterImp extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    @Override
    public void login(final String userName, String passWord) throws InterruptedException {
        final LoginContract.View view = getView();
        boolean request = new LoginModel().request();
        if (request) {
                    view.loginSuccess("登陆成功，账号" + userName);
                } else {
                    view.loginFailed("-1", "登陆失败，账号" + userName);
                }

//        //模拟登录(Mock login)
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                boolean isSuccess = true;//登陆成功
//                if (view == null) {
//                    return;
//                }
//                if (isSuccess) {
//                    view.loginSuccess("登陆成功，账号" + userName);
//                } else {
//                    view.loginFailed("-1", "登陆失败，账号" + userName);
//                }
//            }
//        }, 2000);



    }
}
