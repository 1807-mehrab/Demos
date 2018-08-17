package com.revature.beans;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Zoo {
	@NotBlank
	@Pattern(regexp="[a-z-A-Z]*")
	private String name;
	
	private double admission;

	@Min(value=1)
	@Max(value=30)
	private Integer numAttractions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAdmission() {
		return admission;
	}

	public void setAdmission(double admission) {
		this.admission = admission;
	}

	public Integer getNumAttractions() {
		return numAttractions;
	}

	public void setNumAttractions(Integer numAttractions) {
		this.numAttractions = numAttractions;
	}

}
