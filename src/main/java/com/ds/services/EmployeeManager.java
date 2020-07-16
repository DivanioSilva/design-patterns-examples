package com.ds.services;

import com.ds.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class EmployeeManager {
    static HashMap<Long, Employee> db = new HashMap<>();

    static HashMap<String, Employee> db2 = new HashMap<>();

    static {
        db.put(1L, new Employee(1L, "Alex", "Gussin"));
        db.put(2L, new Employee(2L, "Brian", "Schultz"));

        db2.put("Alex", new Employee(1L, "Alex", "Gussin"));
        db2.put("Brian", new Employee(2L, "Brian", "Schultz"));
    }

    public Employee getEmployeeById(Long id) {
        return db.get(id);
    }

    public Employee getEmployeeByName(String name) {
        return db2.get(name);
    }
}
