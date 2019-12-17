package com.vtalent.aasritha.basic;
import java.util.*;
public class Employee {
		int employeeId;
		float employeeSalary;
		long employeeMobileNo;
		static Scanner input = new Scanner(System.in);
		static int emparry[];
		static int num,temp, j,i;	
		public int insert(int j) {
			
			System.out.println("enter "+j+" value");
			emparry[j]=input.nextInt();
			j=j+1;
			System.out.println("j value is "+j+" value");
			
			System.out.println("enter employee id");
			employeeId=input.nextInt();
			System.out.println("enter employee salary");
			employeeSalary=input.nextFloat();
			System.out.println("enter employee mobile no");
			employeeMobileNo=input.nextLong();
			return	j;


	}
		public void delete() {
			System.out.println("del");	
	}
	public void search() {
		System.out.println("search");
	}

	public static void main(String[] args) {
		 int a;
		 int j=0;
		 boolean x=false;
		 System.out.println("enter number of employees to create");
		 num=input.nextInt();
		 emparry=new int[num];
		 Employee emp= new Employee();
		 
		temp=num;
	do {
		System.out.println("enter 1  insert");
		System.out.println("enter 2  Delete");
		System.out.println("enter 3  search");
		System.out.println("enter 4 for exit");	
		a=input.nextInt();
	switch (a)
	{
	case 1:
		if(emparry.length>j) {
			j=emp.insert(j);
		
		}else {
			System.out.println("aray is full");	
		
	}
	x=true;
		break;
	case 2:emp.delete();
	x=true;
		break;
	case 3:emp.search();
	x=true;
		break;
	case 4:	
		x=false;
		break;	
	default: System.out.println("invalid");
	x=true;	
	}




	}while(x==true);
	for ( i=0; i<num; i++)
	{
		System.out.println(emparry[i]);
		
		}
	}

	}
	
	
