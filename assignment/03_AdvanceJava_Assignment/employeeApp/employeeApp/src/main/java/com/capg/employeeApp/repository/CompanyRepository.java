package com.capg.employeeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.employeeApp.entity.Company;
import com.capg.employeeApp.entity.Employee;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
