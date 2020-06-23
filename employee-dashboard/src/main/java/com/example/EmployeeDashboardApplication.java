package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeDashboardApplication implements CommandLineRunner{
	
	
	private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeDashboardApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDashboardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(new Employee("Amma","Watson","watson@email.com"));
        employeeRepository.save(new Employee("Sergio","Aguewro","aguero@email.com"));
        employeeRepository.save(new Employee("Silva","David","ElMago@email.com"));
        employeeRepository.save(new Employee("Pep","Guardioala","pep@email.com"));
	}

}
