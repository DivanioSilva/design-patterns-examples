package com.ds.tooManyIfElseSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationFactory {
    static Map<String, Operation> operations = new HashMap<>();

    static {
        operations.put(OperationsEnum.ADICAO.getValue(), new Adicao());
        operations.put(OperationsEnum.DIVISAO.getValue(), new Divisao());
        operations.put(OperationsEnum.MULTIPLICACAO.getValue(), new Multiplicacao());
        operations.put(OperationsEnum.SUBTRACAO.getValue(), new Subtracao());
    }

    public static Optional<Operation> getOperation(String operation){
        return Optional.ofNullable(operations.get(operation));
    }
}
