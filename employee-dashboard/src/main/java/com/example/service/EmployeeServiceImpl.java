package com.example.service;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;


@Service("employeeService")
@EnableTransactionManagement
@EnableAutoConfiguration

public class EmployeeServiceImpl implements EmployeeService {
	
	  private EmployeeRepository employeeRepository;

	    @Autowired
	    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }
	

	@Override
	@Transactional
	public Iterable<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		  return employeeRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<Employee> findEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		  return employeeRepository.findById(employeeId);
	}

}
