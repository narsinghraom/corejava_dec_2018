package com.vtalent.srihari;

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
				+ "EmployeeSalary" + "		" + "EmployeePF" + "       "
				+ "LoanAmount " + "       " + "EMI" + "        " + "Months"
				+ "        " + " Interest" + "       " + "Starting Date"
				+ "       " + "EndDate");

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
		emp.setID(EmployeeOperations.IdLogic(EmployeeTask1.input.nextInt()));
		System.out.println("Enter Employee Name:- ");
		emp.setName(EmployeeTask1.input.next());

		System.out.println("Enter MobileNumber:- ");

		emp.setMobileNumber(EmployeeOperations.MobileLogic(EmployeeTask1.input
				.next()));
		System.out.println("Enter EmployeePackage:- ");
		double Pp = EmployeeOperations.PackageLogic(EmployeeTask1.input
				.nextDouble());
		emp.setPackage(Pp);
		double Ss = Pp / 12;
		double pf = Ss * 0.02;
		Ss = Ss - pf;
		emp.setSalary(Ss);
		emp.setPF(pf);

		EmployeeOperations.insertData(emp);

	}

	public static double PackageLogic(double Package) {

		int Cc = 0;
		if (Package >= 200000 && Package <= 1200000) {
			Cc = 1;
		} else {
			System.out.println("Package must about 200000 nd below 12000000 ");
			Cc = 0;

		}
		if (Cc != 1) {
			System.out.println("Enter Correct Package");
			Package = PackageLogic(EmployeeTask1.input.nextDouble());
		}
		return Package;

	}

	public static String MobileLogic(String mobile) {
		String Ss = String.valueOf(mobile);
		int Cc = 0;
		char n = Ss.charAt(0);
		if (Ss.length() != 10) {
			System.out.println("Mobile Number Must 10-Digits");
			Cc = 1;
		} else if (Mobile.contains(Ss)) {
			System.out
					.println("MobileNumber Already Entered in DataBase,Enter New Number");
			Cc = 1;
		} else if (n == '9' || n == '8' || n == '7') {
			Cc = 2;
			Mobile = Mobile + " " + Ss;

		} else if (n != '9' || n != '8' || n != '7') {
			System.out.println("Mobile number must Start 9,8 and 7 Series");
			Cc = 1;
		}
		if (Cc != 2) {
			System.out.println("Enter Correct Mobile number:- ");
			mobile = MobileLogic(EmployeeTask1.input.next());
		}
		return mobile;

	}

	public static int IdLogic(int id) {
		String Ss = String.valueOf(id);

		int Cc = 0;
		if (Ss.length() != 3) {
			System.out.println("EmployeID must 3 Digits,So Re-enter ID");
			Cc = 1;

		} else if (IDs.contains(Ss)) {
			System.out
					.println("EmployeeID Already Entered in DataBase,Enter New ID");
			Cc = 2;
		} else {
			IDs = IDs + " " + Ss;
			Cc = 3;
		}
		if (Cc != 3) {
			System.out.println("Enter EmployeeID");
			id = IdLogic(EmployeeTask1.input.nextInt());

		}
		return id;

	}

	public static void upDateEmployeeData() {
		int Cc = 0;
		if (empArray != null) {
			System.out.println("Enter Updated  EmployeeID:");
			int x = EmployeeTask1.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getID()) {

						System.out.println("Enter Package:");
						int x1 = EmployeeTask1.input.nextInt();
						emp.setPackage(x1);
						double Ss = x1 / 12;
						double pf = Ss * 0.02;
						Ss = Ss - pf;
						emp.setSalary(Ss);
						emp.setPF(pf);

						System.out.println("Ofter update.............");
						EmployeeOperations.DataPrint();
						System.out.println(" " + emp.getID() + "			 "
								+ emp.getName() + "			 "
								+ emp.getMobileNumber() + "			"
								+ emp.getPackage() + "		 " + emp.getSalary()
								+ "	       " + emp.getPF() + " 	   "
								+ emp.getLoanAmount() + "      " + emp.getEMI()
								+ "  	   " + emp.getYear() + "     "
								+ emp.getInterest() + "        "
								+ emp.getStartingDate() + "       "
								+ emp.getEndDate());

						Cc = 1;
						break;
					} else {
						Cc = 2;
					}
				}
			}
			if (Cc == 2) {
				System.out.println("enter Valid ID to UPdate");
			}

		} else {
			System.out.println("1st Enter Data");
		}
	}

	public static void DeleteEmployeeData() {
		int Cc = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID");
			int x = EmployeeTask1.input.nextInt();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getID()) {
						empArray[i] = null;
						System.out.println("Deleted Data");
						EmployeeTask1.z = EmployeeOperations.empArray.length;
						Cc = 1;
						break;
					} else {
						Cc = 2;
					}
				}
			}
			if (Cc == 2) {
				System.out.println("Enter Correct Employee ID");
			}
		} else {
			System.out.println("1st enter Data");
		}
	}

	public static void searchEmployee() {
		int Cc = 0;

		if (empArray != null) {
			System.out.println("enter EmployeeID:");
			int x = EmployeeTask1.input.nextInt();

			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (x == emp.getID()) {
						EmployeeOperations.DataPrint();
						System.out.println(" " + emp.getID() + "			 "
								+ emp.getName() + "			 "
								+ emp.getMobileNumber() + "			"
								+ emp.getPackage() + "		 " + emp.getSalary()
								+ "	       " + emp.getPF() + " 	   "
								+ emp.getLoanAmount() + "      " + emp.getEMI()
								+ "  	   " + emp.getYear() + "     "
								+ emp.getInterest() + "        "
								+ emp.getStartingDate() + "       "
								+ emp.getEndDate());

						Cc = 1;
						break;
					} else {
						Cc = 2;
					}
				}
			}
			if (Cc == 2) {
				System.out.println("Enter Valid ID");
			}

		} else {
			try {
				FileInputStream fis = new FileInputStream(
						"F:\\Employee Data View.txt");
				@SuppressWarnings("resource")
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Employee[] emp = (Employee[]) obj;

				System.out.println("enter EmployeeID:");
				int x = EmployeeTask1.input.nextInt();

				for (int i = 0; i <= emp.length - 1; i++) {
					Employee emp1 = emp[i];
					if (emp != null) {
						if (x == emp1.getID()) {
							EmployeeOperations.DataPrint();
							System.out.println(" " + emp1.getID() + "			 "
									+ emp1.getName() + "			 "
									+ emp1.getMobileNumber() + "			"
									+ emp1.getPackage() + "		 "
									+ emp1.getSalary() + "	       "
									+ emp1.getPF() + " 	   "
									+ emp1.getLoanAmount() + "      "
									+ emp1.getEMI() + "  	   " + emp1.getYear()
									+ "     " + emp1.getInterest() + "        "
									+ emp1.getStartingDate() + "       "
									+ emp1.getEndDate());

							Cc = 1;
							break;
						} else {
							Cc = 2;
						}
					}
				}
				if (Cc == 2) {
					System.out.println("Enter Valid ID");
				}

			} catch (Exception e) {
				e.getMessage();
			}
			System.out.println("1st Insert Data");
		}
	}

	public static void printAllEmployeeData() {

		if (empArray != null) {
			EmployeeOperations.DataPrint();
			for (int i = 0; i <= empArray.length - 1; i++) {
				Employee emp = empArray[i];
				if (emp != null) {

					System.out.println(" " + emp.getID() + "			 "
							+ emp.getName() + "			 " + emp.getMobileNumber()
							+ "			" + emp.getPackage() + "		 "
							+ emp.getSalary() + "	       " + emp.getPF()
							+ " 	   " + emp.getLoanAmount() + "      "
							+ emp.getEMI() + "  	   " + emp.getYear() + "     "
							+ emp.getInterest() + "        "
							+ emp.getStartingDate() + "       "
							+ emp.getEndDate());
				}
			}
		}

		else {
			try {
				FileInputStream fis = new FileInputStream(
						"F:\\Employee Data View.txt");
				@SuppressWarnings("resource")
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				Employee[] emp = (Employee[]) obj;
				if (emp != null) {
					EmployeeOperations.DataPrint();
					for (int i = 0; i < emp.length; i++) {
						System.out.println(" " + emp[i].getID() + "			 "
								+ emp[i].getName() + "			 "
								+ emp[i].getMobileNumber() + "			"
								+ emp[i].getPackage() + "		  "
								+ emp[i].getSalary() + "		 " + emp[i].getPF()
								+ "       " + emp[i].getLoanAmount()
								+ "       " + emp[i].getEMI() + "         "
								+ emp[i].getYear() + "        "
								+ emp[i].getInterest() + "        "
								+ emp[i].getStartingDate() + "         "
								+ emp[i].getEndDate());
					}

				}
			} catch (Exception e) {
				e.getMessage();

			}

		}

	}

	public static void GetLoanDetails() {
		int Cc = 0;
		if (empArray != null) {
			System.out.println("Enter Emolyee ID for LoanDetails:-");
			int L = EmployeeTask1.input.nextInt();
			for (int i = 0; i < empArray.length; i++) {
				Employee emp = empArray[i];
				if (emp != null) {
					if (L == emp.getID()) {
						double Ss = emp.getSalary();

						if (Ss <= 25000) {
							try {
								throw new EmployeeCustomException();
							} catch (Exception e) {
								System.out.println(e);

							}
						} else {

							System.out
									.println("you are Eligible  Loan Amount is: "
											+ Ss * 5);
							System.out.println("Enter your Loan Amount below "
									+ Ss * 5);
							while (true) {
								float Pp = EmployeeTask1.input.nextFloat();

								if (Pp <= Ss * 5) {
									System.out.println("Enter Year to EMI:");
									int t = EmployeeTask1.input.nextInt();
									float r = 14 * t;
									float r1 = r;
									r = r / (12 * 100);
									t = t * 12;
									float emi = (Pp * r * (float) Math.pow(
											1 + r, t))
											/ (float) (Math.pow(1 + r, t) - 1);

									System.out.println("Amount:- " + Pp
											+ "  Mounts:-  " + t
											+ "  Rate of interest:-" + r1
											+ "  EMI:-" + emi);
									System.out
											.println("Are You Want to Continue (Y/N) ?");

									while (true) {
										String y = EmployeeTask1.input.next();
										if (y.equalsIgnoreCase("Y")) {
											emp.setLoanAmount(Pp);
											emp.setEMI(emi);
											emp.setYear(t);
											emp.setInterest(r);
											emp.setSalary(Ss - emi);

											Calendar date = Calendar
													.getInstance();
											date.setTime(new Date());
											Format f = new SimpleDateFormat(
													"dd-MMMM-yyyy");

											String startDate = f.format(date
													.getTime());
											emp.setStartingDate(startDate);
											date.add(Calendar.MONTH, t);
											String endDate = f.format(date
													.getTime());
											emp.setEndDate(endDate);

											System.out
													.println("Congrats"
															+ " you are loan is Sanctioned");
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
													+ Ss * 5);

								}
							}
						}

						Cc = 1;
						break;
					} else {
						Cc = 2;
					}
				}
			}
			if (Cc == 2) {
				System.out
						.println("Sorry You are ID Dosen't Match....Please Enter Currect ID ");
			}
		} else {
			System.out.println("Not Data 1st Insert data");
		}

	}
}
