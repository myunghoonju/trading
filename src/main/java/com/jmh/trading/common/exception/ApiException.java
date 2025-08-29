package com.jmh.trading.common.exception;

import com.jmh.trading.application.constant.Error;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {

  private final Error error;

  public ApiException(Error error) {
    this.error = error;
  }
}
