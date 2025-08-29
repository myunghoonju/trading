package com.jmh.trading.application.constant;

import lombok.Getter;

@Getter
public enum OrderSide {

  BUY("BUY", "매도"),
  SELL("SEL", "매수")
  ;
  private final String code;
  private final String desc;
  OrderSide(String code, String desc) {
    this.code = code;
    this.desc = desc;
  }
}
