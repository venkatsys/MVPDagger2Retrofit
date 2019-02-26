package com.smart.mvpdagger2retrofit.topmovies;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.smart.mvpdagger2retrofit.root.App;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    TopMoviesActivityMVP.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((App) getApplication()).getComponent().inject(this);
    }
}
