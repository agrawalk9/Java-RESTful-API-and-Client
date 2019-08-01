package com.nagarro.employeemanagement.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employeemanagement.Repository.EmployeeRepository;
import com.nagarro.employeemanagement.model.Employee;


@Service
public class GetParticularEmployeeServiceImpl implements GetParticularEmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee getParticularEmployeeService(long employeeCode) {
		//System.out.println("code="+employeeCode);
		Optional<Employee> e=repository.findById(employeeCode);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}

	
}
