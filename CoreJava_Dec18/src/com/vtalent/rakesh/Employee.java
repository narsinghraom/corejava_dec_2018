package com.vtalent.rakesh;

import java.io.Serializable;

public class Employee implements Serializable {
	private int employid;
	private double employsalary;
	private String mobileNumber;
	private String employName;
	private double employPackage;
	private double pf;
	private double loanAmount;
	private double emi;
	private int tenure;
	private String loanStartDate;
	private String loanEndDate;

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

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double eligibleAmount) {
		this.loanAmount = eligibleAmount;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public String getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(String loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public String getLoanEndDate() {
		return loanEndDate;
	}

	public void setLoanEndDate(String loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

}
