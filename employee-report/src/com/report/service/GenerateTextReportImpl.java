package com.report.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.report.model.Employee;
import com.report.model.Driver;
import com.report.model.SecurityOfficer;
import com.report.model.TechnicalStaff;

public class GenerateTextReportImpl implements GenerateReport {

	@Override
	public void generateEmployeeReport(List<Employee> employees) {
		StringBuilder sb= new StringBuilder();
		for(Employee employee:employees) {
			
			if(employee instanceof TechnicalStaff) {
				TechnicalStaff ts= (TechnicalStaff)employee;
				sb.append(ts.toString()+System.lineSeparator());
			}
			
			if(employee instanceof Driver) {
				Driver driver= (Driver)employee;
				sb.append(driver.toString()+System.lineSeparator());
			}
			
			if(employee instanceof SecurityOfficer) {
				SecurityOfficer securityOfficer= (SecurityOfficer)employee;
				sb.append(securityOfficer.toString()+System.lineSeparator());
			}
		}
		
		try {
			writeReportFile(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void writeReportFile(String reportData) 
			  throws IOException {
		        String fileName="C://Report/Emp_Report_Text_"+new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+".txt";
			    FileOutputStream outputStream = new FileOutputStream(fileName);
			    byte[] strToBytes = reportData.getBytes();
			    outputStream.write(strToBytes);
			    outputStream.close();
			}

	

}
