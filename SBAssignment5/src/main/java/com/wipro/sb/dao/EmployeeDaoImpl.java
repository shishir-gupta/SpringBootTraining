package com.wipro.sb.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Component;
import com.wipro.sb.entity.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	private static HashMap<Long,Employee> employeeMap;
	private static Long empId=0L;
	
	static {
		employeeMap = new HashMap<Long,Employee>();
		
		Employee employee = new Employee(++empId,"Shishir Gupta","shishir.gupta3@wipro.com","Atlanta GA");
		employeeMap.put(empId, employee);
		
		employee = new Employee(++empId,"Kavita Gupta","kavita.gupta1@wipro.com","Chicago IL");
		employeeMap.put(empId, employee);
	}
	
	
	@Override
	public List<Employee> getAllEmployee() {
		return new ArrayList<Employee>(employeeMap.values());
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		return employeeMap.get(employeeId);
	}

	@Override
	public String addEmployee(Employee employee) {
		String returnMsg="";
		employee.setEmployeeId(++empId);

		int oldSize = employeeMap.size();
		employeeMap.put(empId, employee);
		
		if (employeeMap.size()>oldSize)
			returnMsg="Employee successfully created with Id " + empId;
		else
			returnMsg="Error while creating new Employee with the name "+ employee.getEmployeeName();
		
		return returnMsg;
	}

	@Override
	public String updateEmployee(Long employeeId, Employee employee) {
		String returnMsg="";
		if (employeeMap.get(employeeId)!=null) {
			employee.setEmployeeId(employeeId);
			employeeMap.put(employeeId, employee);
			returnMsg="Employee with Id "+employeeId + " successfully updated.";
		}else {
			returnMsg="Employee with Id "+ employeeId + " doest not exist";
		}
		return returnMsg;
	}

	@Override
	public String deleteEmployee(Long employeeId) {
		String returnMsg="";
		
		if (employeeMap.remove(employeeId)!=null)
			returnMsg="Employee with Id "+ employeeId + " succesfully deleted";
		else
			returnMsg="Employee with Id "+ employeeId + " doest not exist";
		
		return returnMsg;
	}

}
