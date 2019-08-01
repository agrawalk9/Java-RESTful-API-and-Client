package com.nagarro.employeemanagement.facade;

import java.util.List;

import com.nagarro.employeemanagement.model.Employee;


public interface Facade {
	
	List<Employee> getEmployeesFacade();

	Employee getParticularEmployeeFacade(long employeeCode);

	void deleteEmployeeFacade(long employeeCode);

	Employee addEmployeeFacade(Employee employee);

	Employee updateEmployeeFacade(Employee employee);

}