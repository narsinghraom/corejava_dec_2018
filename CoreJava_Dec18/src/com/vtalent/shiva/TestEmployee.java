package com.vtalent.shiva;

import java.util.*;

public class TestEmployee {
	public static void main(String[] args) {
		EmployeeBean pl = new EmployeeBean();
		Scanner sc1=new Scanner(System.in);
		for(;;) {
			System.out.println("Please select your choice:\r\n" + 
					"1. insert Into Array.\r\n" + 
					"2. delete from my Array.\r\n" + 
					"3. Search an employee from my Array.\r\n" + 
					"4. Print All the employees from my Array.\r\n" + 
					"5. Exit.");
			int scan=sc1.nextInt();
			switch (scan) {
			case 1 : pl.insert();
			break;
			case 2 : pl.delete();
			break;
			case 4 : pl.printAll();
			break;
			
			case 5 : 
				return;
			default: System.out.println("Enter valied input: ");
			}
		}
	}
}
	


