package com.vtalent.raju;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class EmployeeCollectionOperations {

	static ArrayList<Employee> empArray = new ArrayList<Employee>();
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
			empArray.add(emp);
		}
	}

	public static void InsertInnerLogic() {

		Employee emp = new Employee();
		System.out.println("Enter ID:- ");
		emp.setID(EmployeeCollectionOperations
				.IdLogic(EmployeeCollectionTask1.input.nextInt()));
		System.out.println("Enter Employee Name:- ");
		emp.setName(EmployeeCollectionTask1.input.next());

		System.out.println("Enter MobileNumber:- ");

		emp.setMobileNumber(EmployeeCollectionOperations
				.MobileLogic(EmployeeCollectionTask1.input.next()));
		System.out.println("Enter EmployeePackage:- ");
		double Pp = EmployeeCollectionOperations
				.PackageLogic(EmployeeCollectionTask1.input.nextDouble());
		emp.setPackage(Pp);
		double Ss = Pp / 12;
		double pf = Ss * 0.02;
		Ss = Ss - pf;
		emp.setSalary(Ss);
		emp.setPF(pf);
		EmployeeCollectionOperations.insertData(emp);
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
			Package = PackageLogic(EmployeeCollectionTask1.input.nextDouble());
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
			mobile = MobileLogic(EmployeeCollectionTask1.input.next());
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
			id = IdLogic(EmployeeCollectionTask1.input.nextInt());

		}
		return id;

	}

	public static void printAllEmployeeData() {
		if (empArray != null) {
			EmployeeCollectionOperations.DataPrint();
			for (Employee emp : empArray) {

				System.out.println(" " + emp.getID() + "			 " + emp.getName()
						+ "			 " + emp.getMobileNumber() + "			"
						+ emp.getPackage() + "		 " + emp.getSalary()
						+ "	       " + emp.getPF() + " 	   "
						+ emp.getLoanAmount() + "      " + emp.getEMI()
						+ "  	   " + emp.getYear() + "     "
						+ emp.getInterest() + "        "
						+ emp.getStartingDate() + "       " + emp.getEndDate());
			}

		} else {
			System.out.println("No Data");
		}
	}

	public static void searchEmployee() {

		int Cc = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID:");
			int Xx = EmployeeCollectionTask1.input.nextInt();
			for (Employee emp : empArray) {
				if (Xx == emp.getID()) {
					EmployeeCollectionOperations.DataPrint();
					System.out.println(" " + emp.getID() + "			 "
							+ emp.getName() + "			 " + emp.getMobileNumber()
							+ "			" + emp.getPackage() + "		 "
							+ emp.getSalary() + "	       " + emp.getPF()
							+ " 	   " + emp.getLoanAmount() + "      "
							+ emp.getEMI() + "  	   " + emp.getYear() + "     "
							+ emp.getInterest() + "        "
							+ emp.getStartingDate() + "       "
							+ emp.getEndDate());

					Cc++;
					break;
				}
			}
			if (Cc == 0) {
				System.out.println("Enter Correct ID");
			}

		} else {
			System.out.println("No data");
		}
	}

	public static void DeleteEmployeeData() {
		int Cc = 0;
		int Cc1 = 0;
		if (empArray != null) {
			System.out.println("enter EmployeeID");
			int Xx = EmployeeCollectionTask1.input.nextInt();
			for (Employee emp : empArray) {
				if (Xx == emp.getID()) {
					empArray.remove(Cc1);
					Cc++;
					System.out.println("Delete Successfully");
					break;
				}
				Cc1++;
			}
			if (Cc == 0) {
				System.out.println("Enter Correct ID");
			}

		} else {
			System.out.println("No Data");
		}
	}

	public static void upDateEmployeeData() {
		int Cc = 0;
		if (empArray != null) {
			System.out.println("Enter Updated  EmployeeID:");
			int Xx = EmployeeCollectionTask1.input.nextInt();
			for (Employee emp : empArray) {
				if (Xx == emp.getID()) {
					System.out.println("Enter Package:");
					int Xx1 = EmployeeCollectionTask1.input.nextInt();
					emp.setPackage(Xx1);
					double Ss = Xx1 / 12;
					double pf = Ss * 0.02;
					Ss = Ss - pf;
					emp.setSalary(Ss);
					emp.setPF(pf);

					System.out.println("Ofter update.............");
					EmployeeCollectionOperations.DataPrint();
					System.out.println(" " + emp.getID() + "			 "
							+ emp.getName() + "			 " + emp.getMobileNumber()
							+ "			" + emp.getPackage() + "		 "
							+ emp.getSalary() + "	       " + emp.getPF()
							+ " 	   " + emp.getLoanAmount() + "      "
							+ emp.getEMI() + "  	   " + emp.getYear() + "     "
							+ emp.getInterest() + "        "
							+ emp.getStartingDate() + "       "
							+ emp.getEndDate());
					Cc++;
					break;
				}
			}
			if (Cc == 0) {
				System.out.println("Enter Correct ID");
			}
		} else {
			System.out.println("No Data");
		}
	}

	public static void GetLoanDetails() {
		int Cc = 0;
		if (empArray != null) {
			System.out.println("Enter Emolyee ID for LoanDetails:-");
			int L = EmployeeCollectionTask1.input.nextInt();
			for (Employee emp : empArray) {
				if (L == emp.getID()) {
					double Ss = emp.getSalary();
					if (Ss <= 25000) {
						try {
							throw new EmployeeLoan();
						} catch (Exception e) {
							System.out.println(e);

						}
					} else {

						System.out.println("you are Eligible  Loan Amount is: "
								+ Ss * 5);
						System.out.println("Enter your Loan Amount below " + Ss
								* 5);
						while (true) {
							float Pp = EmployeeCollectionTask1.input
									.nextFloat();

							if (Pp <= Ss * 5) {
								System.out.println("Enter Year to EMI:");
								int t = EmployeeCollectionTask1.input.nextInt();
								float r = 14 * t;
								float r1 = r;
								r = r / (12 * 100);
								t = t * 12;
								float emi = (Pp * r * (float) Math
										.pow(1 + r, t))
										/ (float) (Math.pow(1 + r, t) - 1);

								System.out.println("Amount:- " + Pp
										+ "  Mounts:-  " + t
										+ "  Rate of interest:-" + r1
										+ "  EMI:-" + emi);
								System.out
										.println("Are You Want to Continue (Y/N) ?");

								while (true) {
									String y = EmployeeCollectionTask1.input
											.next();
									if (y.equalsIgnoreCase("Y")) {
										emp.setLoanAmount(Pp);
										emp.setEMI(emi);
										emp.setYear(t);
										emp.setInterest(r);
										emp.setSalary(Ss - emi);

										Calendar date = Calendar.getInstance();
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

					Cc++;
					break;
				}
			}
			if (Cc == 0) {
				System.out.println("Enter Correct ID");
			}
		} else {
			System.out.println("No Data");
		}
	}

}
