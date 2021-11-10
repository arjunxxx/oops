package com.report.dao;

import java.util.List;

import com.report.model.Employee;

public interface EmployeeDAO {
	
	void saveEmployee(Employee employee);
	
	List<Employee> getAllemployees();
	

}
