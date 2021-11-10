package com.report.main;

import java.util.ArrayList;
import java.util.List;

import com.report.bootstrap.DummyDataLoader;
import com.report.dao.EmployeeDAO;
import com.report.model.Employee;
import com.report.service.GenerateMSWordReportImpl;
import com.report.service.GenerateReport;
import com.report.service.GenerateTextReportImpl;

public class ReportMain {

	public static void main(String[] args) {
		
		
		DummyDataLoader dummyDataLoader= new DummyDataLoader();
		dummyDataLoader.loadDummyData();
		
		EmployeeDAO empDao = dummyDataLoader.getEmpDao();
		List<Employee> allemployees = empDao.getAllemployees();
		
		GenerateReport generateTextReport= new GenerateTextReportImpl();
		generateTextReport.generateEmployeeReport(allemployees);
		
		GenerateReport generateCSVReport= new GenerateMSWordReportImpl();
		generateCSVReport.generateEmployeeReport(allemployees);
		
		
	}

}
