package com.vtalent.vinodreddy;

import java.util.Scanner;

public class EmployeeTest{
	static EmployeeBean b;
	 static Scanner sc =new Scanner(System.in);
		public static void main(String[] args) {
		
		 b =new EmployeeBean();
		for(;;) {
		System.out.println("Please Select Your Choice\n"
				+ "1.insert Into Array.\n"
				+ "2.delete from my Array.\n"
				+ "3.Search an employee from my Array.\n"
				+ "4.Print All the employees from my Array.\n"
				+ "5.Search with employee name letter\n"
				+ "6. enter the employee deatils to be update \n"
				+ "7.Exit.");
         int n =sc.nextInt();
            switch (n) {
				case 1:
				b.insert();
				
				break;
	         	case 2:
	        	 b.delete();		        
	        	 
	        	 break;
	         	case 3:
	        		b.search();
	        		
	        		break;
	        	case 4:
	        		b.pritntAllData();
	        		
	        		break;
	        	case 5:
	        		b.searchwithemployeeName();
	        		
	        		break;
	        	case 6:
	        		b.updatedetails();
	        		
	        		break;
	        	case 7:
	        		System.exit(0);
	        		break;
	}
	}
		
	
        
	}
	
	}
	

      
	
       




