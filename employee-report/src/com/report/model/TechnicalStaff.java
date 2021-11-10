package com.report.model;

import java.util.ArrayList;
import java.util.List;

public class TechnicalStaff extends Employee {
	
	private List<String> skillSet= new ArrayList<String>();
	private List<String> techCertifications= new ArrayList<String>();
	
   	

	public TechnicalStaff() {
		super();
	}
	
	public List<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	public List<String> getTechCertifications() {
		return techCertifications;
	}
	public void setTechCertifications(List<String> techCertifications) {
		this.techCertifications = techCertifications;
	}

	@Override
	public String toString() {
		return "TechnicalStaff [skillSet=" + skillSet + ", techCertifications=" + techCertifications + ", Name="
				+ getName() + ", EmpNo=" + getEmpNo() + ", Department=" + getDepartment()
				+ ", ManagerId=" + getManagerId() + "]";
	}

	
	
}
