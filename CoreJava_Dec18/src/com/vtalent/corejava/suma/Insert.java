package com.vtalent.corejava.suma;

import java.util.Scanner;

public class Insert {

		private int empId;
		private double empSalary;
		private long mobile;
		public void setEmpId(int empId){
			this.empId = empId;
		}
		public void setEmpSalary(double empSalary){
			this.empSalary = empSalary;
		}
		public void setMobile(long mobile){
			this.mobile = mobile;
		}
		public int getEmpId(){
			return empId;
		}
		public double getEmpSalary(){
			return empSalary;
		}
		public long getMobile(){
			return mobile;
	}
		

	
		static Insert[] er = new Insert[5];


public static void main(String[] args)
{
	Insert e1=new Insert();

	for(int k=0;k<=er.length-1;k++){
		er[k]=k+;
	}
	
	
		
		System.out.println(er[0]);
	Scanner input =new Scanner(System.in);
	System.out.println("Select an option");
	int option=input.nextInt();
	System.out.println("Enter empId");
	int empId = input.nextInt();
	System.out.println("Enter Salary");
	double empSalary=input.nextDouble();
	System.out.println("Enter Mobile");
	double mobile=input.nextLong();
	System.out.println("EmpId="+empId+" "+"empSalary="+empSalary+" "+"Mobile"+mobile);
	er[0]=e1;
	


	
	
		
}
}
}