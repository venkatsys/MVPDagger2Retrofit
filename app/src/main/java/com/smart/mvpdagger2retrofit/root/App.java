package com.smart.mvpdagger2retrofit.root;

import android.app.Application;

import com.smart.mvpdagger2retrofit.http.ApiModuleForInfo;
import com.smart.mvpdagger2retrofit.http.ApiModuleForName;
import com.smart.mvpdagger2retrofit.topmovies.TopMoviesModule;


public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
