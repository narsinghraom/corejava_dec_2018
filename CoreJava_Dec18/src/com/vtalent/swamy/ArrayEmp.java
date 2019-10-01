package com.vtalent.swamy;

import java.util.Scanner;

class ArrayEmp {
	int eid;
	double esalary;
	long emobile;
	static ArrayEmp[] empArray = new ArrayEmp[6];

	public static void insertData() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			ArrayEmp emp = new ArrayEmp();
			emp.eid = 100 + i;
			emp.esalary = 2500 * (10 + i);
			emp.emobile = 789383 + (i * 2);
			empArray[i] = emp;
		}
	}

	public static void displayEmp() {
		for (int i = 0; i <= empArray.length - 1; i++) {
			if (null != empArray[i]) {
				ArrayEmp emp = (ArrayEmp) empArray[i];

				System.out.println("id=" + emp.eid + "salary=" + emp.esalary + "mobile=" + emp.emobile);
			}

		}
	}

	public static void displayOne() {
		// int temp=101;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no:");
		int temp = sc.nextInt();
		for (int i = 0; i <= empArray.length - 1; i++) {
			/*if (null == empArray)
				return;// null check logic
*/			ArrayEmp emp = empArray[i];
			
			if (temp == (emp.eid)) {
				System.out.println(emp.eid + " " + emp.esalary + " " + emp.emobile);
			}
				else
				System.out.println("no recoed found");
			 }
		}
	public static void main(String args[]) {
		insertData();
		displayEmp();
		displayOne();
	}

}
