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
@Table(name = "regions")
public class Region implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "region_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="reg_seq_gen")
	@SequenceGenerator(name="reg_seq_gen", sequenceName="regions_seq", allocationSize = 1)
	private Long regionId;

	@Column(name = "region_name")
	private String name;

}