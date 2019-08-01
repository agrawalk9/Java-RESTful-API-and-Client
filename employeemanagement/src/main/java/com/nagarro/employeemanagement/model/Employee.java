package com.nagarro.employeemanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Employee {

	@Id
	private long employeeCode;
	private String employeeName;
	private String employeeLoc;
	private String employeeEmail;
	private String employeeDOB;

	public long getEmployeeCode() {
		return employeeCode;
	}

	public String getEmployeeDOB() {
		return employeeDOB;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public String getEmployeeLoc() {
		return employeeLoc;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeCode(long employeeCode) {
		this.employeeCode = employeeCode;
	}

	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public void setEmployeeLoc(String employeeLoc) {
		this.employeeLoc = employeeLoc;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
