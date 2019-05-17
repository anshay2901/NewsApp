package com.example.newsapp.interfaces;

import android.view.View;

import com.example.newsapp.models.Status;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface NewsService {

    @GET("v2/top-headlines?country=us")
    Call<List<Status>> getSources();

}



/*
    news api: 6b84f986507b44bba546178efdd2d435
 */