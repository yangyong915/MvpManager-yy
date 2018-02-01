package com.example.yy.mvpmanager;

import dagger.Component;

/**
 * Created by yy on 2018/1/31.
 * 描述：
 */
@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
