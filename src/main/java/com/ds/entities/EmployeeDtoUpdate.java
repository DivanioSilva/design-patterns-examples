package com.ds.entities;

import java.io.Serializable;

/**
 * A DTO for the {@link Employee} entity
 */
public record EmployeeDtoUpdate(Integer version, Long id, String firstName, String lastName) implements Serializable {
}
