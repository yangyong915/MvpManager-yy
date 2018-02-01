//package com.example.yy.mvpmanager;
//
//import dagger.Module;
//import dagger.Provides;
//
//@Module
//public class MvpModule {
//    private MvpContract.View view;
//
//    /**
//     * 构建UserModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
//     *
//     * @param view
//     */
//    public MvpModule(MvpContract.View view) {
//        this.view = view;
//    }
//
//    @ActivityScope
//    @Provides
//    MvpContract.View provideView() {
//        return this.view;
//    }
//
//    @ActivityScope
//    @Provides
//    MvpContract.Model provideModel(MainModel model) {
//        return model;
//    }
//}