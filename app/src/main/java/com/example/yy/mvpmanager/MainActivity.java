package com.example.yy.mvpmanager;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.AndroidInjector;

/**
 * crate by yy on 2018-1-17
 * describle:mvp架构案例
 */
public class MainActivity extends AppCompatActivity implements MvpContract.View {

    @Inject
    TestPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerMainActivityComponent.create().inject(this);
        setContentView(R.layout.activity_main);
        presenter.toString();
    }

    @Override
    public void showData(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showload() {

    }
}
