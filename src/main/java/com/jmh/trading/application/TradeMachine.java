package com.jmh.trading.application;

import com.jmh.trading.application.service.strategy.ma.SimpleMovingAverage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@EnableScheduling
public class TradeMachine {

    private final SimpleMovingAverage simpleMovingAverage;

    public TradeMachine(SimpleMovingAverage simpleMovingAverage) {
      this.simpleMovingAverage = simpleMovingAverage;
    }

    @Scheduled(fixedDelay = 3_000L)
    public void work() {
      String calculate = simpleMovingAverage.calculate();
      log.info("Running BotService" + calculate);
    }
}
