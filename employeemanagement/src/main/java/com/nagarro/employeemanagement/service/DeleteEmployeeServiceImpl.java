package com.nagarro.employeemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagarro.employeemanagement.Repository.EmployeeRepository;

@Service
public class DeleteEmployeeServiceImpl implements DeleteEmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public void deleteEmployeeService(long employeeCode) {
		repository.deleteById(employeeCode);
	}

}
