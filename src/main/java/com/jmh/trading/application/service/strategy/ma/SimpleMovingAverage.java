package com.jmh.trading.application.service.strategy.ma;

import com.jmh.trading.application.service.strategy.StrategyProvider;

public class SimpleMovingAverage extends StrategyProvider {

    @Override
    public String calculate() {
        String data = candles();
        return "";
    }
}
