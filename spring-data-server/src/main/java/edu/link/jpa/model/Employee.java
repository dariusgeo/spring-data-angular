package edu.link.jpa.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Data
@Entity
@Table(name="employees")
@NamedQueries({
    @NamedQuery(name="Employee.findByDepartment",
                query="SELECT e FROM Employee e JOIN Department d ON d.departmentId = e.department.id WHERE d.name = :deptName ")
}) 
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="emp_seq_gen")
	@SequenceGenerator(name="emp_seq_gen", sequenceName="employees_seq", allocationSize = 1)
	private Long employeeId;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="email")
	private String email;

	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="hire_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date hireDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="job_id")
	private Job job;
	
	@Column(name="salary")
	private Double salary;
	
	@Column(name="commission_pct")
	private Double commission;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="department_id")
	private Department department;
		
	@Version
	@Column(name = "version")
	private int version;

}
