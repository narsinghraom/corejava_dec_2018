package com.vtalent.vinodreddy;

import java.util.Scanner;

public class EmployeeTest{
	static EmployeeBean a;
	 static Scanner sc =new Scanner(System.in);
		public static void main(String[] args) {
		
		 a =new EmployeeBean();
		for(;;) {
		System.out.println("Please Select Your Choice\n"
				+ "1.insert Into Array.\n"
				+ "2.delete from my Array.\n"
				+ "3.Search an employee from my Array.\n"
				+ "4.Print All the employees from my Array.\n"
				+ "5.Exit.");
         int n =sc.nextInt();
            switch (n) {
			case 1:
				a.insert();
				
				break;
	         case 2:
	        	 a.delete();		        
	        	 
		     break;
	         case 3:
	        	 a.search();		        
	        	
		     break;
	         case 4:
	        	 a.pritntAllData();		        
	        	
		     break;
	         case 5:
	        	 System.exit(0);		        
	        	
		     break;
	}
	}
		
	
        
	}
	
	}
	

      
	
       




