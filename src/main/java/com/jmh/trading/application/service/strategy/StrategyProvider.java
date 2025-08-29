package com.jmh.trading.application.service.strategy;

public abstract class StrategyProvider {

    public String candles() {
        return "data";
    }

    public abstract String calculate();
}
