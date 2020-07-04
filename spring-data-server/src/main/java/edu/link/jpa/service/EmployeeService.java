package edu.link.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.link.jpa.dto.EmployeeDTO;
import edu.link.jpa.mapper.EmployeeMapper;
import edu.link.jpa.model.Employee;
import edu.link.jpa.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Transactional(readOnly = true)
	public List<EmployeeDTO> readAllEmployees(){
		
		List<Employee> dbResult = employeeRepository.findAll();
		
		return employeeMapper.employeesToEmployeeDTOs(dbResult);
	}

}
