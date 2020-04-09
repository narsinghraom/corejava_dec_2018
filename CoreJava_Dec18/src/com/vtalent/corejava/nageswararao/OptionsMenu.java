package com.vtalent.corejava.nageswararao;

import java.util.Scanner;
import java.util.*;

public class OptionsMenu {
	Scanner Input=new Scanner(System.in);
	EmployeeBean e=new EmployeeBean();
    int n=1;{
    
    while(n>0) {
    	System.out.println("1=Create Employee");
    	System.out.println("2=Delete Employee");
    	System.out.println("3=Update Employee");
    	System.out.println("4=Search Employee");
    	System.out.println("5=Select All Employees");
    	System.out.println("6=Exit Employee");
	int selection=Input.nextInt();
	
	switch(selection)
	{
	case 1:
		e.createEmployee();
		break;
		
	case 2:
		e.deleteEmployee();
		break;
	case 3:
		e.updateEmployee();
		System.out.println("Employee Details Successfully Updated");
		break;
	case 4:
		e.searchEmployee();
		break;
	case 5:
		e.selectAllEmployees();
		break;
	case 6:
		System.out.println("Good Bye");
		System.exit(0);
	default:
		System.out.println("Invalid Selection");
		break;
		
	}

}
}
	public static void main(String[] args) {
	OptionsMenu optionsMenu = new OptionsMenu(); 
	}
    }
