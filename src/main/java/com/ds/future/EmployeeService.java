package com.ds.future;

import com.ds.entities.Employee;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface EmployeeService {
    CompletableFuture<List<Employee>> findAll();

    CompletableFuture<List<Employee>> findByName(String name, long waitTime);
}
