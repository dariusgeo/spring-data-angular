package edu.link.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.link.jpa.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
