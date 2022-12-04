package com.ds.dtos;

import com.ds.entities.Employee;

import java.io.Serializable;

/**
 * A DTO for the {@link Employee} entity
 */
public record EmployeeDtoInput(String firstName, String lastName, Integer version) implements Serializable { }
