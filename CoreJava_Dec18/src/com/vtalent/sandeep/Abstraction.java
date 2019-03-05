package com.vtalent.sandeep;

import java. util. Scanner ;
	
public class Abstraction {
	
	private static Scanner Scn;
	static int n = 0;
	static int empid;
	static int emp;
	
public static void main(String[]args)	{
	 boolean done = false;
	 boolean deletecheck = false;
	 
	 Scn = new Scanner(System.in);
	 System.out.println("Enter number howmany employees do you want store");
	 int n= Scn.nextInt();
System.out.println(n);
Employee[]emp=new Employee[n];
Employee [] =  newArr=  null;

while(done=false){
	System.out.println("1.Insert EmployeeData");
	System.out.println("2.Delete Employee Data");
	System.out.println("3.View Employee data");
	System.out.println("4.update");
	System.out.println("5.exit");
	int choose = Scn.nextInt();
switch(choose){
case 1:
	System.out.println("you choose insert employee data");
	for(int i=0; i<emp.length; i++){
		emp[i]=new Employee();
		System.out.println("enter employee id");
		int empid=Scn.nextInt();
		emp[i].getEmpid();
		System.out.println("enter employee salary");
		double empsalary =Scn.nextDouble();
		emp[i].getEmpsal(empsalary);
		System.out.println(empid+" "empSalary);
		
		
		
		
		
	}

	
	
}
	
}
}
	

}
