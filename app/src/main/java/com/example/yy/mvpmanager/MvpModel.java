package com.example.yy.mvpmanager;

import android.support.annotation.NonNull;

/**
 * Created by yy on 2018/1/16.
 * 描述：数据访问操作
 */

public class MvpModel implements TasksDataSource {
    @Override
    public void getTasks(@NonNull String id, @NonNull GetDataCallBack callback) {
        //执行数据的获取操作，从网络获取数据或者本地数据库获取数据
        //retrofit+okhttp、okgo、volley 等网络框架

        callback.onDataLoad("我是来自model层的数据");
    }
}
