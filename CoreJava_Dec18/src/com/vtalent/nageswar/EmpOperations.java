package com.vtalent.nageswar;

import java.util.Scanner;

public class EmpOperations {
 
	static Employee[] empArray;
	Scanner sc=new Scanner(System.in);
	public static void InsertData(Employee empl) {
		if(empArray!=null) {
			for(int i=0;i<=empArray.length-1;i++) {
				if(empArray[i]==null) {
					empArray[i]=empl;
			        break;
				}     
			}
			System.out.println("successsfully inserted \n");
		}
		else {
			System.out.println("not allowed to insert the values");
		}
		
	}
	public void printAllData() {
		if(empArray!=null) {
			for(int i=0;i<=empArray.length-1;i++) {
				
			}
		}
	}
}
