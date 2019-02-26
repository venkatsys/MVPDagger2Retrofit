package com.smart.mvpdagger2retrofit.http;



import com.smart.mvpdagger2retrofit.http.apimodel.TopRated;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MovieApiService {
    @GET("top_rated")
    Observable<TopRated> getTopRatedMovies(@Query("page") Integer page);
}
