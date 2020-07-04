package edu.link.jpa.model;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data
@Entity
@Table(name="countries")
public class Country implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="country_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cty_seq_gen")
	@SequenceGenerator(name="cty_seq_gen", sequenceName="countries_seq", allocationSize = 1)
	private String countryId;
	
	@Column(name="country_name")
	private String name;
	
	@ManyToOne
    @JoinColumn(name = "region_id")
	private Region region;

}

