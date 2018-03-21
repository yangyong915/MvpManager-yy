package com.example.yy.mvpmanager.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.yy.mvpmanager.R;
import com.example.yy.mvpmanager.di.component.DaggerMainComponent;
import com.example.yy.mvpmanager.di.module.MainModule;
import com.example.yy.mvpmanager.mvp.contract.MainContract;
import com.example.yy.mvpmanager.mvp.presenter.MainPresenter;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainPresenter MainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        MainPresenter.getData();
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
}
