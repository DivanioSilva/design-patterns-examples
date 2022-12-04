package com.ds.mappers;

import com.ds.entities.Employee;
import com.ds.dtos.EmployeeDtoInput;
import com.ds.dtos.EmployeeDtoResponse;
import com.ds.entities.EmployeeDtoUpdate;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface EmployeeMapper {
    Employee employeeInputDtoToEmployee(EmployeeDtoInput employeeDtoInput);

    EmployeeDtoInput employeeToEmployeeInputDto(Employee employee);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee updateEmployeeFromEmployeeInputDto(EmployeeDtoInput employeeDtoInput, @MappingTarget Employee employee);

    Employee employeeDtoResponseToEmployee(EmployeeDtoResponse employeeDtoResponse);

    EmployeeDtoResponse employeeToEmployeeDtoResponse(Employee employee);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee updateEmployeeFromEmployeeDtoResponse(EmployeeDtoResponse employeeDtoResponse, @MappingTarget Employee employee);

    Employee employeeDtoUpdateToEmployee(EmployeeDtoUpdate employeeDtoUpdate);

    EmployeeDtoUpdate employeeToEmployeeDtoUpdate(Employee employee);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Employee updateEmployeeFromEmployeeDtoUpdate(EmployeeDtoUpdate employeeDtoUpdate, @MappingTarget Employee employee);
}
