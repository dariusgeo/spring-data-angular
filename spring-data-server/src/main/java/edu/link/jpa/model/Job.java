package edu.link.jpa.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@Table(name="jobs")
public class Job implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="job_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="job_seq_gen")
	@SequenceGenerator(name="job_seq_gen", sequenceName="jobs_seq")
	private String jobId;
	
	@Column(name="job_title")
	private String title;
	
	@Column(name="min_salary")
	private Double minSalary;
	
	@Column(name="max_salary")
	private Double maxSalary;

	
}
