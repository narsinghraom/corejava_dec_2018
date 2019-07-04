package com.vtalent.vittalharish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeCollectionOperation {

	Employee emp;

	static ArrayList<Employee> array = new ArrayList<>();

	Scanner input = new Scanner(System.in);

	public static void insertData(Employee emp) {
		if (array != null) {
			array.add(emp);
			DBOperations2 db = new DBOperations2();
			int result = db.InsertDataWithStatement(emp);
			System.out.println("Sucessfully Inserted." + '\n');

		}
		else{
			System.out.println("data not inserted");
		}
	}
	
	public void printAllData() {
		if (array != null) {
			DBOperations2 db = new DBOperations2();
			List<Employee> listofemployee = db.Print();
			for(Employee emp1:array) {
				System.out.println("Employee ID: " + emp1.getEmployeeID() 
						+ "      " + "Employee Name: " + emp1.getEmployeeName()
						+ "      " + "Employee Mobile Number: " + emp1.getEmpolyeeMobileNumber() 
						+ "      " + "Employee Package: " + emp1.getEmployeePackage() 
						+ "      " + "Employee Salary: " + emp1.getEmployeeSalary() 
						+ "      " +"Employee PF: " + emp1.getEmployeePF());

			} 
		} else {
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}

	public void searchData() {
			System.out.println("Enter The Employee ID:");
		
			int x = input.nextInt();
			DBOperations2 db = new DBOperations2();
			//db.Search(x);
			List<Employee> listofemployee = db.Search(x);
			if(listofemployee!=null && !listofemployee.isEmpty()){
				
			for (Employee emp1 : array) {
				if (x == emp1.getEmployeeID()) {
					System.out.println("Employee ID: " + emp1.getEmployeeID() 
							+ "      " + "Employee Name: " + emp1.getEmployeeName()
							+ "      " + "Employee Mobile Number: " + emp1.getEmpolyeeMobileNumber() 
							+ "      " + "Employee Package: " + emp1.getEmployeePackage() 
							+ "      " + "Employee Salary: " + emp1.getEmployeeSalary() 
							+ "      " +"Employee PF: " + emp1.getEmployeePF());
				} else {
					System.out.println("Enter the Valid Id" + '\n');
				}
			}
		}
}

	public void deleteEmployee() {
		int re = 0;
		if (array != null) {
			for (Employee emp1 : array) {
				System.out.println(emp1.getEmployeeID());

			}

			System.out.println("Enter the Id to be Deleted");
			int x = input.nextInt();
			for (Employee emp1 : array) {
				if (x == emp1.getEmployeeID()) {
              array.remove(re);
					System.out.println("Deleted");
				}
				re++;

			}

		} else {
			System.out.println("No Data Found" + '\n');
		}

	}	
	
	public void updateData() {
		if (array != null) {
			for (Employee emp1 : array) {
				System.out.println(emp1.getEmployeeID() );
			}

			System.out.println("Enter the Id to be Updated" + '\n');
			int x = input.nextInt();
			for (Employee emp2 : array) {
				if (x == emp2.getEmployeeID()) {
					System.out.println("Enter the new Package to be Updated" + '\n');
					double P = input.nextDouble();
					emp2.setEmployeePackage(P);

					double S = P / 12;
					double pf = S * 0.02;
					S = S - pf;
					emp2.setEmployeeSalary(S);
					emp2.setEmployeePF(pf);

				}
			}
		}

		else {
			System.out.println("First Insert Employee Data" + '\n');
		}

	}
	
}
