package com.nagarro.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employeemanagement.Repository.EmployeeRepository;
import com.nagarro.employeemanagement.model.Employee;


@Service
public class GetAllEmployeesServiceImpl implements GetAllEmployeesService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployeesService() {
		List<Employee> list=(List<Employee>)repository.findAll();
		return list;
	}
}
