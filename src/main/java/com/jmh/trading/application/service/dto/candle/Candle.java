package com.jmh.trading.application.service.dto.candle;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Candle {

  private String market;

  @SerializedName("timestamp")
  private long timeStamp;

  @SerializedName("trade_price")
  private Double tradePrice;
}
