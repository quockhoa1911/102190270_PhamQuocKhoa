package com.example.a102190270_phamquockhoa.viewmodel;

import java.time.temporal.Temporal;
import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface Api {

    @GET("DevTides/DogsApi/master/dogs.json")
    public Single<List<Temporal>> getDogs();
}
