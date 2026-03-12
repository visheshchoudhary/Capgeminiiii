package com.capg.employeeApp.dto;

import java.util.List;

public class CompanyResponseDTO {

    private int id;
    private String name;
    private String location;
    private List<EmployeeResponseDTO> employees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<EmployeeResponseDTO> getEmployees() {
		return employees;
	}
	public void setEmployees(List<EmployeeResponseDTO> employees) {
		this.employees = employees;
	}

    // getters and setters
    
}