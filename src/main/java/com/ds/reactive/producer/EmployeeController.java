package com.ds.reactive.producer;

import com.ds.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*
    @RequestMapping(value = "/", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Employee> create(@RequestBody Employee employee){
        return this.employeeService.create(employee);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Employee> update(@RequestBody Employee employee){
        return this.employeeService.update(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Employee> findById(@PathVariable Long id){
        return this.employeeService.findById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Employee> findAll(){
        return this.employeeService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Mono<Void> delete(@RequestBody Employee employee){
        return this.employeeService.delete(employee);
    }

     */
}
