package com.capg.employeeApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.employeeApp.entity.Company;
import com.capg.employeeApp.entity.Employee;
import com.capg.employeeApp.service.CompanyService;

import jakarta.validation.Valid;

import java.util.*;
@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping("/company")
	public ResponseEntity<Company> saveCompany(
			@Valid @RequestBody Company company) {
		return new ResponseEntity<>(companyService.saveCompany(company),
				HttpStatus.CREATED);
	}

	@GetMapping("/company/{id}")
	public ResponseEntity<Company> getCompany(@PathVariable int id) {
		return ResponseEntity.ok(companyService.findCompanyById(id));
	}
}