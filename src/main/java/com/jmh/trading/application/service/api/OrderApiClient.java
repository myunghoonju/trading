package com.jmh.trading.application.service.api;

import com.jmh.trading.application.service.dto.OrderRequestDto;
import com.jmh.trading.application.service.dto.OrderResponseDto;
import retrofit2.Call;
import retrofit2.http.POST;

// FIXME fake api
public interface OrderApiClient {

  @POST("/order")
  Call<OrderResponseDto> placeOrder(OrderRequestDto orderRequestDto);
}
