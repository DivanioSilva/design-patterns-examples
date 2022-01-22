package com.ds.designpattern.chainOfResponsability.validations;

import com.ds.entities.Employee;
import com.ds.exceptions.ParamException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("nullListTest")
    void nullListTest(){
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(null);
        });

        assertEquals("Employee list is null or empty.", exception.getMessage());
    }

    @Test
    @DisplayName("emptyListTest")
    void emptyListTest(){
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(Collections.EMPTY_LIST);
        });

        assertEquals("Employee list is null or empty.", exception.getMessage());
    }

    @Test
    @DisplayName("employeeIsNullTest")
    void employeeIsNullTest(){
        employees.add(null);
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        });

        assertEquals("Employee null.", exception.getMessage());
    }

    @Test
    @DisplayName("employeeIdIsNullTest")
    void employeeIdIsNullTest(){
        employees.add(Employee.builder().build());
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        });

        assertEquals("Employee id is null or empty.", exception.getMessage());
    }

    @Test
    @DisplayName("employeeFirstNameEmptyTest")
    void employeeFirstNameEmptyTest(){
        employees.add(Employee.builder().id(1L).build());
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        });

        assertEquals("Employee first name is null or empty.", exception.getMessage());
    }

    @Test
    @DisplayName("employeeLastNameEmptyTest")
    void employeeLastNameEmptyTest(){
        employees.add(Employee.builder().id(1L).firstName("Mianna").build());
        ParamException exception = assertThrows(ParamException.class, () -> {
            validationChain.validate(employees);
        });

        assertEquals("Employee last name is null or empty.", exception.getMessage());
    }

    /*
    @Test
    void okTest() throws ParamException {
        employees.add(Employee.builder().id(1L).firstName("Mianna").lastName("Silva Liberati").build());
        assertDoesNotThrow(ParamException.class, () -> {
            validationChain.validate(employees);
        });
        //assertDoesNotThrow(ParamException.class, () -> {
        //    validationChain.validate(employees);
        //});

    }

     */
}
