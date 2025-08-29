package com.jmh.trading.common.config.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter @Setter
@ConfigurationProperties(prefix = "upbit")
public class UpbitProperty {

  private String url;
  private String path;
}
