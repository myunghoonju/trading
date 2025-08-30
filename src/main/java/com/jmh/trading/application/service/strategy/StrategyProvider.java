package com.jmh.trading.application.service.strategy;

import com.jmh.trading.application.service.ClientService;
import com.jmh.trading.application.service.dto.candle.CandlesDto;
import org.springframework.beans.factory.annotation.Autowired;

import static com.jmh.trading.application.constant.Market.KRW_BTC;

public abstract class StrategyProvider {

	@Autowired
	protected ClientService client;

  protected CandlesDto candles(int longDay) {
    return client.candles(longDay, KRW_BTC.market());
  }

  protected abstract double calculate(int shortDay, int longDay);
}
