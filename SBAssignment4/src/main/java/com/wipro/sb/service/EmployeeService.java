package com.wipro.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sb.entity.Employee;
import com.wipro.sb.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		
		//Sort sort = new Sort(new Sort.Order(Direction.ASC, "lastName"));
		//Pageable pageable = new PageRequest(0, 5, sort);
		
		Iterable<Employee> employeeList =  employeeRepository.findAll();
		return (List<Employee>)employeeList;
	}

	public Employee getEmployee(Long employeeId){
		Employee employee=employeeRepository.findById(employeeId).get();
		return employee;
	}
	
	public Employee addEmployee(Employee employee){
		return employeeRepository.save(employee);
	}
	

}
