package com.jmh.trading.application.constant;

import lombok.Getter;

@Getter
public enum BotPositionState {

  NONE("NONE", "초기 상태 혹은 매도한 상태"),
  LONG("LONG", "매수 상태")
  ;

  private final String code;
  private final String desc;

  BotPositionState(String code, String desc) {
    this.code = code;
    this.desc = desc;
  }
}
