package com.vtalent.srihari;

import java.util.Scanner;

public class StdempTest {
	public static void main(String[] args) {
		StudentEmp std = new StudentEmp();
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter sno");
		int sno =sc.nextInt();
		std.setSno(sno);
		System.out.println("enter Name");
		String stdempname=sc.next();
		std.setStdempname(stdempname);
		System.out.println("enter mobile no");
		Double stdempmobile =sc.nextDouble();
		std.setStdempmobile(stdempmobile);
		System.out.println("enter salary");
		Double stdempsalary =sc.nextDouble();
		std.setStdempsalary(stdempsalary);
		
				
		/*std.setSno(7);
		std.setStdempname("Praveen");
		std.setStdempmobile(9551211.0);
		std.setStdempsalary(50000.0);	*/
		
		DBOperations db = new DBOperations();
		int rest =db.insertDataStatement(std);
		System.out.println("inserted");
	}

}
