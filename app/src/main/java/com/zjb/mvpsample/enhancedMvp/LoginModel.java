package com.zjb.mvpsample.enhancedMvp;

import android.os.Handler;

public class LoginModel {

   public boolean request() {
       //模拟登录(Mock login)
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               //网络请求动作

           }
       }, 5000);
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       return true;
    }
}
