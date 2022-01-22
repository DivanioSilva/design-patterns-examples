package com.ds.reactive.producer;

import com.ds.entities.Employee;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public Mono<Employee> findById(Long id){
        return Mono.just(Employee.builder().firstName("Divanio").lastName("Silva").id(id).build());
    }

    public Mono<Employee> create(Employee employee){
        employee.setId(199L);
        return Mono.just(employee);
    }

    public Flux<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            employees.add(
                    Employee.builder().firstName("Divanio").lastName("Silva").id((long) i).build());
        }
        return Flux.fromStream(employees.stream());
    }

    public Mono<Void> delete(Employee employee){
        return Mono.empty();
    }

    public Mono<Employee> update(Employee employee) {
        return Mono.just(employee);
    }
}
