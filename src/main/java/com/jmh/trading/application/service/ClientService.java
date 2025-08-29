package com.jmh.trading.application.service;

import com.jmh.trading.application.service.api.TradeApiClient;
import com.jmh.trading.application.service.dto.candle.CandlesDto;
import com.jmh.trading.common.config.RetrofitClient;
import com.jmh.trading.common.config.property.UpbitProperty;
import com.jmh.trading.common.exception.ApiException;
import org.springframework.stereotype.Service;

import static com.jmh.trading.application.constant.Error.CANDLE_RETRIEVE_FAIL;

@Service
public class ClientService {

  private final UpbitProperty upbit;

  public ClientService(UpbitProperty upbit) {
    this.upbit = upbit;
  }

  public CandlesDto candles(int days, String market) {
    TradeApiClient client = RetrofitClient.getCli(upbit.getUrl())
                                          .create(TradeApiClient.class);
    try {
      return CandlesDto.of(client.candles(upbit.getPath(), days, market)
                                 .execute()
                                 .body());
    } catch (Exception e) {
      throw new ApiException(CANDLE_RETRIEVE_FAIL);
    }
  }
}
