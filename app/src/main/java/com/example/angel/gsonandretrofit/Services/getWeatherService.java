package com.example.angel.gsonandretrofit.Services;
import com.example.angel.gsonandretrofit.API.VariablesGlobales;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getWeatherService {

    public static Retrofit getRetrofit(){
        if (VariablesGlobales.retrofit==null){
            VariablesGlobales.retrofit = new Retrofit.Builder()
                    .baseUrl(VariablesGlobales.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return VariablesGlobales.retrofit;
    }
}
