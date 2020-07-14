package com.ds.lambdas;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;

@SpringBootTest
class ReducerTest {

    @Test
    void sumTest() {
        BigDecimal expected = BigDecimal.valueOf(33.3);
        BigDecimal result = Reducer.sum(BigDecimal.TEN, BigDecimal.ONE, BigDecimal.valueOf(22.3));
        assertEquals(expected, result);
    }

    @Test
    void sumTest2() {
        BigDecimal expected = BigDecimal.valueOf(33.3);
        BigDecimal result = Reducer.sum(BigDecimal.valueOf(33.3));
        assertEquals(expected, result);
    }

    @Test
    void subTest() {
        BigDecimal expected = BigDecimal.ZERO;
        BigDecimal result = Reducer.sub(BigDecimal.ONE, BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void subTest2() {
        BigDecimal expected = BigDecimal.ONE;
        BigDecimal result = Reducer.sub(BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void subTest3() {
        BigDecimal expected = BigDecimal.ONE;
        BigDecimal result = Reducer.sub(BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void sub2Test() {
        BigDecimal expected = BigDecimal.valueOf(3);
        BigDecimal result = Reducer.sub(BigDecimal.valueOf(4), BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void subTest_Fail() {
        BigDecimal expected = BigDecimal.valueOf(3);
        BigDecimal result = Reducer.sub(BigDecimal.valueOf(5), BigDecimal.ONE);
        assertNotEquals(expected, result);
    }

    @Test
    void multiplyTest(){
        BigDecimal expected = BigDecimal.valueOf(100);
        BigDecimal result = Reducer.multiply(BigDecimal.TEN, BigDecimal.TEN);
        assertEquals(expected, result);
    }

    @Test
    void division(){
        BigDecimal expected = BigDecimal.valueOf(10);
        BigDecimal result = Reducer.division(BigDecimal.valueOf(100), BigDecimal.TEN);
        assertEquals(expected, result);
    }
}