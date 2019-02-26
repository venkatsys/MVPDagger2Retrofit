package com.smart.mvpdagger2retrofit.topmovies;


import android.arch.lifecycle.ViewModel;

import rx.Observable;

public interface TopMoviesActivityMVP {

    interface View{
        void updateData(ViewModel viewModel);
        void showSnackbar(String s);
    }

    interface Presenter{
        void loadData();
        void rxUnsubscribe();
        void setView(TopMoviesActivityMVP.View view);
    }

    interface Model{
        Observable<ViewModel> result();
    }
}
