package com.capg.employeeApp.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.employeeApp.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
