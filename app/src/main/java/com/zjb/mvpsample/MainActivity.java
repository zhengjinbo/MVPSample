package com.zjb.mvpsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zjb.mvpsample.enhancedMvp.Login2Act;

public class MainActivity extends BaseActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private MainActivity mAct;
    private View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.btn2:
                    Intent intent2 = new Intent(mAct, Login2Act.class);
                    startActivity(intent2);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mAct = this;
        Button btnMvpEnhance = (Button) findViewById(R.id.btn2);
        btnMvpEnhance.setOnClickListener(viewClickListener);
    }
}
