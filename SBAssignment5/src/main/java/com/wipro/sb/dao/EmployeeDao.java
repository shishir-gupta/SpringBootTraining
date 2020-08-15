package com.wipro.sb.dao;

import java.util.List;
import com.wipro.sb.entity.Employee;


public interface EmployeeDao {
	
	public List<Employee> getAllEmployee();
	public Employee getEmployee(Long employeeId);
	public String addEmployee(Employee employee);
	public String updateEmployee(Long employeeId, Employee employee);
	public String deleteEmployee(Long employeeId);
}
