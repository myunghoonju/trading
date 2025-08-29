package com.jmh.trading.application.service.api;

import com.jmh.trading.application.service.dto.candle.Candle;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

import java.util.List;

public interface TradeApiClient {

  @GET
  Call<List<Candle>> candles(@Url String path,
                             @Query("count") int count,
                             @Query("market") String market);
}
