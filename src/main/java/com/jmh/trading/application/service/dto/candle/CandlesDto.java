package com.jmh.trading.application.service.dto.candle;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

@Getter @Setter
@NoArgsConstructor
public class CandlesDto {

  private List<Candle> candles = new ArrayList<>();

  @Builder
  public CandlesDto(List<Candle> candles) {
    this.candles = candles;
  }

  public static CandlesDto of(List<Candle> candles) {
    if (isEmpty(candles)) {
      return null;
    }

    candles.sort(Comparator.comparingLong(Candle::getTimeStamp));

    return CandlesDto.builder()
                     .candles(candles)
                     .build();
  }
}
