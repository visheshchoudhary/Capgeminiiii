package com.capg.employeeApp.dto;

import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public class CompanyDTO {

    @NotBlank(message = "Company name is required")
    private String name;

    @NotBlank(message = "Location is required")
    private String location;

    @Valid
    private List<EmployeeDto> employees;

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

	public List<EmployeeDto> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeDto> employees) {
		this.employees = employees;
	}

    // getters and setters
    
}