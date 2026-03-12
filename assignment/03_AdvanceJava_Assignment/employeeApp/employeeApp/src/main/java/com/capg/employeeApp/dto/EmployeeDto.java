package com.capg.employeeApp.dto;

import jakarta.validation.constraints.*;

public class EmployeeDto {

    @NotBlank(message = "Employee name is required")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Min(value = 18, message = "Employee must be 18+")
    private int age;

    private long phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

    // getters and setters
    
}