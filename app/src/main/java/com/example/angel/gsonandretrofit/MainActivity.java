package com.example.angel.gsonandretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import  com.example.angel.gsonandretrofit.*;
import com.example.angel.gsonandretrofit.API.VariablesGlobales;
import com.example.angel.gsonandretrofit.Models.City;
import com.example.angel.gsonandretrofit.Services.getWeatherService;
import com.example.angel.gsonandretrofit.Services.weatherService ;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = getWeatherService.getRetrofit();
        weatherService service = retrofit.create(weatherService.class);
        Call<City> cityCall = service.getWeather("London,UK",VariablesGlobales.KEY_API);

        cityCall.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                City city = response.body();
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_LONG).show();
            }
        });


    }
}
