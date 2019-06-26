package com.vtalent.amreen;

import java.io.Serializable;

public class Employee implements Serializable {
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Salary=" + Salary + ", ename=" + ename
				+ ", salpackage=" + salpackage + "]";
	}

	private int Id;
	private double Salary;
	private float LoanAmount;
	private float EMI;
	private float Year;
	private float Interest;
	private String StartingDate;
	private String EndDate;

	public float getEMI() {
		return EMI;
	}

	public void setEMI(float eMI) {
		EMI = eMI;
	}

	public float getYear() {
		return Year;
	}

	public void setYear(float year) {
		Year = year;
	}

	public float getInterest() {
		return Interest;
	}

	public void setInterest(float interest) {
		Interest = interest;
	}

	public String getStartingDate() {
		return StartingDate;
	}

	public void setStartingDate(String startingDate) {
		StartingDate = startingDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public float getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		LoanAmount = loanAmount;
	}

	public double getSalpackage() {
		return salpackage;
	}

	public void setSalpackage(double salpackage) {
		this.salpackage = salpackage;
	}

	private String ename;
	private double salpackage;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {

		Salary = salary;
		Salary = Salary / 12;
		double pf = 0.02 * Salary;
		Salary = Salary - pf;
	}

}
