package com.ds.dtos;

import com.ds.entities.AnimalFamily;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.io.Serializable;

/**
 * A DTO for the {@link com.ds.entities.Animal} entity
 */
public record AnimalDto(@Positive(message = "Value must be a positive value") Long id,
                        @NotNull(message = "Inform the animal family name") AnimalFamily animalFamily,
                        int qtdPernas) implements Serializable {
}
