package com.wipro.sb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.wipro.sb.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}
