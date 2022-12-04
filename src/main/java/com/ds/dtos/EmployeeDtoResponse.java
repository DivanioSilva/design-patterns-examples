package com.ds.dtos;

import com.ds.entities.Employee;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link Employee} entity
 */
public record EmployeeDtoResponse(Date createdAt, Date updatedAt, Date deletedAt, Integer version, Long id,
                                  String firstName, String lastName) implements Serializable {
}
