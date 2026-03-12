package com.capg.employeeApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.employeeApp.dto.EmployeeDto;
import com.capg.employeeApp.entity.Employee;
import com.capg.employeeApp.exception.EmployeeNotFoundException;
import com.capg.employeeApp.repository.EmployeeRepository;

//@Service
//public class EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepo;
//
//    // Get employee by ID
//    public Employee findEmployeeById(int id) {
//        return employeeRepo.findById(id)
//                .orElseThrow(() ->
//                        new EmployeeNotFoundException("Employee with id " + id + " not found"));
//    }
//
//    // Convert Entity -> DTO
//    public EmployeeDto entityToDto(Employee e) {
//        EmployeeDto dto = new EmployeeDto();
//        dto.setAge(e.getAge());
//        dto.setEmail(e.getEmail());
//        dto.setName(e.getName());
//        dto.setPhone(e.getPhone());
//        return dto;  // ✅ IMPORTANT
//    }
//
//    // Get all employees
//    public List<Employee> getAllEmployees() {
//        return employeeRepo.findAll();  // ✅ Correct variable name
//    }
//}

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.CacheEvict;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    // 🔥 1. GET BY ID (Cacheable)
    @Cacheable(value = "employees", key = "#id")
    public Employee findEmployeeById(int id) {
        System.out.println("Fetching from DB...");
        return employeeRepo.findById(id)
                .orElseThrow(() ->
                        new EmployeeNotFoundException("Employee with id " + id + " not found"));
    }

    // 🔥 2. SAVE (Update Cache)
    @CachePut(value = "employees", key = "#result.id")
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    // 🔥 3. DELETE (Remove From Cache)
    @CacheEvict(value = "employees", key = "#id")
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}