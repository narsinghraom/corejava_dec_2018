package com.vtalent.java.vishnu;


class test1{
	
	
	 private long employeeId;
		private long employeeSalary;
		private long empMobileNum;
	
public void setEmployeeId(long employeeId){
		this.employeeId=employeeId;
	}
public void setEmployeeSalary(long employeeSalary){
	this.employeeSalary=employeeSalary;
    }
public void setEmpmobileNum(long empMobile){
	this.empMobileNum=empMobile;
}
	public long getEmployeeId(){
	return this.employeeId;
}
	public double getEmployeeSalary(){
	return this.employeeSalary;
}	
	public long getEmpmobileNum(){
		return this.empMobileNum;
	}
	
}
public class EmployeeBean1 extends test1 {
	public static void main(String[] args) {
		test1 t=new test1();
		 Employee[] empArray=new  Employee[3];
		
	
		
		
		t.setEmployeeId(102);
		t.setEmployeeSalary(230000);
		t.setEmpmobileNum(999999999);
		System.out.println(t.getEmployeeId());
		System.out.println(t.getEmployeeSalary());
		System.out.println(t.getEmpmobileNum());
	}
}
