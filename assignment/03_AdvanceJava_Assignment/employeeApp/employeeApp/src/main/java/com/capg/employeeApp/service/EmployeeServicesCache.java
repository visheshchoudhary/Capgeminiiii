package com.capg.employeeApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.capg.employeeApp.entity.Employee;
import com.capg.employeeApp.exception.EmployeeNotFoundException;
import com.capg.employeeApp.repository.EmployeeRepository;

@Service
public class EmployeeServicesCache {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Cacheable(value = "employees", key = "#id")
    public Employee getEmployeeById(int id) {
        System.out.println("Fetching from DB...");
        return employeeRepo.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee with id " + id + " not found"));
    }

    @CachePut(value = "employees", key = "#result.id")
    public Employee addEmployee(Employee newEmployee) {
        return employeeRepo.save(newEmployee);
    }

    @CachePut(value = "employees", key = "#id")
    public Employee updateEmployee(int id, Employee updatedEmployee) {

        Employee existing = employeeRepo.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee with id " + id + " not found"));

        existing.setName(updatedEmployee.getName());
        existing.setEmail(updatedEmployee.getEmail());
        existing.setAge(updatedEmployee.getAge());
        existing.setPhone(updatedEmployee.getPhone());

        return employeeRepo.save(existing);
    }

    @CacheEvict(value = "employees", key = "#id")
    public void deleteEmployee(int id) {

        if (!employeeRepo.existsById(id)) {
            throw new EmployeeNotFoundException("Employee with id " + id + " not found");
        }

        employeeRepo.deleteById(id);
    }
}