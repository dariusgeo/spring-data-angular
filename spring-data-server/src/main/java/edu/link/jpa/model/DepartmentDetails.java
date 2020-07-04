package edu.link.jpa.model;

import lombok.Data;

@Data
public class DepartmentDetails {
	
	private String name;	
	private String city;
	private String state;
	private String countryId;
	
	public DepartmentDetails(){
		
	}

}
