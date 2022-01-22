package com.ds.designpattern.chainOfResponsability.validations;

import com.ds.entities.Employee;
import com.ds.exceptions.ParamException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChainTest {

    private Chain validationChain;
    private List<Employee> employees;

    @BeforeEach
    void setUpTheChain() {
        employees = new ArrayList<>();

        this.validationChain = new ListValidationChain();
        Chain c2 = new NullObjectValidationChain();
        Chain c3 = new IdValidationChain();
        Chain c4 = new FirstNameValidationChain();
        Chain c5 = new LastNameValidationChain();
        validationChain.nextChain(c2);
        c2.nextChain(c3);
        c3.nextChain(c4);
        c4.nextChain(c5);
    }

    @Test
    void nullListTest(){
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(null);
        }, "Employee list is null or empty.");

        assertEquals("Employee list is null or empty.", exception.getMessage());
    }

    @Test
    void emptyListTest(){
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(Collections.EMPTY_LIST);
        }, "Employee list is null or empty.");

        assertEquals("Employee list is null or empty.", exception.getMessage());
    }

    @Test
    void employeeIsNullTest(){
        employees.add(null);
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        }, "Employee null.");

        assertEquals("Employee null.", exception.getMessage());
    }

    @Test
    void employeeIdIsNullTest(){
        employees.add(Employee.builder().build());
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        }, "Employee id is null or empty.");

        assertEquals("Employee id is null or empty.", exception.getMessage());
    }

    @Test
    void employeeFirstNameEmptyTest(){
        employees.add(Employee.builder().id(1L).build());
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        }, "Employee first name is null or empty.");

        assertEquals("Employee first name is null or empty.", exception.getMessage());
    }

    @Test
    void employeeLastNameEmptyTest(){
        employees.add(Employee.builder().id(1L).firstName("Mianna").build());
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        }, "Employee last name is null or empty.");

        assertEquals("Employee last name is null or empty.", exception.getMessage());
    }
}
