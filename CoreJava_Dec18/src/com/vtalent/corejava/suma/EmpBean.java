package com.vtalent.corejava.suma;

public class EmpBean {
private int empId;
private double empSalary;
public void setEmpId(int empId){
	this.empId = empId;
	
}

public void setEmpSalary(double empSalary){
	this.empSalary = empSalary;
}
public int getEmpId(){
	return empId;
}
public double getEmpSalary(){
	return empSalary;
}
static EmpBean[] eArray = new EmpBean[2];
	


}





