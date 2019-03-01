package com.vtalent.ram;

import java.util.Scanner;

class ScannerEx {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter empId");
	int empId=input.nextInt();
	System.out.println("enter emp salary");
double empSalary=input.nextDouble();
System.out.println("Id="+empId);
System.out.println("Salary="+empSalary);
}
}
