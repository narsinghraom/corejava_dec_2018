package com.vtalent.saichand;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeOperations {

	static Employee[] empArray;
	static String IDs = "";
	static String Mobile = "";

	public static void view() {
		System.out.println("1-Insert  Employee");
		System.out.println("2-Updata  Emploee");
		System.out.println("3-Delete  Employee");
		System.out.println("4-Searching  Employee");
		System.out.println("5-print all Employee Information");
		System.out.println("6-Get Loan Details");
		System.out.println("7-Exit");
	}

	public static void DataPrint() {
		System.out.println("EmployeeID" + "		" + "EmployeeName" + "		"
				+ "Employee MobileNumber" + "		" + "EmployeePackage" + "		"
				+ "EmployeeSalary" + "		" + "EmployeePF");

	}

	public static void insertData(Employee emp) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i] == null) {
					empArray[i] = emp;
					break;
				}
			}

		} else {
			System.out.println("already inserted");
		}
	}

	public static void InsertInnerLogic() {

		Employee emp = new Employee();
		System.out.println("Enter ID:  ");
		emp.setEmployeeID(EmployeeOperations.IdLogic(EmployeeTask1.getInput()
				.nextInt()));
		System.out.println("Enter Employee Name:  ");
		emp.setEmployeeName(EmployeeTask1.getInput().next());

		System.out.println("Enter MobileNumber: ");

		emp.setMobileNumber(EmployeeOperations.MobileLogic(EmployeeTask1
				.getInput().next()));
		System.out.println("Enter EmployeePackage:  ");
		double P = EmployeeOperations.PackageLogic(EmployeeTask1.getInput()
				.nextDouble());
		emp.setEmployeePackage(P);
		double S = P / 12;
		double pf = S * 0.02;
		S = S - pf;
		emp.setEmployeeSalary(S);
		emp.setEmployeePF(pf);

		EmployeeOperations.insertData(emp);

	}

	public static double PackageLogic(double Package) {
		double pk = 0;
		int count = 0;
		if (Package >= 200000 && Package <= 1200000) {
			count = 1;
		} else {
			System.out.println("Package must about 200000 nd below 12000000 ");
			count = 0;

		}
		if (count != 1) {
			System.out.println("Enter Correct Package");
			Package = PackageLogic(EmployeeTask1.getInput().nextDouble());
		}
		return pk = Package;

	}

	public static String MobileLogic(String mobile) {
		String s = String.valueOf(mobile);
		int count = 0;
		String M = "";
		char n = s.charAt(0);
		if (s.length() != 10) {
			System.out.println("Mobile Number should be 10 Digits");
			count = 1;
		} else if (Mobile.contains(s)) {
			System.out
					.println("MobileNumber Already Exists in DataBase,Enter A New Number");
			count = 1;
		}
		/*
		 * if (count != 2) {
		 * System.out.println("Enter Correct Mobile number:- "); mobile =
		 * MobileLogic(EmployeeTask1.getInput().next()); }
		 */
		return M = mobile;

	}

	public static int IdLogic(int id) {
		String s = String.valueOf(id);
		int v = 0;

		int count = 0;
		if (s.length() != 3) {
			System.out.println("EmployeID must 3 Digits,So Re-enter ID");
			count = 1;

		} else if (IDs.contains(s)) {
			System.out
					.println("EmployeeID Already Exists in DataBase,Enter New ID");
			count = 2;
		} else {
			IDs = IDs + " " + s;
			count = 3;
		}
		if (count != 3) {
			System.out.println("Enter EmployeeID:  ");
			id = IdLogic(EmployeeTask1.getInput().nextInt());

		}
		return v = id;

	}

	public static void upDateEmployeeData() {
		int count = 0;
		if (empArray != null) {
			System.out.println("Enter Updated  EmployeeID:");
			int x = EmployeeTask1.getInput().nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {

						System.out.println("Enter Package:  ");
						int x1 = EmployeeTask1.getInput().nextInt();
						emp.setEmployeePackage(x1);
						double S = x1 / 12;
						double pf = S * 0.02;
						S = S - pf;
						emp.setEmployeeSalary(S);
						emp.setEmployeePF(pf);

						System.out.println("After update   ");
						EmployeeOperations.DataPrint();
						System.out.println(" " + emp.getEmployeeID() + "			 "
								+ emp.getEmployeeName() + "			 "
								+ emp.getMobileNumber() + "			"
								+ emp.getEmployeePackage() + "		  "
								+ emp.getEmployeeSalary() + "		 "
								+ emp.getEmployeePF());

						count = 1;
						break;
					} else {
						count = 2;
					}
				}
			}
			// if (count == EmployeeOperations.empArray.length)
			if (count == 2) {
				System.out.println("enter valid ID to update");
			}

		} else {
			System.out.println(" data not found, please enter Data");
		}
	}

	public static void DeleteEmployeeData() {
		int Count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID  ");
			int x = EmployeeTask1.getInput().nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						empArray[i] = null;
						System.out.println("Data has been erased");
						EmployeeTask1.z = EmployeeOperations.empArray.length;
						Count = 1;
						break;
					} else {
						Count = 2;
					}
				}
			}
			if (Count == 2) {
				System.out.println("Enter Valid Employee ID");
			}
		} else {
			System.out.println("data not found, please enter Data");
		}
	}

	public static void searchEmployee() {
		int count = 0;

		if (empArray != null) {
			System.out.println("enter EmployeeID:  ");
			int x = EmployeeTask1.getInput().nextInt();
			EmployeeOperations.DataPrint();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {

						System.out.println(" " + emp.getEmployeeID() + "			 "
								+ emp.getEmployeeName() + "			 "
								+ emp.getMobileNumber() + "			"
								+ emp.getEmployeePackage() + "		  "
								+ emp.getEmployeeSalary() + "		 "
								+ emp.getEmployeePF());

						count = 1;
						break;
					} else {
						count = 2;
					}
				}
			}
			if (count == 2) {
				System.out.println("Enter Existing ID");
			}

		} else {
			System.out.println("data not found, please enter Data");
		}
	}

	public static void printAllEmployeeData() throws Exception {

		if (empArray != null) {
			EmployeeOperations.DataPrint();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {

					System.out.println(" " + emp.getEmployeeID() + "			 "
							+ emp.getEmployeeName() + "			 "
							+ emp.getMobileNumber() + "			"
							+ emp.getEmployeePackage() + "		  "
							+ emp.getEmployeeSalary() + "		 "
							+ emp.getEmployeePF());

				}
			}
		}

		else {
			try {
				FileInputStream fis = new FileInputStream(
						"C:\\Employee Data View.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Employee[] emp = (Employee[]) obj;
				for (int i = 0; i < emp.length; i++) {
					System.out.println(" " + emp[i].getEmployeeID() + "			 "
							+ emp[i].getEmployeeName() + "			 "
							+ emp[i].getMobileNumber() + "			"
							+ emp[i].getEmployeePackage() + "		  "
							+ emp[i].getEmployeeSalary() + "		 "
							+ emp[i].getEmployeePF());
				}
			} catch (Exception e) {
				e.getMessage();

			}

		}

	}

	public static void GetLoanDetails()  {
		int Count = 0;
		if (empArray != null) {
			System.out.println("Enter Employee ID for LoanDetails: ");
			int L = EmployeeTask1.getInput().nextInt();
			for (int i = 0; i < empArray.length; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (L == emp.getEmployeeID()) {
						double S = emp.getEmployeePackage() / 12;

						if (S <= 25000) {
							// System.out.println(throw new
							// EmployeeCustomException());
							try {
								throw new EmployeeCustomException();
							} catch (Exception e) {
								System.out.println(e);

							}
						} else {
							System.out.println("Employee is eligible for Loan");
						}

						Count = 1;
						break;
					} else {
						Count = 2;
					}
				}
			}
			if (Count == 2) {
				System.out
						.println("Sorry Your ID Dosen't Match....Please Enter Correct ID ");
			}
		} else {
			System.out.println("enter valid credentials");
		}

	}
}
