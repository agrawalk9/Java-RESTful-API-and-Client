package com.nagarro.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employeemanagement.Repository.EmployeeRepository;
import com.nagarro.employeemanagement.model.Employee;


@Service
public class UpdateEmployeeDetailsServiceImpl implements UpdateEmployeeDetailsService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee updateEmployeeService(Employee employee) {
		Employee e=repository.findById(employee.getEmployeeCode()).get();
		e.setEmployeeDOB(employee.getEmployeeDOB());
		e.setEmployeeName(employee.getEmployeeName());
		e.setEmployeeEmail(employee.getEmployeeEmail());
		e.setEmployeeLoc(employee.getEmployeeLoc());
		repository.save(e);
		return e;
	}

}
