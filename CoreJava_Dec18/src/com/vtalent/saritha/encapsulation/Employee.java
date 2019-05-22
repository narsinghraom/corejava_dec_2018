package com.vtalent.saritha.encapsulation;

public class Employee {
	private int EmpId;
	private double EmpSalary;
	private void SetEmpId(int EmpId){
	this.EmpId=EmpId;
	}
	public void SetEmpSalary(double EmpSalary){
	this.EmpSalary=EmpSalary;
}
public int getEmpId(){
	return EmpId;
}
public double getEmpSalary(){
	return EmpSalary;
}
}
