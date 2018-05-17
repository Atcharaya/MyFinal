package com.example.asus.myfinal.service;

import com.example.asus.myfinal.model.PhotoDao;
import com.example.asus.myfinal.model.UserdataDao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ASUS on 17/5/2561.
 */

public interface ApiService {
    @GET("users")
    Call<List<UserdataDao>> getuserdata();

    @GET("photos")
    Call<List<PhotoDao>> getphotodata();
}
