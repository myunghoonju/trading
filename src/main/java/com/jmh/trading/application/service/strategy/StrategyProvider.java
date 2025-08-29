package com.jmh.trading.application.service.strategy;

import com.jmh.trading.application.service.ClientService;
import com.jmh.trading.application.service.dto.candle.CandlesDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static com.jmh.trading.application.constant.Market.KRW_BTC;

public abstract class StrategyProvider {

    @Autowired
    protected ClientService client;

  protected Map<String, CandlesDto> candles() {
      CandlesDto ma5 = client.candles(5, KRW_BTC.getMarket());
      CandlesDto ma20 = client.candles(20, KRW_BTC.getMarket());

      return Map.of("ma5", ma5, "ma20", ma20);
    }

  protected abstract String calculate();
}
