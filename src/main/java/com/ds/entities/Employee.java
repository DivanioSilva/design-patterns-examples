package com.ds.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Employee", indexes = {
        @Index(name = "idx_employee_id_firstname_unq", columnList = "id, firstName, lastName", unique = true)
}, uniqueConstraints = {
        @UniqueConstraint(name = "uc_employee_id_firstname", columnNames = {"id", "firstName", "lastName"})
})
public class Employee extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private static final long serialVersionUID = 5517244812959569947L;
    private String firstName;
    private String lastName;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

    @Version
    @Column(name = "version")
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = new Date();
    }

    @PreRemove
    public void preRemove() {
        this.deletedAt = new Date();
    }

    @PrePersist
    public void prePersist() {
        this.createdAt = new Date();
    }

}
