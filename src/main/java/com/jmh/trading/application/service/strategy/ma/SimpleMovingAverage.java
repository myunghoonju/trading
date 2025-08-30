package com.jmh.trading.application.service.strategy.ma;

import com.jmh.trading.application.service.dto.candle.Candle;
import com.jmh.trading.application.service.strategy.StrategyProvider;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimpleMovingAverage extends StrategyProvider {

    @Override
    public double calculate(int shortDay, int longDay) {
      return goldenCross(shortDay, longDay, candles(longDay).getCandles());
    }

    private double goldenCross(int shortDay,
                                int longDay,
                                List<Candle> candles) {
      Double currentShort = movingAverage(shortDay, candles);
      Double currentLong = movingAverage(longDay, candles);

      candles.remove(candles.size() - 1);
      Double prevShort = movingAverage(shortDay, candles);
      Double prevLong = movingAverage(longDay, candles);

      if (prevShort <= prevLong &&
          currentShort > currentLong) {
        return 1;
      }

      return 0;
    }

    private Double movingAverage(int period, List<Candle> candles) {
      DescriptiveStatistics stats = new DescriptiveStatistics(period);
      for (int i = candles.size() - 1; i >= candles.size() - period; i--) {
        stats.addValue(candles.get(i).getTradePrice());
      }

      return stats.getMean();
  }
}
