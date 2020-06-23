package com.example.service;

import java.util.Optional;

import com.example.model.Employee;

public interface EmployeeService {
	
	public Iterable<Employee> findAllEmployees();
    public Optional<Employee> findEmployeeById(int employeeId);

}
