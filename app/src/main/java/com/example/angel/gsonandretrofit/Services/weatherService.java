package com.example.angel.gsonandretrofit.Services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.angel.gsonandretrofit.Models.*;
import java.util.List;

public interface weatherService {
    @GET("2.5/weather?q=London,uk")
    Call <City> getWeather(@Query("q") String City,@Query("APPID") String ApiKey);

}
