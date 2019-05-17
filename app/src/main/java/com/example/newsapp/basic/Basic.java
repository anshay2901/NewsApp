package com.example.newsapp.basic;

import com.example.newsapp.Remote.RetrofitClient;
import com.example.newsapp.interfaces.NewsService;

public class Basic {

    public static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY = "6b84f986507b44bba546178efdd2d435";

    public static NewsService getNewsService() {

        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);

    }


}
