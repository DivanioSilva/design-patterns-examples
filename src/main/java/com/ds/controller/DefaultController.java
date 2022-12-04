package com.ds.controller;

import com.ds.dtos.EmployeeDtoResponse;
import com.ds.dtos.EmployeeDtoInput;
import com.ds.entities.Employee;
import com.ds.entities.EmployeeDtoUpdate;
import com.ds.exceptions.BaseException;
import com.ds.exceptions.DBException;
import com.ds.mappers.EmployeeMapper;
import com.ds.repository.EmployeeRepository;
import com.ds.stream.Reducer;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.transaction.RollbackException;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(value = "/")
public class DefaultController {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public DefaultController(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @RequestMapping(value = "v0/test/{value}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String get(@PathVariable(name = "value") String value) throws BaseException {

        if (true) {
            throw new DBException.BadExecution();
        }

        return value;
    }

    @RequestMapping(value = "v1/test/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String get1() throws BaseException {

        if (true) {
            throw new DBException.NoData();
        }

        return "ping";
    }

    @RequestMapping(value = "aop/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BigDecimal getAOP() throws BaseException {

        Reducer reducer = new Reducer();

        BigDecimal response = reducer.justReturn(BigDecimal.TEN);

        return response;
    }

    @PostMapping(value = "v1/employee/", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeDtoResponse save(@RequestBody EmployeeDtoInput employee){
        Employee input = employeeMapper.employeeInputDtoToEmployee(employee);
        Employee savedEmployee = employeeRepository.save(input);
        return this.employeeMapper.employeeToEmployeeDtoResponse(savedEmployee);
    }

    @Transactional(rollbackFor = NoSuchElementException.class)
    @PutMapping(value = "v1/employee/", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeDtoResponse update(@RequestBody EmployeeDtoUpdate employee){
        Employee input = employeeMapper.employeeDtoUpdateToEmployee(employee);
        Employee onDB = employeeRepository.findById(input.getId()).get();
        employeeMapper.updateEmployeeFromEmployeeDtoUpdate(employee, onDB);
        Employee savedEmployee = employeeRepository.save(onDB);
        return this.employeeMapper.employeeToEmployeeDtoResponse(savedEmployee);
    }
}
