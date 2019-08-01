package com.nagarro.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employeemanagement.model.Employee;
import com.nagarro.employeemanagement.Repository.EmployeeRepository;

@Service
public class AddEmployeeServiceImpl implements AddEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployeeService(Employee employee) {
			System.out.println("Hey There----------");
			Employee tempEmployee=employeeRepository.save(employee);
			return tempEmployee;
	}

}
