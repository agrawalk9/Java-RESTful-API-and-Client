package com.nagarro.employeemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nagarro.employeemanagement.Repository.EmployeeRepository;
import com.nagarro.employeemanagement.model.Employee;

@SpringBootApplication
public class EmployeemanagementApplication {

	private static final Logger log= LoggerFactory.getLogger(EmployeemanagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagementApplication.class, args);
		System.out.println("Hello World");
	}

}
