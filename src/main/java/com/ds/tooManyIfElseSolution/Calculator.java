package com.ds.tooManyIfElseSolution;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public static float calculateUsingFactory(OperationsEnum operator, float a, float b){
        Operation targetOperation = OperationFactory.getOperation(operator.getValue())
                .orElseThrow(() -> new IllegalArgumentException("Invalid operator"));
        return targetOperation.doOperation(a, b);
    }
}
