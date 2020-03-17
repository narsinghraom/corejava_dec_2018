package com.vtalent.corejava.siva;


public class Encap1 {
	public static void main(String[] args) {
		Encap obj=new Encap();
		obj.setEmpId(100);
		obj.setEmpSalary(25000);
		obj.setEmpPhoneNo(9876543210l);
		System.out.println("Emp Id:"+obj.getEmpId() + "\nEmp Salary:" + obj.getEmpSalary() + "\nEmp Phone No:" + obj.getEmpPhoneNo());
	}

}
