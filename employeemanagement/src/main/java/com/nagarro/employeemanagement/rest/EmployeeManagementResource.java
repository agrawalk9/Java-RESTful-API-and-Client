package com.nagarro.employeemanagement.rest;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.employeemanagement.facade.Facade;
import com.nagarro.employeemanagement.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeManagementResource {

	@Autowired
	private Facade facade;

	@GetMapping(produces = "application/json")
	public List<Employee> getEmployees() {
		System.out.println("facade------------------------ " + facade);
		List<Employee> list = facade.getEmployeesFacade();
		return list;
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println("code" + employee.getEmployeeCode());
		 if (facade.getParticularEmployeeFacade(employee.getEmployeeCode()) == null) {
		Employee tempEmployee = facade.addEmployeeFacade(employee);
		System.out.println(tempEmployee);
		return "successful";
		 }
		// URI uri=uriInfo.getAbsolutePathBuilder().path(id).build();
		// return Response.created(uri).entity(tempEmployee).build();
		 return "unsuccessful";
	}

	@GetMapping("/profiles/{employeeCode}")
	public Employee getParticularEmployee(@PathVariable("employeeCode") long employeeCode) {
		return facade.getParticularEmployeeFacade(employeeCode);
	}

	@DeleteMapping("/profiles/{employeeCode}")
	public void deleteEmployee(@PathVariable("employeeCode") long employeeCode) {
		System.out.println("code: " + employeeCode);
		facade.deleteEmployeeFacade(employeeCode);
	}

	@PutMapping(value="/profiles/update/{employeeCode}")
	public Employee addEmployee(@PathVariable("employeeCode") long employeeCode,@RequestBody Employee employee) {
		Employee tempEmployee = facade.updateEmployeeFacade(employee);
		String id = String.valueOf(tempEmployee.getEmployeeCode());
		/*
		 * URI uri = uriInfo.getAbsolutePathBuilder().path(id).build(); // return
		 * Response.created(uri).entity(tempEmployee).build();
		 */
		return tempEmployee;
	}

}
