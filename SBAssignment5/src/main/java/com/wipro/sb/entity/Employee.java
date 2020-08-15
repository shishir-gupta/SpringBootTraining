package com.wipro.sb.entity;


public class Employee {

	private Long	employeeId;
	private String	employeeName;
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
	
	public Employee(Long employeeId,String employeeName,String employeeEmail,String	employeeLocation) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeEmail=employeeEmail;
		this.employeeLocation=employeeLocation;
	}
}
