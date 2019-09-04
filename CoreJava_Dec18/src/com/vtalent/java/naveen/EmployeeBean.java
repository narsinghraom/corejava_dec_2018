package com.vtalent.java.naveen;
class  Ebean{
	
	private int eid;
	private String ename;
	private double salary;
	//setters and getters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
		}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public double getsalary() {
		return salary;
		}
	public void setsalary(double salary) {
		this.salary=salary;
	}
}
//test class
public class EmployeeBean {
public static void main(String[] args) {
	 Ebean e1=new  Ebean();
	 e1.setEid(101);
	 e1.setEname("naveen");
	 e1.setsalary(20000.0);
	 System.out.println(e1.getEid()+" , "+e1.getEname()+",  "+e1.getsalary());
}
}
