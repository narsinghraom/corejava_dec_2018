package com.vtalent.chamu;

import java.util.Scanner;

public class EmpTest 
{
	public static void main(String[] args) 
	{
		EmpArray obj =new  EmpArray();
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1.InsertData");
			System.out.println("2.Display");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.DispOneEmpDetails");
			System.out.println("6.Exit");
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				Employee emp = new Employee();
				System.out.println("Enter Emp data");
				System.out.println("enter Id");
				emp.setId(sc.nextInt());
				System.out.println("Enter sal");
				emp.setSalary(sc.nextDouble());
				System.out.println("enter mblno");
				emp.setMblno(sc.nextLong());
				EmpArray.insertData(emp);
				break;
			case 2:
				EmpArray.display();
				break;
			case 3:
				EmpArray.update(101);
				break;
			case 4:
				EmpArray.delete(101);
				break;
			case 5:
				EmpArray.displayOneEmpDetails(101);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			
			}	
		
		
		}
		
	}

}
