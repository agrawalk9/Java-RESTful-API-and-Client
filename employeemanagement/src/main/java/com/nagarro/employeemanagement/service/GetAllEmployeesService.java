package com.nagarro.employeemanagement.service;

import java.util.List;

import com.nagarro.employeemanagement.model.Employee;


public interface GetAllEmployeesService {

	//void setEmployeeRepository(EmployeeRepository employeeRepository);

	List<Employee> getAllEmployeesService();

}