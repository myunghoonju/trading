package com.jmh.trading.common.config.property;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//TODO
// add more settings
@Configuration
@ConfigurationPropertiesScan
public class PropertyConfig {

  private final UpbitProperty upbit;

  public PropertyConfig(UpbitProperty upbit) {
    this.upbit = upbit;
  }

  @Bean
  public UpbitProperty upbit() {
    return upbit;
  }
}
