package com.ds.future;

import com.ds.entities.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>();
        employees.add(
                Employee.builder()
                        .firstName("Divanio")
                        .lastName("Silva")
                        .id((long) 1)
                        .build()
        );
        employees.add(
                Employee.builder()
                        .firstName("Marianna")
                        .lastName("Silva Liberati")
                        .id((long) 2)
                        .build()
        );
        employees.add(
                Employee.builder()
                        .firstName("Arianna")
                        .lastName("Liberati")
                        .id((long) 3)
                        .build()
        );
        employees.add(
                Employee.builder()
                        .firstName("Lara")
                        .lastName("Silva Liberati")
                        .id((long) 4)
                        .build()
        );
    }

    @Override
    public CompletableFuture<List<Employee>> findAll() {
        return CompletableFuture.supplyAsync(() -> {
            log.info("findAll was calling.");
            return this.employees;
        });
    }

    @Override
    public CompletableFuture<List<Employee>> findByName(String name, long waitTime) {
        return CompletableFuture.supplyAsync(() -> {
            log.info("findByName was calling.");
            try {
                log.info("Daley was applied");
                Thread.sleep(waitTime);
            } catch (InterruptedException e) {
                log.error(e.getMessage());
            }
            return this.employees.stream()
                    .filter(emp -> emp.getFirstName()
                            .equals(name))
                    .collect(Collectors.toList());
        });
    }
}
