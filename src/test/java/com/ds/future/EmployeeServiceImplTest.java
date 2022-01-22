package com.ds.future;

import com.ds.entities.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeServiceImplTest {

    private EmployeeService employeeService;

    @Autowired
    EmployeeServiceImplTest(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Test
    void findAll() throws ExecutionException, InterruptedException {
        Future<List<Employee>> future = employeeService.findAll();
        List<Employee> employees = future.get();
        assertEquals(4, employees.size());
    }

    @Test
    void findByName() throws ExecutionException, InterruptedException {
        StopWatch stopWatch = new StopWatch("findByName");
        stopWatch.start();
        long waitTime = 1000;
        Future<List<Employee>> byName = employeeService.findByName("Divanio", waitTime);
        List<Employee> employees = byName.get();
        stopWatch.stop();
        long totalTimeMillis = stopWatch.getTotalTimeMillis();
        stopWatch.prettyPrint();
        assertEquals(1, employees.size());
        assertEquals("Divanio", employees.get(0).getFirstName());
        assertNotEquals(waitTime, totalTimeMillis);

    }

    @Test
    void twoFutures() throws ExecutionException, InterruptedException {
        final String name = "Divanio";
        final long waitTime = 1000;
        //CompletableFuture<List<Employee>> all = this.employeeService.findAll();
        //CompletableFuture<List<Employee>> byName = this.employeeService.findByName(name, waitTime);

        CompletableFuture<List<Employee>> all1 = this.employeeService.findAll();
        CompletableFuture<List<Employee>> byName1 = this.employeeService.findByName(name, waitTime);

        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(
                all1,
                byName1);

        completableFuture.get();

        //List<List<Employee>> collect = Stream.of(all, byName).map(CompletableFuture::join).collect(Collectors.toList());

        //assertTrue(all.isDone());
        //assertTrue(byName.isDone());
        assertTrue(all1.isDone());
        assertTrue(byName1.isDone());
    }
}
