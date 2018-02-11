package com.example.yy.mvpmanager;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * crate by yy on 2018-1-17
 * describle:mvp架构案例
 */
public class MainActivity extends AppCompatActivity implements MvpContract.View {

    MvpContract.Presenter presenter;
    String ACTIVITY_ALIAS_1 = "com.example.yy.mvpmanager.ActivityAlias1";
    String ACTIVITY_ALIAS_2 = "com.example.yy.mvpmanager.ActivityAlias2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MvpPresenter(this);

        ///模拟网络推送消息的过程，其实这个应该放在一个service里面悄悄运行的，我就不演示了
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                IconUtil.setIcon(ACTIVITY_ALIAS_2, getApplication());
            }
        }, 3000);

    }

    @Override
    public void showData(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(MvpContract.Presenter presenter) {
        if (presenter == null) {
            this.presenter = presenter;
        }
    }

}
