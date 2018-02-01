package com.example.yy.mvpmanager;


import com.example.yy.mvpmanager.base.BaseModule;
import com.example.yy.mvpmanager.base.BaseView;

/**
 * Created by yy on 2018/1/15.
 * 描述：
 */

public interface MvpContract {

    interface View extends BaseView {
        void showData(String data);
    }

    interface Model extends BaseModule {
        void getData();
    }
}
