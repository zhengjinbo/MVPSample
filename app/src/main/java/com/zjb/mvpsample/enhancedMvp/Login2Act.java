package com.zjb.mvpsample.enhancedMvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zjb.mvpsample.R;

public class Login2Act extends MVPBaseActivity<LoginContract.View, Login2PresenterImp> implements LoginContract.View {
    private final static String TAG = Login2Act.class.getSimpleName();

    private EditText userName, passWord;
    private Button btnLogin;
    private Activity mAct;
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_login:  //登陆
                    if (mPresenter != null) {
                        btnLogin.setText("Loginning ...");
                        try {
                            mPresenter.login(userName.getText().toString(), passWord.getText().toString());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        mAct = this;
        userName = (EditText) findViewById(R.id.et_user_name);
        passWord = (EditText) findViewById(R.id.et_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(clickListener);
    }

    @Override
    protected Login2PresenterImp createPresenter() {
        return new Login2PresenterImp();
    }

    @Override
    public void loginSuccess(String responseStr) {
        btnLogin.setText(responseStr);
        Toast.makeText(mAct, responseStr, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed(String code, String errBody) {
        btnLogin.setText("code"+code +"///////"+errBody);
        Toast.makeText(mAct, errBody, Toast.LENGTH_SHORT).show();
    }
}
