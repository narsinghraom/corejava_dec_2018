package com.vtalent.corejava.suma;
import java.util.Scanner;

public class Task {
	static EmpDetails[] eArray = new EmpDetails[6];
	
	public static void main(String[] args){
		
		System.out.println("1.Insert an Employee");
		System.out.println("2.Delete an Employee");
		System.out.println("3.Update an Employee");
		System.out.println("4.Search an Employee");		
		System.out.println("5.Search All");
		System.out.println("6.Exit");
		
		Scanner input =new Scanner(System.in);
		System.out.println("Select an option");
		int option=input.nextInt();
		System.out.println("Enter empId");
		int empId = input.nextInt();
		System.out.println("Enter Salary");
		double empSalary=input.nextDouble();
		System.out.println("Enter Mobile");
		double mobile=input.nextLong();
		System.out.println("EmpId="+empId+" "+"empSalary="+empSalary+" "+"Mobile"+mobile);
		System.out.println("Insertion Completed");
	
	      switch (option) {
	         case 1:
	           System.out.println("enter id to update");
		break;
	      case 2:
	    	  System.out.println("enter salary to update");
				break;
	      default: 
	        	 System.out.println("Invalid option. Try again"); 
	           break;
	      
	}
	  	EmpDetails ed = new EmpDetails();



	      for(int k=0;k<=eArray.length-1;k++){
	  		System.out.println(eArray[k]);
	  		System.out.println();
	  		
	  	}		
		}
		

	
		
		
		
		//EmpDetails eRef = new EmpDetails();
		//eRef.setEmpId(1);
		//eRef.setEmpSalary(20000);
		//eRef.setMobile(12345);
	
		
		
		
		
	}
