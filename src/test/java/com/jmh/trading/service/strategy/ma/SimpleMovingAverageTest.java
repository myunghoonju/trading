package com.jmh.trading.service.strategy.ma;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleMovingAverageTest {

    @Test
    void moving_average_test() {
        DescriptiveStatistics tool = new DescriptiveStatistics(3);
        tool.addValue(10.0);
        tool.addValue(20.0);
        tool.addValue(30.0);

        assertEquals(20.0, tool.getMean());
    }
}