package com.ds.mappers;

import com.ds.dtos.AnimalDto;
import com.ds.entities.Animal;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AnimalMapper {
    Animal animalDtoToAnimal(AnimalDto animalDto);

    AnimalDto animalToAnimalDto(Animal animal);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Animal updateAnimalFromAnimalDto(AnimalDto animalDto, @MappingTarget Animal animal);
}
