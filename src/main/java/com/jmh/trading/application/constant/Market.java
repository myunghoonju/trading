package com.jmh.trading.application.constant;

import lombok.Getter;

@Getter
public enum Market {

  USDT_BTC("USDT-BTC"),
  KRW_POLYX("KRW-POLYX"),
  KRW_BTC("KRW-BTC")
  ;

  private final String market;

  Market(String market) {
    this.market = market;
  }

  public String market() {
    return getMarket();
  }
}
