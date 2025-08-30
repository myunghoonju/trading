package com.jmh.trading.application.service.strategy.bb;

import com.jmh.trading.application.service.dto.candle.CandlesDto;
import com.jmh.trading.application.service.strategy.StrategyProvider;
import org.springframework.stereotype.Service;

@Service
public class SellingStrategy extends StrategyProvider {

    @Override
    public double calculate(int shortDay, int longDay) {
      CandlesDto data = candles(longDay);
      return 0.0;
    }
}
