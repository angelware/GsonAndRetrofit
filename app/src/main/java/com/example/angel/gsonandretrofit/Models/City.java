package com.example.angel.gsonandretrofit.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class City {
    private String name;
    private Integer cod;
    private List<weather> weather;


    public City(String name,Integer cod, List<weather> weather){
        this.name=name;
        this.cod=cod;
        this.weather=weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return cod;
    }

    public void setCode(Integer code) {
        this.cod = code;
    }

    public List<com.example.angel.gsonandretrofit.Models.weather> getWeather() {
        return weather;
    }

    public void setWeather(List<com.example.angel.gsonandretrofit.Models.weather> weather) {
        this.weather = weather;
    }



    public static weather parseJSON(String response){
       Gson gson = new GsonBuilder().create();
        weather weather = gson.fromJson(response, com.example.angel.gsonandretrofit.Models.weather.class);
        return weather;
    }

}
