package com.example.yy.mvpmanager;

import android.support.annotation.NonNull;

/**
 * Created by yy on 2018/1/17.
 * 描述：model层和presenter交互接口
 */

public interface TasksDataSource {

    interface GetDataCallBack {

        void onDataLoad(String result);

        void onDataNotAvailable();
    }

    void getTasks(@NonNull String id, @NonNull GetDataCallBack callback);

}
