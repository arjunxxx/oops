package com.report.model;

public class SecurityOfficer extends Employee {
		
	private String rank;
	private String jobShift;
	
	
	public SecurityOfficer() {
		super();
	}


	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}


	public String getJobShift() {
		return jobShift;
	}


	public void setJobShift(String jobShift) {
		this.jobShift = jobShift;
	}


	@Override
	public String toString() {
		return "SecurityOfficer [rank=" + rank + ", jobShift=" + jobShift + ", Name=" + getName() + ", EmpNo="
				+ getEmpNo() + ", Department=" + getDepartment() + ", ManagerId=" + getManagerId() + "]";
	}
	
	
	
	
	
}
