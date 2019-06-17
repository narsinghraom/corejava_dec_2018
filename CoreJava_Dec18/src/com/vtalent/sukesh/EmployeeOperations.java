package com.vtalent.sukesh;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EmployeeOperations {

	static Employee[] empArray;
	static String IDs = "";
	static String Mobile = "";

	public static void view() {
		System.out.println("1-Insert an Employee");
		System.out.println("2-Updata an Emploee");
		System.out.println("3-Delete an Employee");
		System.out.println("4-Searching an Employee");
		System.out.println("5-print all Employee Details");
		System.out.println("6-Get a Loan Details");
		System.out.println("7-Exit");
	}

	public static void DataPrint() {
		System.out.println("EmployeeID" + "		" + "EmployeeName" + "		"
				+ "Employee MobileNumber" + "		" + "EmployeePackage" + "		"
				+ "EmployeeSalary" + "		" + "EmployeePF" + " 		"
				+ "LoanAmount " + " 		" + "EMI" + " 		" + "Mounts" + "      "
				+ "Interest" + "       " + "Starting Date" + "           "
				+ "End Date");

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
		System.out.println("Enter ID:- ");
		emp.setEmployeeID(EmployeeOperations.IdLogic(EmployeeTask1.input
				.nextInt()));
		System.out.println("Enter Employee Name:- ");
		emp.setEmployeeName(EmployeeTask1.input.next());

		System.out.println("Enter MobileNumber:- ");

		emp.setMobileNumber(EmployeeOperations.MobileLogic(EmployeeTask1.input
				.next()));
		System.out.println("Enter EmployeePackage:- ");
		double P = EmployeeOperations.PackageLogic(EmployeeTask1.input
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
		// double pk = 0;
		int count = 0;
		if (Package >= 200000 && Package <= 1200000) {
			count = 1;
		} else {
			System.out.println("Package must about 200000 nd below 12000000 ");
			count = 0;

		}
		if (count != 1) {
			System.out.println("Enter Correct Package");
			Package = PackageLogic(EmployeeTask1.input.nextDouble());
		}
		return Package;

	}

	public static String MobileLogic(String mobile) {
		String s = String.valueOf(mobile);
		int count = 0;
		// String M = "";
		char n = s.charAt(0);
		if (s.length() != 10) {
			System.out.println("Mobile Number Must 10-Digits");
			count = 1;
		} else if (Mobile.contains(s)) {
			System.out
					.println("MobileNumber Already Entered in DataBase,Enter New Number");
			count = 1;
		} else if (n == '9' || n == '8' || n == '7') {
			count = 2;
			Mobile = Mobile + " " + s;

		} else if (n != '9' || n != '8' || n != '7') {
			System.out.println("Mobile number must Start 9,8 and 7 Series");
			count = 1;
		}
		if (count != 2) {
			System.out.println("Enter Correct Mobile number:- ");
			mobile = MobileLogic(EmployeeTask1.input.next());
		}
		return mobile;

	}

	public static int IdLogic(int id) {
		String s = String.valueOf(id);

		int count = 0;
		if (s.length() != 3) {
			System.out.println("EmployeID must 3 Digits,So Re-enter ID");
			count = 1;

		} else if (IDs.contains(s)) {
			System.out
					.println("EmployeeID Already Entered in DataBase,Enter New ID");
			count = 2;
		} else {
			IDs = IDs + " " + s;
			count = 3;
		}
		if (count != 3) {
			System.out.println("Enter EmployeeID");
			id = IdLogic(EmployeeTask1.input.nextInt());

		}
		return id;

	}

	public static void upDateEmployeeData() {
		int count = 0;
		if (empArray != null) {
			System.out.println("Enter Updated  EmployeeID:");
			int x = EmployeeTask1.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {

						System.out.println("Enter Package:");
						int x1 = EmployeeTask1.input.nextInt();
						emp.setEmployeePackage(x1);
						double S = x1 / 12;
						double pf = S * 0.02;
						S = S - pf;
						emp.setEmployeeSalary(S);
						emp.setEmployeePF(pf);

						System.out.println("Ofter update.............");
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
			if (count == 2) {
				System.out.println("enter Valid ID to UPdate");
			}

		} else {

			try {

				FileInputStream fis = new FileInputStream(
						"F:\\Employee Data View.txt");
				@SuppressWarnings("resource")
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Employee[] fileemp = (Employee[]) obj;
				if (fileemp != null) {
					System.out.println("Enter Updated  EmployeeID:");
					int x = EmployeeTask1.input.nextInt();
					for (int i = 0; i < fileemp.length; i++) {
						Employee emp = fileemp[i];
						if (emp != null) {
							if (x == emp.getEmployeeID()) {

								System.out.println("Enter Package:");
								int P = EmployeeTask1.input.nextInt();
								emp.setEmployeePackage(P);
								double S = P / 12;
								double pf = S * 0.02;
								S = S - pf;
								emp.setEmployeeSalary(S);
								emp.setEmployeePF(pf);
								System.out.println("Ofter update.............");
								EmployeeOperations.DataPrint();
								System.out.println(" " + emp.getEmployeeID()
										+ "			 " + emp.getEmployeeName()
										+ "			 " + emp.getMobileNumber()
										+ "			" + emp.getEmployeePackage()
										+ "		  " + emp.getEmployeeSalary()
										+ "		 " + emp.getEmployeePF());

								count = 1;
								break;
							} else {
								count = 2;
							}
						}
					}
					if (count == 2) {
						System.out.println("e nter Valid ID to UPdate");
					}
				} else {
					System.out.println("No Data ");
				}

			} catch (Exception e) {
				e.getMessage();
			}

			// System.out.println("1st Enter Data");
		}
	}

	public static void DeleteEmployeeData() {
		int Count = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID");
			int x = EmployeeTask1.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						empArray[i] = null;
						System.out.println("Deleted Data");
						EmployeeTask1.z = EmployeeOperations.empArray.length;
						Count = 1;
						break;
					} else {
						Count = 2;
					}
				}
			}
			if (Count == 2) {
				System.out.println("Enter Correct Employee ID");
			}
		} else {

			try {

				FileInputStream fis = new FileInputStream(
						"F:\\Employee Data View.txt");
				@SuppressWarnings("resource")
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Employee[] fileemp = (Employee[]) obj;
				if (fileemp != null) {

					System.out.println("enter EmployeeID");
					int x = EmployeeTask1.input.nextInt();
					for (int i = 0; i < fileemp.length; i++) {
						Employee emp = fileemp[i];
						if (emp != null) {
							if (x == emp.getEmployeeID()) {
								fileemp[i] = null;
								System.out.println("Deleted Data");
								EmployeeTask1.z = EmployeeOperations.empArray.length;
								Count = 1;
								break;
							} else {
								Count = 2;
							}
						}
					}
					if (Count == 2) {
						System.out.println("Enter Correct Employee ID");
					}

				} else {
					System.out.println("No data to Delete");
				}

			} catch (Exception e) {
				e.getMessage();
			}
			// System.out.println("1st enter Data");
		}
	}

	public static void searchEmployee() {
		int count = 0;

		if (empArray != null) {
			System.out.println("enter EmployeeID:");
			int x = EmployeeTask1.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getEmployeeID()) {
						EmployeeOperations.DataPrint();
						System.out.println(" " + emp.getEmployeeID() + "			 "
								+ emp.getEmployeeName() + "			 "
								+ emp.getMobileNumber() + "			"
								+ emp.getEmployeePackage() + "		  "
								+ emp.getEmployeeSalary() + "		 "
								+ emp.getEmployeePF());

						// count = 1;
						break;
					} else {
						count = 2;
					}
				}
			}
			if (count == 2) {
				System.out.println("Enter Valid ID");
			}

		} else {

			try {
				FileInputStream fis = new FileInputStream(
						"F:\\Employee Data View.txt");
				@SuppressWarnings("resource")
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Employee[] fileemp = (Employee[]) obj;
				if (fileemp != null) {
					System.out.println("enter EmployeeID:");
					int x = EmployeeTask1.input.nextInt();

					for (int i = 0; i < fileemp.length; i++) {
						Employee emp = fileemp[i];
						if (fileemp != null) {
							if (x == emp.getEmployeeID()) {
								EmployeeOperations.DataPrint();

								System.out.println(" " + emp.getEmployeeID()
										+ "			 " + emp.getEmployeeName()
										+ "			 " + emp.getMobileNumber()
										+ "			" + emp.getEmployeePackage()
										+ "		  " + emp.getEmployeeSalary()
										+ "		 " + emp.getEmployeePF());
								break;
							} else {
								count = 2;
							}
						}
					}
					if (count == 2) {
						System.out.println("Enter Valid ID");
					}
				} else {
					System.out.println("No Data to Search");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			// System.out.println("1st Insert Data");
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
							+ emp.getEmployeePackage() + "		 "
							+ emp.getEmployeeSalary() + "		 "
							+ emp.getEmployeePF() + " 		 "
							+ emp.getLoanAmount() + "     		" + emp.getEMI()
							+ "  	    " + emp.getYear() + "     "
							+ emp.getInterest() + "        "
							+ emp.getStartingDate() + "             "
							+ emp.getEndDate());

				}
			}
		}

		else {

			FileInputStream fis = new FileInputStream(
					"F:\\Employee Data View.txt");
			// @SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee[] emp = (Employee[]) obj;
			if (emp != null) {
				EmployeeOperations.DataPrint();
				for (int i = 0; i < emp.length; i++) {
					System.out.println(" " + emp[i].getEmployeeID() + "			 "
							+ emp[i].getEmployeeName() + "			 "
							+ emp[i].getMobileNumber() + "			"
							+ emp[i].getEmployeePackage() + "		  "
							+ emp[i].getEmployeeSalary() + "		 "
							+ emp[i].getEmployeePF());
				}

				// System.out.println("No Data to Print");
			} else {
				System.out.println("No Data To Print");
			}

		}

	}

	public static void GetLoanDetails() {
		int Count = 0;
		if (empArray != null) {
			System.out.println("Enter Emolyee ID for LoanDetails:-");
			int L = EmployeeTask1.input.nextInt();
			for (int i = 0; i < empArray.length; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (L == emp.getEmployeeID()) {
						double S = emp.getEmployeeSalary();

						if (S <= 25000) {
							try {
								throw new EmployeeCustomException();
							} catch (Exception e) {
								System.out.println(e);
							}

						} else {

							System.out
									.println("you are Eligible  Loan Amount is: "
											+ S * 5);
							System.out.println("Enter your Loan Amount below "
									+ S * 5);
							while (true) {
								float p = EmployeeTask1.input.nextInt();

								if (p <= S * 5) {
									System.out.println("Enter Years to EMI:");
									float t = EmployeeTask1.input.nextInt();
									float r = 14 * t;
									float r1 = r;
									r = r / (12 * 100);
									t = t * 12;
									float emi = (p * r * (float) Math.pow(
											1 + r, t))
											/ (float) (Math.pow(1 + r, t) - 1);

									System.out.println("Amount:- " + p
											+ "  Mounts:-  " + t
											+ "  Rate of interest:-" + r1
											+ "  EMI:-" + emi);
									System.out
											.println("Are You Want to Continue (Y/N) ?");

									while (true) {
										String y = EmployeeTask1.input.next();
										if (y.equalsIgnoreCase("Y")) {
											emp.setLoanAmount(p);
											emp.setEMI(emi);
											emp.setYear(t);
											emp.setInterest(r);
											emp.setEmployeeSalary(S - emi);
											/*
											 * long millis = System
											 * .currentTimeMillis();
											 * java.sql.Date date = new
											 * java.sql.Date( millis);
											 * emp.setStartingDate(date);
											 */

											Calendar date = Calendar
													.getInstance();
											date.setTime(new Date());
											Format f = new SimpleDateFormat(
													"dd-MMMM-yyyy");

											String startDate = f.format(date
													.getTime());
											emp.setStartingDate(startDate);
											;
											date.add(Calendar.MONTH, (int) t);
											String endDate = f.format(date
													.getTime());
											emp.setEndDate(endDate);

											System.out
													.println("Congrats you are loan is Sanctioned");
											System.out.println("  Welcome ");

											break;
										} else if (y.equalsIgnoreCase("N")) {
											System.out.println("Thank you ");
											break;
										} else {
											System.out
													.println("Try Again With (Y/N) only !");
										}
									}
									break;

								} else {
									System.out
											.println("Sry ur not Eligible this Amount...Enter amount below "
													+ S * 5);

								}
							}

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
						.println("Sorry You are ID Dosen't Match....Please Enter Currect ID ");
			}
		} else {
			System.out.println("Not Data 1st Insert data");
		}

	}
}
