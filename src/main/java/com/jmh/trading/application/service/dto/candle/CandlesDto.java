package com.jmh.trading.application.service.dto.candle;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class CandlesDto {

  private List<Candle> candles = new ArrayList<>();

  @Builder
  public CandlesDto(List<Candle> candles) {
    this.candles = candles;
  }

  public static CandlesDto of(List<Candle> candles) {
    return CandlesDto.builder().candles(candles).build();
  }
}
