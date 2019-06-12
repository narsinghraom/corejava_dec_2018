package com.vtalent.rakesh;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class EmployeeOperations {
	static Employee[] emparray;
	Scanner sc = new Scanner(System.in);

	public static void storeData(Employee emp) {
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {
				if (emparray[i] == null) {
					emparray[i] = emp;

					break;
				}
			}

			System.out.println("Successfully Inserted." + '\n');
		}

		else {
			System.out.println("Already Inserted" + '\n');
		}
	}

	public void printAllData() {

		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {

				Employee emp1 = emparray[i];
				if (emp1 != null) {
					System.out.println("Employee Name:" + emp1.getEmployName() + "   Employee id:" + emp1.getEmployid()
							+ "   Employee mobilenumber:" + emp1.getMobileNumber() + "   Employee package: "
							+ emp1.getEmployPackage() + "   Employee pf:" + emp1.getPf() + "   Employee salary:"
							+ emp1.getEmploysalary());
				}
			}
		} else {
			try {
				FileInputStream fi = new FileInputStream("D:\\Rakesh\\rakeshdataqqqqqa");
				ObjectInputStream ois = new ObjectInputStream(fi);
				Object obj = ois.readObject();
				Employee[] emp = (Employee[]) obj;
				for (int k = 0; k <= emp.length - 1; k++) {
					System.out.println("EmployeeId:" + emp[k].getEmployid() + "   EmployeeName:"
							+ emp[k].getEmployName() + "   EmployeeMobileNumber:" + emp[k].getMobileNumber()
							+ "    EmplolyeePackage:" + emp[k].getEmployPackage() + "EmployeeSalary:"
							+ emp[k].getEmploysalary() + "   EmployeePf:   " + emp[k].getPf());
				}
			} catch (Exception e) {
			}
			System.out.println("please enter the Employee data first");
		}
	}

	public void updateData() {
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployid() + "   " + emp1.getEmploysalary());
			}

			System.out.println("Enter the Id to be Updated" + '\n');
			int x = sc.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				Employee emp2;
				emp2 = emparray[i];
				if (x == emp2.getEmployid()) {
					System.out.println("Enter the new Salary to be Updated" + '\n');
					double updatedSalary = sc.nextDouble();

					emp2.setEmploysalary(updatedSalary);

				}
			}
		}

		else {
			System.out.println("First Insert Employee Data" + '\n');
		}
	}

	public void searchData() {
		if (emparray != null) {
			System.out.println("Enter the Employ_Id:");

			int x = sc.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {

				Employee emp1;
				emp1 = emparray[i];
				if (x == emp1.getEmployid()) {
					System.out.println("Employ_Id- " + emp1.getEmployid() + '\n' + "Employ_Salary- "
							+ emp1.getEmploysalary() + '\n' + "Employ_pf " + emp1.getPf() + '\n' + "Employ_name "
							+ emp1.getEmployName() + "Employ_mobilenumber- " + emp1.getMobileNumber());
				} else {
					System.out.println("Enter the Valid Id" + '\n');
				}
			}
		} else {

			System.out.println("Insert the Employee Data first" + '\n');

		}
	}

	public void deleteEmploy() {
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployid());

			}
			System.out.println("Enter the Id to be Deleted");
			int x = sc.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				if (x == emp1.getEmployid()) {
					emparray[i] = null;

					System.out.println("Deleted");
				}

			}

		} else {
			System.out.println("No Data Found" + '\n');
		}

	}

	public void validateLoan() {
		Employee emp1;
		if (emparray != null) {

			for (int i = 0; i <= emparray.length - 1; i++) {

				emp1 = emparray[i];

			}

			System.out.println("enter id to find loan eligibility");

			int uid = sc.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {

				emp1 = emparray[i];
				if (uid == emp1.getEmployid()) {
					double sal = emp1.getEmploysalary();
					try {
						if (sal <= 10000) {
							throw new GetALoanException();
						} else {
							System.out.println("loan granted");
						}
					} catch (GetALoanException e) {
						System.out.println(e);
					}
				}

			}

		}
	}
}
