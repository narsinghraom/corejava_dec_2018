package com.vtalent.swamy;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="n";
	
		do {
			System.out.println("1:insert into Array");
		System.out.println("2:delete from my  Array");
		System.out.println("3.search By EmpID");
		System.out.println("4:print the all the employees from my  Array");
		System.out.println("5: Search by EmpName ");
		System.out.println("6: update array");
		System.out.println("7:exit");
		System.out.println("please select your option: in between{1 to 7]");
		int option=sc.nextInt();
			switch(option) {
	case 1:System.out.println( "select your array size");
		//object for been class
		EmployeeBeen eb=null;
	//	System.out.println(EmployeeEx.emparry.length);//its print array of size
		for(int i=0;i<=EmployeeEx.emparry.length-1;i++) {
      eb=new EmployeeBeen();
      System.out.println("insert into Array");
		System.out.println("please enter  your id ");
		int i1=sc.nextInt();
		eb.setEmpid(i1);
		System.out.println("please enter your name");
		String c=sc.next();
		eb.setEmpname(c);
		System.out.println("please enter  your salary");
		double d=sc.nextDouble();
		eb.setEmpsalary(d);
		System.out.println("please enter  your mobile");
		long l=sc.nextLong();
		eb.setEmpmobile(l);
		int k=EmployeeEx.insert(eb);
		if(k==1) {
			System.out.println("inserted");
		}else
			System.out.println("not inserted array is full");
		}
		break;
	case 2:System.out.println("delete from my  Array");
		
		    eb=new EmployeeBeen();
				System.out.println("please enter  your id ");
				int i1=sc.nextInt();
				eb.setEmpid(i1);
		int p=EmployeeEx.delete(eb);
				if(p==1) {
					System.out.println("deleted");
				}else
					System.out.println("Invalid id");
		break;
	case 3:System.out.println("search an employee id from my  Array");
				eb=new EmployeeBeen();
				System.out.println("please enter  your id ");
				int i2=sc.nextInt();
				eb.setEmpid(i2);
				int r=EmployeeEx.searchById(eb);
				if(r==1) {
					System.out.println(" obj displayed");
				}else
					System.out.println(" obj not found");
		break;
	case 4:System.out.println("print the all the employees from my  Array");
				EmployeeEx.displayAll();
				break;
	case 5:System.out.println("Search by Name");

	eb=new EmployeeBeen();
	System.out.println("please enter Name");
	String s1=sc.next();
	eb.setEmpname(s1);
	int d=EmployeeEx.searchById(eb);
	if(d==1) {
		System.out.println(" obj displayed");
	}else
		System.out.println(" obj not found");
		break;
	case 6:System.out.println("update");
	for(int i=0;i<=EmployeeEx.emparry.length-1;i++) {
	      eb=new EmployeeBeen();
	      System.out.println("insert into Array");
			System.out.println("please enter  your id ");
			int i3=sc.nextInt();
			eb.setEmpid(i3);
			System.out.println("please enter your name");
			String c=sc.next();
			eb.setEmpname(c);
			System.out.println("please enter  your salary");
			double d1=sc.nextDouble();
			eb.setEmpsalary(d1);
			System.out.println("please enter  your mobile");
			long l=sc.nextLong();
			eb.setEmpmobile(l);
			int k=EmployeeEx.insert(eb);
			if(k==1) {
				System.out.println("inserted");
				break;
			}else
				System.out.println("not inserted array is full");
			break;
			}
			break;
	case 7:System.out.println("exit");
						System.exit(0);
		break;
			}	System.out.println("continue press  Y");
	s=sc.next();

	}while(s.equalsIgnoreCase("y"));
		System.out.println("terminated");
		}
	}


