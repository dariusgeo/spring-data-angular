package edu.link.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import edu.link.jpa.dto.EmployeeDTO;
import edu.link.jpa.model.Employee;


@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	
	EmployeeDTO employeeToEmployeeDTO(Employee employee);
	
	List<EmployeeDTO> employeesToEmployeeDTOs(List<Employee> employees);
	
	Employee employeeDTOToEmployee(EmployeeDTO employee);
	
	List<Employee> employeeDTOsToEmployees(List<EmployeeDTO> employees);

}
