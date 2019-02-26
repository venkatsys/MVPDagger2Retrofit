package com.smart.mvpdagger2retrofit.root;


import com.smart.mvpdagger2retrofit.http.ApiModuleForInfo;
import com.smart.mvpdagger2retrofit.http.ApiModuleForName;
import com.smart.mvpdagger2retrofit.topmovies.BaseActivity;
import com.smart.mvpdagger2retrofit.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class,TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(BaseActivity target);

}
