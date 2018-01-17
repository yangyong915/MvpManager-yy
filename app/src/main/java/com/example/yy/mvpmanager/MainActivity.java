package com.example.yy.mvpmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * crate by yy on 2018-1-17
 * describle:mvp架构案例
 */
public class MainActivity extends AppCompatActivity implements MvpContract.View {

    MvpContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MvpPresenter(this);
        presenter.start();
    }

    @Override
    public void showData(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(MvpContract.Presenter presenter) {

    }
}
