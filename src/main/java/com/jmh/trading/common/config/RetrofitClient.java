package com.jmh.trading.common.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class RetrofitClient {

    private final OkHttpClient okHttpClient;

    public RetrofitClient() {
        this.okHttpClient = new OkHttpClient().newBuilder()
                                              .connectionPool(new ConnectionPool(1, 1, TimeUnit.SECONDS))
                                              .readTimeout(1L, TimeUnit.SECONDS)
                                              .addInterceptor(new RetrofitInterceptor())
                                              .build();
    }

    public static Retrofit getCli(String url) {
        return new RetrofitClient().createCli(url);
    }

    private Retrofit createCli(String url) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return new Retrofit.Builder()
                           .baseUrl(url)
                           .addConverterFactory(GsonConverterFactory.create(gson))
                           .client(okHttpClient)
                           .build();
    }
}
