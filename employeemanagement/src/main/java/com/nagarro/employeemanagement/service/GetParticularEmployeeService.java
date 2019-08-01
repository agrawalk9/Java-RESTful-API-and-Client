package com.nagarro.employeemanagement.service;

import com.nagarro.employeemanagement.model.Employee;

public interface GetParticularEmployeeService {

	//void setEmployeeRepository(EmployeeRepository employeeRepository);

	Employee getParticularEmployeeService(long employeeCode);

}