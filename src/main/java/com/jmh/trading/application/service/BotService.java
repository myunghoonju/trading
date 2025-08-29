package com.jmh.trading.application.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@EnableScheduling
public class BotService {

    @Scheduled(fixedDelay = 3_000L)
    public void run() {
      log.info("Running BotService");
    }
}
