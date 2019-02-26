package com.smart.mvpdagger2retrofit.topmovies;

import android.arch.lifecycle.ViewModel;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class TopMoviesActivity extends BaseActivity implements TopMoviesActivityMVP.View{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.loadData();
    }

    @Override
    public void updateData(ViewModel viewModel) {

    }

    @Override
    public void showSnackbar(String s) {

    }
}
