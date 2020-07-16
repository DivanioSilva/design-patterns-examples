package com.ds.stream;

import com.ds.annotations.LogExecutionTime;
import com.ds.builders.myOwnBuilder.Person;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class Reducer {

    public BigDecimal sum(BigDecimal ... toSum){
        //BigDecimal sumResult = toSum.stream().reduce(BigDecimal.ONE, BigDecimal::add);
        BigDecimal sumResult = Arrays.stream(toSum).reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumResult;
    }

    public BigDecimal sub(BigDecimal ... bigDecimals){
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

    @LogExecutionTime
    public BigDecimal justReturn(BigDecimal bigDecimal){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return bigDecimal;
    }

    public BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }

    public BigDecimal division(BigDecimal value1, BigDecimal value2) {
        return value1.divide(value2);
    }

    public String operationAsString(String operation){
        return operation;
    }

    public String person(Person person){
        return person.toString();
    }
}
