package com.ds.tooManyIfElseSolition.with;

import com.ds.tooManyIfElseSolution.with.command.AddCommand;
import com.ds.tooManyIfElseSolution.with.command.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class Command {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sumTest() {
        BigDecimal expected = BigDecimal.valueOf(11);
        BigDecimal result = calculator.calculate(new AddCommand(BigDecimal.ONE, BigDecimal.TEN));
        assertEquals(expected, result);
    }

}