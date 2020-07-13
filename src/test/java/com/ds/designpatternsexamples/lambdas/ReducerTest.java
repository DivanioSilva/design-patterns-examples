package com.ds.designpatternsexamples.lambdas;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

@SpringBootTest
class ReducerTest {

    @Test
    void sum() {
        BigDecimal expected = BigDecimal.valueOf(33.3);
        BigDecimal result = Reducer.sum(BigDecimal.TEN, BigDecimal.ONE, BigDecimal.valueOf(22.3));
        assertEquals(expected, result);
    }

    @Test
    void sub() {
        BigDecimal expected = BigDecimal.ZERO;
        BigDecimal result = Reducer.sub(BigDecimal.ONE, BigDecimal.ONE);
        assertEquals(expected, result);
    }
}