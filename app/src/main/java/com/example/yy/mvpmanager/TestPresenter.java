package com.example.yy.mvpmanager;

import javax.inject.Inject;

/**
 * Created by yy on 2018/1/31.
 * 描述：
 */

public class TestPresenter {
    String temp;

    @Inject
    public TestPresenter() {
        temp = "测试数据";
    }

    public String toString() {
        return temp;
    }
}
