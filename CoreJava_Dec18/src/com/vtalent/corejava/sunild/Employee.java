package com.vtalent.corejava.sunild;


import java.util.Scanner;

public class Employee {
	
	int empId;
	double Salary;
	long mobileNo;
	void getData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a employee id:");
		empId=sc.nextInt();
		System.out.println("Enter employee salary");
		Salary=sc.nextDouble();
		System.out.println("Enter employee mobileNo");
		mobileNo=sc.nextLong();
	}
	void putData()
	{
		System.out.println(empId+ "\t" +  Salary+ "\t" + mobileNo);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value of employees data:");
		int empSize=sc.nextInt();
		Employee[] obj= new Employee[empSize];
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new Employee();
		}
		for(int i=0;i<obj.length;i++)
		{
			obj[i].getData();
		}
		for(int i=0;i<obj.length;i++)
		obj[i].putData();
	}

}
