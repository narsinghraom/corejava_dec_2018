package com.vtalent.swamy;

import java.io.Serializable;

public class EmployeeBeen implements Serializable{
private int  empid;
private String empname;
private  double empsalary;
private long empmobile;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(double empsalary) {
	this.empsalary = empsalary;
}
public long getEmpmobile() {
	return empmobile;
}
public void setEmpmobile(long empmobile) {
	this.empmobile = empmobile;
}
@Override
public String toString() {
	return "EmployeeBeen [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empmobile="
			+ empmobile + "]";
}

}
