package com.vtalent.ram;
import java.util.*;
 class Empdata {
public static void main(String[] args) {
	boolean d=false;
	Scanner input=new Scanner(System.in);
	Scanner sc=new Scanner(System.in);
	double empSalary;
	System.out.println("how many employees do u want to store in an array");
	int m=input.nextInt();
	Emp_Data[] emp=new Emp_Data[m];
	while(d==false){
	System.out.println("Select any option");
	System.out.println("1.Insert employee data");
	System.out.println("2.Delete employee data");
	System.out.println("3.Update employee data");
	System.out.println("4.View employees data");
	System.out.println("5.Exit");
int choose=sc.nextInt();
	switch (choose) {
	case 1:
		for(int i=0 ;i<=emp.length-1;i++)
		{
			emp[i]=new Emp_Data();
			System.out.println("enter the empid u want to insert");
			int id=sc.nextInt();
			emp[i].setEmpId(id);
			System.out.println("enter the empsal u want to insert");
			int sal=sc.nextInt();
			emp[i].setEmpSalary(sal);
			
		}
		System.out.println("Array is full");
		break;
	case 2:
		System.out.println("enter the empid to be removed");
		int empId=sc.nextInt();
		
	case 3:
		
	case 4:
	
	case 5:
		
		
	}
	

}
}
}