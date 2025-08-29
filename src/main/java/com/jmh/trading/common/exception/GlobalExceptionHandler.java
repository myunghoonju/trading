package com.jmh.trading.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ApiException.class)
  private ResponseEntity<String> handleApiException(ApiException e) {
    return new ResponseEntity<>(e.getError().getMsg(), HttpStatus.OK);
  }
}
