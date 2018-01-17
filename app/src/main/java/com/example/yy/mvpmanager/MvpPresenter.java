package com.example.yy.mvpmanager;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;

import static android.support.v4.util.Preconditions.checkNotNull;

/**
 * Created by yy on 2018/1/15.
 * 描述：
 */

public class MvpPresenter implements MvpContract.Presenter {
    MvpContract.View mView;
    MvpModel mvpModel;

    @SuppressLint("RestrictedApi")
    public MvpPresenter(@NonNull MvpContract.View mvpView) {
        mView = checkNotNull(mvpView);
        mvpModel = new MvpModel();
        mView.setPresenter(this);
    }

    @Override
    public void getData() {
        mvpModel.getTasks("001", new TasksDataSource.GetDataCallBack() {
            @Override
            public void onDataLoad(String result) {
                mView.showData(result);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Override
    public void start() {
        getData();
    }
}
