package com.example.yy.mvpmanager.mvp.presenter;

import javax.inject.Inject;

import com.example.yy.mvpmanager.framework.scope.ActivityScope;
import com.example.yy.mvpmanager.mvp.contract.MainContract;

@ActivityScope
public class MainPresenter {
    @Inject
    MainContract.Model mModel;
    @Inject
    MainContract.View mRootView;

    @Inject
    public MainPresenter(MainContract.Model model, MainContract.View rootView) {
        this.mModel = model;
        this.mRootView = rootView;
    }

    /**
     * 获取数据
     */
    public void getData() {
        mRootView.showData(mModel.getData());
    }
}
