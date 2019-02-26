package com.smart.mvpdagger2retrofit.http;



import com.smart.mvpdagger2retrofit.http.apimodel.OmdbApi;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MoreInfoApiService {

    @GET("/")
    Observable <OmdbApi> getCountry(@Query("t") String title);
}
