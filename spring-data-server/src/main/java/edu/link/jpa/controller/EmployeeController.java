package edu.link.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.link.jpa.dto.EmployeeDTO;
import edu.link.jpa.service.EmployeeService;

@RestController
@RequestMapping(path="/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "/all")
	public ResponseEntity<List<EmployeeDTO>> getAll(){
	
		List<EmployeeDTO> employees = employeeService.readAllEmployees();
		
		if(employees.isEmpty()){
		   return new ResponseEntity<List<EmployeeDTO>>(HttpStatus.NO_CONTENT);
		}
		
	    return new ResponseEntity<List<EmployeeDTO>>(employees, HttpStatus.OK);		
	}

}
