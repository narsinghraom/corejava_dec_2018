package com.vtalent.vittalharish;

import java.util.List;
import java.util.Scanner;


class EmployeeOperations {
	Employee emp;
	//Testing

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
		if (emparray != null) {
			DBOperations2 db = new DBOperations2();
			List<Employee> listofemployee = db.Print();
			//System.out.println("employeeID" + " " + "employeeName" + " " + "employeesalary" + " " + "employeemobile");
			for (Employee emp:listofemployee) {
				//System.out.println(emp.getEmployeeID() +" " + emp.getEmployeeName() + " " + emp.getEmployeeSalary() + " " + emp.getEmpolyeeMobileNumber());
				System.out.println("Employee ID: " + emp.getEmployeeID() 
				+ "      " + "Employee Name: " + emp.getEmployeeName()
				+ "      " + "Employee Mobile Number: " + emp.getEmpolyeeMobileNumber() 
				+ "      " + "Employee Package: " + emp.getEmployeePackage() 
				+ "      " + "Employee Salary: " + emp.getEmployeeSalary() 
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
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployeeID() );
			}

			System.out.println("Enter the Id to be Updated" + '\n');
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				Employee emp2;
				emp2 = emparray[i];
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

	public void searchData() {
		if (emparray != null) {
			System.out.println("Enter The Employee ID:");
			//Employee emp1;
			int x = input.nextInt();
			DBOperations2 db = new DBOperations2();
			db.Search(x);
			List<Employee> listofemployee = db.Search(x);
			//for (int i = 0; i <= emparray.length - 1; i++) {
				//emp1 = emparray[i];
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
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployeeID());

			}
			System.out.println("Enter the Id to be Deleted");
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				if (x == emp1.getEmployeeID()) {
					emparray[i] = null;
					DBOperations2 db = new DBOperations2();
					int result = db.DeleteDataWithStatement(emp);
					System.out.println("Deleted");
				}

			}

		} else {
			System.out.println("No Data Found" + '\n');
		}

	}

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
