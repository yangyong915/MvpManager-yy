package com.example.yy.mvpmanager.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.yy.mvpmanager.R;
import com.example.yy.mvpmanager.di.component.DaggerMainComponent;
import com.example.yy.mvpmanager.di.module.MainModule;
import com.example.yy.mvpmanager.mvp.contract.MainContract;
import com.example.yy.mvpmanager.mvp.presenter.MainPresenter;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        ARouter.openDebug();
        ARouter.init(getApplication());
        mainPresenter.getData();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void launchActivity(Intent intent) {

    }

    @Override
    public void killMyself() {

    }

    @Override
    public void showData(String string) {
        Log.e("yy", string);
    }

    public void onClickModule1(View v) {
        ARouter.getInstance()
                .build("/test1/Test1Activity")
                .withString("name", "yangyong")
                .navigation();
    }

    public void onClickModule2(View v) {
        ARouter.getInstance()
                .build("/test2/Test2Activity")
                .withInt("age", 25)
                .navigation();
    }

    public void onClickIntercpt(View v) {
        ARouter.getInstance()
                .build("/test2/Test2Activity")
                .withInt("age", 25)
                .navigation(this, new NavCallback() {
                    @Override
                    public void onArrival(Postcard postcard) {
                        Toast.makeText(MainActivity.this, "到达了", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onInterrupt(Postcard postctestinterceptorard) {
                        Toast.makeText(MainActivity.this, "被拦截了", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
