package com.ds.entities;

import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee extends BaseEntity{
    private Long id;
    private String firstName;
    private String lastName;
}
