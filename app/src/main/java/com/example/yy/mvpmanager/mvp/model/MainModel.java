package com.example.yy.mvpmanager.mvp.model;

import javax.inject.Inject;

import com.example.yy.mvpmanager.framework.scope.ActivityScope;
import com.example.yy.mvpmanager.mvp.contract.MainContract;


@ActivityScope
public class MainModel implements MainContract.Model {

    @Inject
    public MainModel() {
        //获取网络数据或者缓存数据
    }

    @Override
    public void onDestroy() {
    }

    @Override
    public String getData() {
        return "来自model层得数据";
    }
}