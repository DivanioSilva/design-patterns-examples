package com.ds.entities;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Animal {
    @Positive(message = "Value must be a positive value")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull(message = "Inform the animal family name")
    @Enumerated(EnumType.STRING)
    @Column(name = "animal_family", nullable = false)
    private AnimalFamily animalFamily;
    @Min(message = "Must have more than 2 legs", value = 2)
    @Column(nullable = false)
    private int qtdPernas;

}
