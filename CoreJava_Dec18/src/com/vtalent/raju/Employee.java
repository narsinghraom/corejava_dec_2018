package com.vtalent.raju;

import java.io.Serializable;

public class Employee implements Serializable {
	private int ID;
	private String Name;
	private String MobileNumber;
	private double Package;
	private double Salary;
	private double PF;
	private float LoanAmount;
	private float EMI;
	private float Year;
	private float Interest;
	private String StartingDate;
	private String EndDate;

	public void setID(int iD) {
		ID = iD;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public void setPackage(double package1) {
		Package = package1;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public void setPF(double pF) {
		PF = pF;
	}

	public void setLoanAmount(float loanAmount) {
		LoanAmount = loanAmount;
	}

	public void setEMI(float eMI) {
		EMI = eMI;
	}

	public void setYear(float year) {
		Year = year;
	}

	public void setInterest(float interest) {
		Interest = interest;
	}

	public void setStartingDate(String startingDate) {
		StartingDate = startingDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public double getPackage() {
		return Package;
	}

	public double getSalary() {
		return Salary;
	}

	public double getPF() {
		return PF;
	}

	public float getLoanAmount() {
		return LoanAmount;
	}

	public float getEMI() {
		return EMI;
	}

	public float getYear() {
		return Year;
	}

	public float getInterest() {
		return Interest;
	}

	public String getStartingDate() {
		return StartingDate;
	}

	public String getEndDate() {
		return EndDate;
	}

}
