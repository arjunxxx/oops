package com.report.service;

import java.util.List;

import com.report.model.Employee;

public interface GenerateReport {

	void generateEmployeeReport(List<Employee> employees);
	
}
