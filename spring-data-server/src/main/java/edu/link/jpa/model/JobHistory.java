package edu.link.jpa.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@Entity
@Table(name="job_history")
public class JobHistory implements Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId JobHistoryPK jobHistoryID;
	
	@Column(name="end_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="job_id")
	private Job job;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="department_id")
	private Department department;

}