package com.ds.designpattern.chainOfResponsability.validations;

import com.ds.entities.Employee;
import com.ds.exceptions.ParamException;

import java.util.List;

public interface Chain {

    void nextChain(Chain nextChain);

    void validate(List<Employee> employees) throws ParamException;
}
