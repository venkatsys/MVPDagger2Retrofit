package com.smart.mvpdagger2retrofit.topmovies;

import com.smart.mvpdagger2retrofit.http.apimodel.Result;

import rx.Observable;

public interface Repository {
    Observable<Result>  getResultsFromMemory();
    Observable<Result> getResultsFromNetwork();
    Observable<String> getCountriesFromMemory();
    Observable<String> getCountriesFromNetwork();
    Observable<String> getCountryData();
    Observable<Result> getResultData();
}
