package com.vtalent.rakesh;

import java.io.Serializable;

public class Employee implements Serializable {
	private int employid;
	private double employsalary;
	private String mobileNumber;
	private String employName;
	private double employPackage;
	private double pf;

	public int getEmployid() {
		return employid;
	}

	public void setEmployid(int employid) {
		this.employid = employid;
	}

	public double getEmploysalary() {
		return employsalary;
	}

	public void setEmploysalary(double employsalary) {
		this.employsalary = employsalary;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmployName() {
		return employName;
	}

	public void setEmployName(String employName) {
		this.employName = employName;
	}

	public double getEmployPackage() {
		return employPackage;
	}

	public void setEmployPackage(double employPackage) {
		this.employPackage = employPackage;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

}
