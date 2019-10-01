package com.employee.been;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
EmployeeBeen[] emparry=new EmployeeBeen[3];

		Scanner sc=new Scanner(System.in);
		System.out.println("please select your option:");
		int option=sc.nextInt();
		switch(option) {
		case 1:System.out.println("insert into Array");
		break;
		case 2:System.out.println("delete from my  Array");
		break;
		case 3:System.out.println("search an employee from my  Array");
		break;
		case 4:System.out.println("print the all the employees from my  Array");
		break;
		case 5:System.out.println("exit");
		break;
		}
		if(option<=5&&option==1) {
		System.out.println("enter id");
		int id=sc.nextInt(); 
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		System.out.println("enter mobile");
		long mobile=sc.nextLong();
		EmployeeBeen emb=new EmployeeBeen();
		EmployeeBeen emb1=new EmployeeBeen();
		EmployeeBeen emb2=new EmployeeBeen();
		emb.setId( id);
		emb.setSalary(salary);
		emb.setMobile(mobile);
		emb1.setId( id);
		emb1.setSalary(salary);
		emb1.setMobile(mobile);
		emb2.setId( id);
		emb2.setSalary(salary);
		emb2.setMobile(mobile);
		emparry[0]=emb;
		emparry[1]=emb1;
		emparry[2]=emb2;
		}
	for(int i=0;i<=emparry.length-1;i++) {

		EmployeeBeen emp=	emparry[i];
		System.out.println("id="+emp.getId()+"  salary="+emp.getSalary()+"  mobile="+emp.getMobile());
	}
		if(option==3) {
	EmployeeBeen emp=	emparry[0];
	System.out.println("id="+emp.getId()+"  salary="+emp.getSalary()+"  mobile="+emp.getMobile());
		}}
	}



