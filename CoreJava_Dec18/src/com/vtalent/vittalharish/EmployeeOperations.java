package com.vtalent.vittalharish;

import java.util.List;
import java.util.Scanner;




class EmployeeOperations {
	Employee emp;
	DBOperations2 db = new DBOperations2();

	static Employee[] emparray;

	Scanner input = new Scanner(System.in);

	public static void insertData(Employee emp) {
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {
				if (emparray[i] == null) {
					emparray[i] = emp;
					DBOperations2 db = new DBOperations2();
					int result = db.InsertDataWithStatement(emp);

					break;
				}

			}
			System.out.println("Sucessfully Inserted." + '\n');
		}

		else {
			System.out.println("Already Inserted." + '\n');

		}

	}

	public void printAllData() {
			//DBOperations2 db = new DBOperations2();
			List<Employee> listofemployee = db.Print();
			if(listofemployee!=null ){

			for (Employee emp:listofemployee) {
				//System.out.println(emp.getEmployeeID() +" " + emp.getEmployeeName() + " " + emp.getEmployeeSalary() + " " + emp.getEmpolyeeMobileNumber());
				System.out.println("Employee ID: " + emp.getEmployeeID() 
				+ "      " + "Employee Name: " + emp.getEmployeeName()
				+ "      " + "Employee Package: " + emp.getEmployeePackage() 
				+ "      " + "Employee Salary: " + emp.getEmployeeSalary() 
				+ "      " + "Employee Mobile Number: " + emp.getEmpolyeeMobileNumber() 
				+ "      " +"Employee PF: " + emp.getEmployeePF());
			}
			/*for (int i = 0; i <= emparray.length - 1; i++) {
				Employee emp1 = emparray[i];
				System.out.println("Employee ID: " + emp1.getEmployeeID() 
						+ "      " + "Employee Name: " + emp1.getEmployeeName()
						+ "      " + "Employee Mobile Number: " + emp1.getEmpolyeeMobileNumber() 
						+ "      " + "Employee Package: " + emp1.getEmployeePackage() 
						+ "      " + "Employee Salary: " + emp1.getEmployeeSalary() 
						+ "      " +"Employee PF: " + emp1.getEmployeePF());

			} */
		} else {
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}

	public void updateData() {
		List<Employee> listofemployee = db.Print();
		if (listofemployee != null) {

			for (Employee emp : listofemployee) {
				System.out.println("Employee ID: " + emp.getEmployeeID());
			}

		}
		System.out.println("Enter the Id to be Updated" + '\n');
		int x = input.nextInt();

		List<Employee> emps = db.Search(x);
		// for (int i = 0; i <= emparray.length - 1; i++) {
		// Employee emp2;
		// emp2 = emparray[i];
		if (!emps.isEmpty()) {
			while (true) {

				for (Employee emp : emps) {
					String name = emp.getEmployeeName();
					System.out.println("Your Current Name is   -- " + name);

				}

				System.out.print("Do You Want To update your Name (Y/N) ?");
				String userInput = input.next();
				if (userInput.equalsIgnoreCase("Y")) {
					System.out.println("enter new name to be  updated");
					// String updatedname = input.next();
					String updatedname = input.next();

					for (Employee emp : emps) {

						emp.setEmployeeName(updatedname);

						db.updateEmployee(emp);
					}

					System.out.println("your name is updated");
					break;

				} else if (userInput.equalsIgnoreCase("N")) {

					break;
				}
			}

			while (true) {
				for (Employee emp : emps) {
					String mobile = emp.getEmpolyeeMobileNumber();
					System.out.println("Your Current mobile number is   -- " + mobile);

				}

				System.out.println("do you want to update you mobile number (Y/N) ?");
				String userInput1 = input.next();
				if (userInput1.equalsIgnoreCase("Y")) {
					System.out.println("enter new mobile number to be  updated");
					String updatemobile = input.next();

					for (Employee emp : emps) {

						emp.setEmpolyeeMobileNumber(updatemobile);
						

						db.updateEmployee(emp);
					}

					System.out.println("your mobile is updated");
					break;

				} else if (userInput1.equalsIgnoreCase("N")) {
					break;

				}

			}
			while (true) {
			for (Employee emp : emps) {
				Double salaryp = emp.getEmployeePackage();
				System.out.println("Your Current package is   -- " + salaryp);

			} 
			System.out.println("do you want to update your package(Y/N) ?");
			String userinput = input.next();
			
			if (userinput.equalsIgnoreCase("Y")) {
				System.out.println("enter new packager to be  updated");
				Double updatepackage = input.nextDouble();

				for (Employee emp : emps) {

					emp.setEmployeePackage(updatepackage);
					
				
			    	
					double S = updatepackage / 12;
					double pf = S * 0.02;
					S = S - pf;
					emp.setEmployeeSalary(S);
					//emp.setEmployeePF(pf);
					

					db.updateEmployee(emp);
				}

				System.out.println("your package is updated");
				break;

			} else if (userinput.equalsIgnoreCase("N")) {
				break;

			}
			}

		} else {
			System.out.println("First Insert Employee Data" + '\n');
		}

	}
		/*
		 * if (x == emp2.getEmployeeID()) {
		 * System.out.println("Enter the new Package to be Updated" + '\n'); double P =
		 * input.nextDouble(); emp2.setEmployeePackage(P);
		 * 
		 * double S = P / 12; double pf = S * 0.02; S = S - pf;
		 * emp2.setEmployeeSalary(S); emp2.setEmployeePF(pf);
		 * 
		 * } }
		 */
	

	/*
	 * else { System.out.println("First Insert Employee Data" + '\n'); }
	 * 
	 * }
	 */
	public void searchData() {
			System.out.println("Enter The Employee ID:");
			//Employee emp1;
			int x = input.nextInt();
			//DBOperations2 db = new DBOperations2();
			//db.Search(x);
			List<Employee> listofemployee = db.Search(x);
			//for (int i = 0; i <= emparray.length - 1; i++) {
				//emp1 = emparray[i];
			if(listofemployee!=null && !listofemployee.isEmpty() ){

			for (Employee emp11:listofemployee) {
					
			System.out.println("Employee ID: " + emp11.getEmployeeID() 
							+ "      " + "Employee Name: " + emp11.getEmployeeName()
							+ "      " + "Employee Mobile Number: " + emp11.getEmpolyeeMobileNumber() 
							+ "      " + "Employee Package: " + emp11.getEmployeePackage() 
							+ "      " + "Employee Salary: " + emp11.getEmployeeSalary() 
							+ "      " +"Employee PF: " + emp11.getEmployeePF());
			}
		} else {
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}

	public void deleteEmployee() {
			//Employee emp1;
			//DBOperations2 db = new DBOperations2();
			List<Employee> listofemployee = db.Print();
			if(listofemployee!=null ){

			for (Employee emp:listofemployee) {
				System.out.println("Employee ID: " + emp.getEmployeeID() );
			}

			System.out.println("Enter the Id to be Deleted");
			int x = input.nextInt();
			int result2 = db.DeleteDataWithStatement(x);
			
					System.out.println("Deleted");
				}

			}

		/*} else {
			System.out.println("No Data Found" + '\n');
		}*/

	

	public void loandetails() {
		if(emparray!=null) {
			System.out.println("Enter Employee id to check Loan Eligibility");
				int a=input.nextInt();
				for ( int i = 0; i <= emparray.length - 1; i++) {
				emp = emparray[i];
				if(emparray[i]==null) {
				break;	
				}
				else if (a == emp.getEmployeeID()) {
					EmployeeOperations eo=new EmployeeOperations();
					eo.employeeLoan(emp.getEmployeeSalary());
					break;
					}
				 
					
		}
			}
				else {
					System.out.println("Insert the Employee Data first");
				}
		
		
	}

	private void employeeLoan(double employeeSalary) {
		try {
			if(employeeSalary<20000) {
				throw new EmployeeCustomLoanException();
			}
			else {
				System.out.println("This Employee is Eligible for Loan ");
			}
		}
		catch(EmployeeCustomLoanException e) {
			System.out.println(e);
		}
		
	}

}
