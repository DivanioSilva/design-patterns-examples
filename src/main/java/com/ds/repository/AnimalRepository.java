package com.ds.repository;

import com.ds.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
