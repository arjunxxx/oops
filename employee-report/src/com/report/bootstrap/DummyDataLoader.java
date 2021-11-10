package com.report.bootstrap;

import java.util.Arrays;

import com.report.dao.EmployeeDAO;
import com.report.dao.EmployeeDAOImpl;
import com.report.model.Driver;
import com.report.model.SecurityOfficer;
import com.report.model.TechnicalStaff;

public class DummyDataLoader {

	EmployeeDAO empDao = new EmployeeDAOImpl();

	public void loadDummyData() {

		TechnicalStaff technicalStaff = new TechnicalStaff();
		technicalStaff.setEmpNo(1);
		technicalStaff.setName("Raj");
		technicalStaff.setDepartment("ABS");
		technicalStaff.setManagerId(10);
		technicalStaff.setSkillSet(Arrays.asList("Java", "Spring", "Hibernate"));
		technicalStaff.setTechCertifications(Arrays.asList("OCJP", "Azure 900"));
		empDao.saveEmployee(technicalStaff);

		Driver driver = new Driver();
		driver.setEmpNo(2);
		driver.setName("John");
		driver.setDepartment("FMS");
		technicalStaff.setManagerId(10);
		driver.setLicenceType("Heavy");
		driver.setLicenseNumber("123456");
		empDao.saveEmployee(driver);

		SecurityOfficer securityOfficer = new SecurityOfficer();
		securityOfficer.setEmpNo(2);
		securityOfficer.setName("John");
		securityOfficer.setDepartment("FMS");
		technicalStaff.setManagerId(10);
		securityOfficer.setRank("Security Head");
		securityOfficer.setJobShift("Night Shift");
		empDao.saveEmployee(securityOfficer);

	}

	public EmployeeDAO getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDAO empDao) {
		this.empDao = empDao;
	}

	
}
