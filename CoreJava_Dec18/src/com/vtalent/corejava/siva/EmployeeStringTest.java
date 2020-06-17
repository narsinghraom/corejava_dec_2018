package com.vtalent.corejava.siva;

import java.util.Scanner;

class Employee {

	private int empId;
	private double empSalary;
	private long mobileNo;
	private String empName;
	private String city;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void setmobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setemp_name(String empName) {

		this.empName = empName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getempName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public long getMobileNo() {
		return mobileNo;
	}
}

class EmployeeOperations {
	static Employee[] empArray;
	static Scanner sc = new Scanner(System.in);

	public void insertEmployeeData() {
		System.out.println("Enter the no. of elements to be stored");
		int size = sc.nextInt();
		EmployeeOperations.empArray = new Employee[size];

		for (int i = 0; i <= size - 1; i++) {

			Employee emp = new Employee();
			System.out.println("Enter " + (i + 1) + "Employee " + " Data");
			System.out.println("Enter empId:");
			emp.setEmpId(sc.nextInt());
			System.out.println("Enter Salary:");
			emp.setEmpSalary(sc.nextDouble());
			System.out.println("Enter Mobile No");
			emp.setmobileNo(sc.nextLong());
			System.out.println("Enter the Employee Name");
			emp.setemp_name(sc.next());
			System.out.println("Enter the city");
			emp.setCity(sc.next());
			System.out.println("empId: " + emp.getEmpId() + "empSalary: "
					+ emp.getEmpSalary() + "Mobile No: " + emp.getMobileNo()
					+ "Employee Name:" + emp.getempName() + "City:"
					+ emp.getCity());

			if (empArray != null) {
				for (int j = 0; j <= empArray.length - 1; j++) {
					if (empArray[j] == null) {
						empArray[j] = emp;
						break;
					}
				}
				System.out.println("Inserted Successfully");
			} else {
				System.out.println("Already Inserted");
			}

		}

	}

	public void deleteEmployeeData() {
		if (empArray != null) {
			// System.out.println("Enter the Employee ID");
			Employee emp;
			for (int i = 0; i <= empArray.length - 1; i++) {
				emp = empArray[i];
				System.out.println(emp.getEmpId());
			}
			System.out.println("Enter the Employee ID to be Deleted");
			int x = sc.nextInt();

			for (int i = 0; i <= empArray.length - 1; i++) {
				emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmpId()) {
						// empArray[i] = empArra0y[j + 1];
						// empArray[i] = empArra0y[j + 1];
						empArray[i] = null;
						System.out.println("Deleted successfully");

					}
				}
			}
		}

		else {
			System.out.println("No Data Found");
		}

	}

	public void updateEmployee() {

		if (empArray != null) {
			Employee emp1;
			for (int i = 0; i <= empArray.length - 1; i++) {
				emp1 = empArray[i];
				System.out.println(emp1.getEmpId() + "   "
						+ emp1.getEmpSalary() + "  " + emp1.getMobileNo());
			}
			System.out.println("Enter the Employee ID to be updated");
			int x = sc.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				emp1 = empArray[i];
				if (x == emp1.getEmpId()) {
					System.out.println("Enter the Salary to be update " + '\n');
					emp1.setEmpSalary(sc.nextDouble());
					System.out
							.println("Enter the Mobile Number to be updated " + '\n');
					emp1.setmobileNo(sc.nextLong());
					System.out.println("empid: " + emp1.getEmpId()
							+ " empsalary: " + emp1.getEmpSalary()
							+ " Mobileno: " + emp1.getMobileNo()
							+ " employee name: " + emp1.getempName()
							+ " city :" + emp1.getCity());
				}
			}

		} else {
			System.out.println("First Insert Employee Data ");
		}
	}

	public void searchEmployeeData() {
		if (empArray != null) {
			System.out.println("Enter the Employee ID");
			Employee emp1;
			int x = sc.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				emp1 = empArray[i];
				if (x == emp1.getEmpId()) {
					System.out.println("EMP ID: " + emp1.getEmpId()
							+ "Emp Salary: " + emp1.getEmpSalary()
							+ "EMP Mobile No: " + emp1.getMobileNo()
							+ " Employee Name: " + emp1.getempName()
							+ " City: " + emp1.getCity());
				}
			}

		} else {
			System.out.println("Enter valid ID");
		}

	}

	public void printAllEmployeeData() {
		if (empArray != null) {
			for (int i = 0; i < empArray.length; i++) {
				Employee emp1 = empArray[i];
				if (empArray[i] == null) {
					// System.out.println("I won't print data");
				} else {
					System.out.println(emp1.getEmpId() + " "
							+ emp1.getEmpSalary() + " " + emp1.getMobileNo()
							+ " Employee Name: " + emp1.getempName()
							+ " City: " + emp1.getCity());
				}

			}

		} else {
			System.out.println("Insert Emplotee Data First " + '\n');
		}

	}

}

public class EmployeeStringTest {
	static int z = 0;

	public static void main(String[] args) {
		// EmployeeTest empt = new EmployeeTest();
		EmployeeOperations empo = new EmployeeOperations();
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Please Select Any Option");
			System.out.println("1.Insert an Employee." + '\n'
					+ "2.Delete an Employee" + '\n' + "3.Update an Employee."
					+ '\n' + "4.Search an Employee" + '\n'
					+ "5.Print All the Employee Data" + '\n' + "6.Exit");
			int employee = input.nextInt();

			switch (employee) {

			case 1:
				empo.insertEmployeeData();
				break;

			case 2:
				empo.deleteEmployeeData();
				break;

			case 3:
				empo.updateEmployee();
				break;

			case 4:
				empo.searchEmployeeData();
				break;

			case 5:
				empo.printAllEmployeeData();
				break;

			case 6:
				break;

			default:
				System.out.println("Enter Valid Search" + '\n');

			}
		}

	}

}

