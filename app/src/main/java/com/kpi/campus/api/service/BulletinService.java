package com.kpi.campus.api.service;

import com.kpi.campus.model.Bulletin;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import rx.Observable;

/**
 * Created by Administrator on 21.03.2016.
 */
public interface BulletinService {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET("/account/info")
    Observable<List<Bulletin>> getBulletins(@Header("Authorization") String authorization);

}
