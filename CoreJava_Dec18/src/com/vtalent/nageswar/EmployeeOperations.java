package com.vtalent.nageswar;

<<<<<<< HEAD:CoreJava_Dec18/src/com/vtalent/saichand/EmployeeOperations.java
public class EmployeeOperations {
	public static Employee[] empArray;

	public static void view() {
		System.out.println("1-Insert an Employee");
		System.out.println("2-Updata an Emploee");
		System.out.println("3-Delete an Employee");
		System.out.println("4-Searching an Employee");
		System.out.println("5-print all Employee Details");
		System.out.println("6-Exit");
	}

	public static void insertData(Employee emp) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i] == null) {
					empArray[i] = emp;
=======
import java.util.Scanner;

class EmployeeOperations {

	static Employee[] emparray;

	Scanner input = new Scanner(System.in);

	public static void insertData(Employee emp) {
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {
				if (emparray[i] == null) {
					emparray[i] = emp;

>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83:CoreJava_Dec18/src/com/vtalent/nageswar/EmployeeOperations.java
					break;
				}

			}
<<<<<<< HEAD:CoreJava_Dec18/src/com/vtalent/saichand/EmployeeOperations.java
		} else {
			System.out.println("already inserted");
=======
			System.out.println("Sucessfully Inserted." + '\n');
		}

		else {
			System.out.println("Already Inserted." + '\n');

>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83:CoreJava_Dec18/src/com/vtalent/nageswar/EmployeeOperations.java
		}

	}

<<<<<<< HEAD:CoreJava_Dec18/src/com/vtalent/saichand/EmployeeOperations.java
	public static void upDateEmployeeData() {
		int count = 0;
		if (empArray != null) {
			System.out.println("enter Updated  EmployeeID:");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						System.out.println("enter Salary:");
						int x1 = Test.input.nextInt();
						emp.setEmployeeSalary(x1);
						System.out.println("Ofter update "
								+ emp.getEmployeeID() + "    "
								+ emp.getEmployeeSalary());
						count = 1;
						break;
					} else {
						count++;
					}
				}
			}
			if (count == EmployeeOperations.empArray.length) {
				System.out.println("enter Valid ID to UPdate");
=======
	public void printAllData() {
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {
				Employee emp1 = emparray[i];
				System.out.println(emp1.getEmployeeId() + "   " + emp1.getEmployeeSalary());

>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83:CoreJava_Dec18/src/com/vtalent/nageswar/EmployeeOperations.java
			}

		} else {
<<<<<<< HEAD:CoreJava_Dec18/src/com/vtalent/saichand/EmployeeOperations.java
			System.out.println("1st Enter Data");
		}
	}

	public static void DeleteEmployeeData() {
		int Count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						empArray[i] = null;
						System.out.println("Deleted Data");
						Test.z = EmployeeOperations.empArray.length;
						break;
					} else {
						Count = 2;
					}
=======
			System.out.println("Insert the Employee Data first" + '\n');
		}
	}

	public void updateData() {
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployeeId() + "   " + emp1.getEmployeeSalary());
			}

			System.out.println("Enter the Id to be Updated" + '\n');
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				Employee emp2;
				emp2 = emparray[i];
				if (x == emp2.getEmployeeId()) {
					System.out.println("Enter the new Salary to be Updated" + '\n');
					emp2.setEmployeeSalary(input.nextDouble());
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83:CoreJava_Dec18/src/com/vtalent/nageswar/EmployeeOperations.java
				}
			}
			if (Count == 2) {
				System.out.println("Enter Correct Employee ID");
			}
		} else {
			System.out.println("1st enter Data");
		}
	}

<<<<<<< HEAD:CoreJava_Dec18/src/com/vtalent/saichand/EmployeeOperations.java
	public static void searchEmployee() {
		int count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID:");
			int x = Test.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						System.out.println("EmployeeId:---"
								+ emp.getEmployeeID() + "  Salary:---"
								+ emp.getEmployeeSalary());
						count = 1;
						break;
					} else {
						count = 2;
					}
=======
	public void searchData() {
		if (emparray != null) {
			System.out.println("Enter the Employee_Id:");
			Employee emp1;
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				if (x == emp1.getEmployeeId()) {
					System.out.println("Employee_Id- " + emp1.getEmployeeId() + '\n' + "Employee_Salary- "
							+ emp1.getEmployeeSalary());
				} else {
					System.out.println("Enter the Valid Id" + '\n');
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83:CoreJava_Dec18/src/com/vtalent/nageswar/EmployeeOperations.java
				}
			}
			if (count == 2) {
				System.out.println("Enter Valid ID");
			}

		} else {
			System.out.println("1st Insert Data");
		}
	}

<<<<<<< HEAD:CoreJava_Dec18/src/com/vtalent/saichand/EmployeeOperations.java
	public static void printAllEmployeeData() {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					System.out.println(emp.getEmployeeID() + " "
							+ emp.getEmployeeSalary());
=======
	public void deleteEmployee() {
		if (emparray != null) {
			Employee emp1;
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				System.out.println(emp1.getEmployeeId());

			}
			System.out.println("Enter the Id to be Deleted");
			int x = input.nextInt();
			for (int i = 0; i <= emparray.length - 1; i++) {
				emp1 = emparray[i];
				if (x == emp1.getEmployeeId()) {
					emparray[i] = null;
					System.out.println("Deleted");
>>>>>>> 57da0be8e4c3cc67b707b93822524f1292d76f83:CoreJava_Dec18/src/com/vtalent/nageswar/EmployeeOperations.java
				}
			}
		} else {
			System.out.println("Not Data Not available to Print");
		}
	}

}
