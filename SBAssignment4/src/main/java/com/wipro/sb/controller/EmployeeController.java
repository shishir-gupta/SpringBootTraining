package com.wipro.sb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.sb.entity.Employee;
import com.wipro.sb.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/displayAll")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/display/{employeeId}")
	public Employee getEmployee(@PathVariable Long employeeId){
		return employeeService.getEmployee(employeeId);
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@ModelAttribute("empName") String empName, 
								@ModelAttribute("empEmail") String empEmail,
								@ModelAttribute("empLocation") String empLocation){
		Employee employee = new Employee(empName,empEmail,empLocation);
		return employeeService.addEmployee(employee);
	}
}
