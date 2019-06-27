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
