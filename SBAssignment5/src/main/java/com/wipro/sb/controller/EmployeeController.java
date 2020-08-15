package com.wipro.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.sb.dao.EmployeeDao;
import com.wipro.sb.entity.Employee;
import java.util.List;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return employeeDao.getAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id){
		return employeeDao.getEmployee(id);
	}

	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee){
		return employeeDao.addEmployee(employee);
	}

	@PutMapping("/employee/{id}")
	public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
		return employeeDao.updateEmployee(id,employee);
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable Long id){
		return employeeDao.deleteEmployee(id);
	}

}
