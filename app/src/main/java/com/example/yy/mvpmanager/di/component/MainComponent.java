package com.example.yy.mvpmanager.di.component;

import dagger.Component;

import com.example.yy.mvpmanager.di.module.MainModule;

import com.example.yy.mvpmanager.framework.scope.ActivityScope;
import com.example.yy.mvpmanager.mvp.ui.activity.MainActivity;

@ActivityScope
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}