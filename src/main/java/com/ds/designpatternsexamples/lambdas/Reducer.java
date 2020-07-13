package com.ds.designpatternsexamples.lambdas;

import java.math.BigDecimal;
import java.util.Arrays;

public class Reducer {

    public static BigDecimal sum(BigDecimal ... toSum){
        //BigDecimal sumResult = toSum.stream().reduce(BigDecimal.ONE, BigDecimal::add);
        BigDecimal sumResult = Arrays.stream(toSum).reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumResult;
    }

    public static BigDecimal sub(BigDecimal ... bigDecimals){
        if(bigDecimals.length == 0){
            return BigDecimal.ZERO;
        }

        if(bigDecimals.length == 1){
            return bigDecimals[0];
        }

        BigDecimal result = bigDecimals[0];
        for (int i = 1; i < bigDecimals.length; i++) {
            result = result.subtract(bigDecimals[i]);
        }

        //BigDecimal subResult = Arrays.stream(bigDecimals).reduce(BigDecimal.ZERO, BigDecimal::subtract);
        return result;
    }

    public static BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }

    public static BigDecimal division(BigDecimal value1, BigDecimal value2) {
        return value1.divide(value2);
    }
}
