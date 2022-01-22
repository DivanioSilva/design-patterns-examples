package com.ds.designpattern.chainOfResponsability.validations;

import com.ds.entities.Employee;
import com.ds.exceptions.ParamException;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

public class FirstNameValidationChain implements Chain{
    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void validate(List<Employee> employees) throws ParamException {
        for (Employee employee : employees) {
            if(Objects.isNull(employee.getFirstName()) || StringUtils.isEmpty(employee.getFirstName())){
                throw new ParamException("Employee first name is null or empty.");
            }else{
                nextChain.validate(employees);
            }
        }
    }
}
