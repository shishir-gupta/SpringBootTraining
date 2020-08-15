package com.wipro.sb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.sb.dao.EmployeeDao;
import com.wipro.sb.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	public Employee getEmployee(Long employeeId) {
		return employeeDao.getEmployee(employeeId);
	}

	public String addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	public String updateEmployee(Long employeeId, Employee employee) {
		return employeeDao.updateEmployee(employeeId, employee);
	}

	public String deleteEmployee(Long employeeId) {
		return employeeDao.deleteEmployee(employeeId);
	}

}
