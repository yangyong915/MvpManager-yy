package com.example.yy.mvpmanager.di.module;

import dagger.Module;
import dagger.Provides;

import com.example.yy.mvpmanager.framework.scope.ActivityScope;
import com.example.yy.mvpmanager.mvp.contract.MainContract;
import com.example.yy.mvpmanager.mvp.model.MainModel;

import javax.inject.Singleton;


@Module
public class MainModule {
    private MainContract.View view;

    /**
     * 构建MainModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public MainModule(MainContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    MainContract.View provideMainView() {
        return this.view;
    }

    @Singleton
    @Provides
    MainContract.Model provideMainModel(MainModel model) {
        return model;
    }

//    @ActivityScope
//    @Provides
//    MainContract.Model provideMainModel() {
//        return new MainModel();
//    }
}