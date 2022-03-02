package com.ds.designpattern.chainOfResponsability.validations;

import com.ds.entities.Employee;
import com.ds.exceptions.ParamException;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

public class NullObjectValidationChain implements Chain<Employee>{
    private Chain<Employee> nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void validate(List<Employee> employees) throws ParamException {
        for (Employee employee : employees) {
            if(Objects.isNull(employee)){
                throw new ParamException("Employee null.");
            }else{
                nextChain.validate(employees);
            }
        }
    }
}
