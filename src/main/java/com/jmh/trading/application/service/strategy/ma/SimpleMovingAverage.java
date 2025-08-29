package com.jmh.trading.application.service.strategy.ma;

import com.jmh.trading.application.service.dto.candle.CandlesDto;
import com.jmh.trading.application.service.strategy.StrategyProvider;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SimpleMovingAverage extends StrategyProvider {

    @Override
    public String calculate() {
      Map<String, CandlesDto> candles = candles();
      return "> " + candles.get("ma5").getCandles().get(0).getTradePrice();
    }
}
