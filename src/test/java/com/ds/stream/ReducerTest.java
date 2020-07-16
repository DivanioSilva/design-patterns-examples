package com.ds.stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
class ReducerTest {

    @Autowired
    private Reducer reducer;

    @Test
    void sumTest() {
        BigDecimal expected = BigDecimal.valueOf(33.3);
        BigDecimal result = reducer.sum(BigDecimal.TEN, BigDecimal.ONE, BigDecimal.valueOf(22.3));
        assertEquals(expected, result);
    }

    @Test
    void sumTest2() {
        BigDecimal expected = BigDecimal.valueOf(33.3);
        BigDecimal result = reducer.sum(BigDecimal.valueOf(33.3));
        assertEquals(expected, result);
    }

    @Test
    void subTest() {
        BigDecimal expected = BigDecimal.ZERO;
        BigDecimal result = reducer.sub(BigDecimal.ONE, BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void subTest2() {
        BigDecimal expected = BigDecimal.ONE;
        BigDecimal result = reducer.sub(BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void subTest3() {
        BigDecimal expected = BigDecimal.ONE;
        BigDecimal result = reducer.sub(BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void sub2Test() {
        BigDecimal expected = BigDecimal.valueOf(3);
        BigDecimal result = reducer.sub(BigDecimal.valueOf(4), BigDecimal.ONE);
        assertEquals(expected, result);
    }

    @Test
    void subTest_Fail() {
        BigDecimal expected = BigDecimal.valueOf(3);
        BigDecimal result = reducer.sub(BigDecimal.valueOf(5), BigDecimal.ONE);
        assertNotEquals(expected, result);
    }

    @Test
    void multiplyTest(){
        BigDecimal expected = BigDecimal.valueOf(100);
        BigDecimal result = reducer.multiply(BigDecimal.TEN, BigDecimal.TEN);
        assertEquals(expected, result);
    }

    @Test
    void division(){
        BigDecimal expected = BigDecimal.valueOf(10);
        BigDecimal result = reducer.division(BigDecimal.valueOf(100), BigDecimal.TEN);
        assertEquals(expected, result);
    }
}