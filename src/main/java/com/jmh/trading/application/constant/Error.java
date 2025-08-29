package com.jmh.trading.application.constant;

import lombok.Getter;

@Getter
public enum Error {

  CANDLE_RETRIEVE_FAIL(400, "캔들 목록을 조회 실패"),
  ;

  private final int code;
  private final String msg;
  Error(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }
}
