package com.example.aws.elasticsearch.demo.model;

import lombok.Data;

@Data
public class Technologies {

    public Technologies() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Technologies [name=" + name + ", yearsOfExperience=" + yearsOfExperience + "]";
	}
	public Technologies(String name, String yearsOfExperience) {
		super();
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	private String name;
    private  String yearsOfExperience;

}
