package com.ds.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {
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
