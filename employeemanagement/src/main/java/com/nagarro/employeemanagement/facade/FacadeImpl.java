package com.nagarro.employeemanagement.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.employeemanagement.model.Employee;
import com.nagarro.employeemanagement.service.AddEmployeeService;
import com.nagarro.employeemanagement.service.DeleteEmployeeService;
import com.nagarro.employeemanagement.service.GetAllEmployeesService;
import com.nagarro.employeemanagement.service.GetParticularEmployeeService;
import com.nagarro.employeemanagement.service.UpdateEmployeeDetailsService;


@Service
public class FacadeImpl implements Facade {

	@Autowired
	private GetAllEmployeesService getAllEmployees;
	@Autowired
	private GetParticularEmployeeService getAParticularEmployee;
	@Autowired
	private DeleteEmployeeService delete;
	@Autowired
	private AddEmployeeService add;
	@Autowired
	private UpdateEmployeeDetailsService update;
	
	@Override
	public Employee addEmployeeFacade(Employee employee) {
		return add.addEmployeeService(employee);
	}

	@Override
	public void deleteEmployeeFacade(long employeeCode) {
		delete.deleteEmployeeService(employeeCode);
	}
	
	@Override
	public List<Employee> getEmployeesFacade() {
		return getAllEmployees.getAllEmployeesService();
	}

	@Override
	public Employee getParticularEmployeeFacade(long employeeCode) {
		return getAParticularEmployee.getParticularEmployeeService(employeeCode);
	}

	@Override
	public Employee updateEmployeeFacade(Employee employee) {
		System.out.println("code: "+employee.getEmployeeCode());
		return update.updateEmployeeService(employee);
	}
	
}
