package com.vtalent.corejava.suma;
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("Enter empId");
		int empId = input.nextInt();
		System.out.println("Enter Salary");
		double empSalary=input.nextDouble();
		System.out.println("EmpId="+empId+" "+"empSalary="+empSalary);
		
	}

}
