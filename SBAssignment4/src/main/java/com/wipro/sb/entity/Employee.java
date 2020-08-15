package com.wipro.sb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name = "EMPLOYEE_ID", nullable = false)
	private Long	employeeId;
	
	@Column(name = "EMPLOYEE_NAME", nullable = false)
	private String	employeeName;
	
	@Column(name = "EMPLOYEEE_EMAIL", nullable = false)
	private String	employeeEmail;
	
	private String	employeeLocation;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeLocation() {
		return employeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}
	
	public Employee() {}
	
	public Employee(String employeeName,String employeeEmail,String	employeeLocation) {
		this.employeeName=employeeName;
		this.employeeEmail=employeeEmail;
		this.employeeLocation=employeeLocation;
	}
}
