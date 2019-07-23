package com.zjb.mvpsample.enhancedMvp;

/**
 * Created by root1 on 2017/10/19.
 */

public interface LoginContract {

    public interface View {
        void loginSuccess(String responseStr);

        void loginFailed(String code, String errBody);
    }

    public interface Presenter {
        void login(String userName, String passWord) throws InterruptedException;
    }



}
