package com.vtalent.java.vishnu;

import java.util.Scanner;

class ArrayEmp {
	int eid;
	double esalary;
	long emobile;
	static ArrayEmp[] empArray = new ArrayEmp[4];

	public static void insertData() {

		for (int i = 0; i <= empArray.length - 1; i++) {
			ArrayEmp emp = new ArrayEmp();
			emp.eid = 100 + i;
			emp.esalary = 2500 * (10 + i);
			emp.emobile = 789383 + (i * 2);
			empArray[i] = emp;
		}
		displayEmp();
	}

	public static void displayEmp() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			ArrayEmp emp = (ArrayEmp) empArray[i];
			System.out.println("id	=	" + emp.eid + "	salary	=	" + emp.esalary + "	mobile	=	" + emp.emobile);

		}
	}

	public static void displayOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		int temp = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			ArrayEmp emp = (ArrayEmp) empArray[i];

			// if(temp==(emp.eid))
			// {
			System.out.println(emp.eid + " " + emp.esalary + " " + emp.emobile);
			// }
			// Scanner sc1=new Scanner(System.in);
			// System.out.println("enter the id");
			// int id=sc.nextInt();
			//

			emp.esalary = emp.esalary + 5000;

			System.out.println(emp.eid + " " + emp.esalary + " " + emp.emobile);

		}

	}

	public static void main(String args[]) {
		insertData();
		displayEmp();
		displayOne();
	}

}
