package com.report.model;

public class Driver extends Employee {
		
	private String licenseNumber;
	private String licenceType;
	
	
	public Driver() {
		super();
	}
	
	
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLicenceType() {
		return licenceType;
	}
	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}


	@Override
	public String toString() {
		return "Driver [licenseNumber=" + licenseNumber + ", licenceType=" + licenceType + ", Name=" + getName()
				+ ", EmpNo=" + getEmpNo() + ", Department=" + getDepartment() + ", ManagerId="
				+ getManagerId() + "]";
	}
		
	
}
