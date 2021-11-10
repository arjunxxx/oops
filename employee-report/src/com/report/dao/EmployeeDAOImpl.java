package com.report.dao;

import java.util.ArrayList;
import java.util.List;

import com.report.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private List<Employee> employeeList = new ArrayList<Employee>();
	
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeList.add(employee);

	}

	@Override
	public List<Employee> getAllemployees() {
		return employeeList;
	}

}
