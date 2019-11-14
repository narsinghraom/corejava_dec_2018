package com.vtalent.laxmisomi;

import java.util.Scanner;
public class DBAnother {
	static EmployeeSQL employeesql =new EmployeeSQL();
	static DBOperations dbOperations = new DBOperations();
public static void main(String args[]) {
	 Scanner input = new Scanner(System.in);
		
		for(;;) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Please select your choice: \r\n" +
						"1. insert the data in to db.\r\n" + 
						"2. delete data from table.\r\n" +
						"3. update the data in to db.");
				int ch = sc.nextInt();
				switch(ch) {
				case 1: 
			    
				System.out.println("Enter the employee Details");
				System.out.println("Enter Employee Id");
				employeesql.setEmployeeId1(input.nextInt());
				System.out.println("Enter employee Name");
				employeesql.setEmployeeName1(input.next());
				System.out.println("enter employee Salary");
				employeesql.setEmployeeSalary1(input.nextLong());

				
				int result = dbOperations.insertDataWithStatement(employeesql);
				if(result>0) {
					System.out.println("Insert Sucessfully");
				}else {
					System.out.println("Operation failed please try again");
				}

				break;
				case 2: 
					System.out.println("Enter Id to be deleted");
					int deleteid=sc.nextInt();
					employeesql.setEmployeeId1(deleteid);
					int result1 = dbOperations.deleteDataWithStatement(employeesql);
					if(result1>0) {
						System.out.println("deleted successfully");
						
					}else {
						System.out.println("invalid");
					}
				
				break;
				case 3:
					System.out.println("Enter name to be updated");
					String name2=sc.next();
					employeesql.setEmployeeName1(name2);
					System.out.println("Enter Id to which name is to be update");
					int upid=sc.nextInt();
					employeesql.setEmployeeId1(upid);
					int result2 = dbOperations.updateDataWithStatement(employeesql);
					if(result2>0) {
						System.out.println("updated successfully");
						
					}else {
						System.out.println("invalid");
					}
					
					
				
				
				}
		}
		
	}



}
