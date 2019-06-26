package com.vtalent.rakesh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
		FileInputStream fi = null;
		if (emparray != null) {
			for (int i = 0; i <= emparray.length - 1; i++) {

				Employee emp1 = emparray[i];
				if (emp1 != null) {
					System.out.println("   Employee Name:" + emp1.getEmployName() + '\n' + "   Employee id:"
							+ emp1.getEmployid() + '\n' + "   Employee mobilenumber:" + emp1.getMobileNumber() + '\n'
							+ "   Employee package: " + emp1.getEmployPackage() + '\n' + "   Employee pf:"
							+ emp1.getPf() + '\n' + "   Employee salary:" + emp1.getEmploysalary());

					if (emp1.getLoanAmount() == 0.0) {
						System.out.println("   Employee Loan Amount: N/A");
						System.out.println("   Employee Emi: N/A");
						System.out.println("   Employee Tenure: N/A");
						System.out.println("   Employee LoanStartDate: N/A");
						System.out.println("   Employee LoanEndDate: N/A");
					}

				}
			}
		}

		else {

			try {
				fi = new FileInputStream("D:\\Rakesh\\rakeshdataqqqqqa");

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
			} finally {
				try {
					fi.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

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

					double actualSalary = updatedSalary * 2 / 100;
					double actualSalary1 = actualSalary + actualSalary;
					double packagee = actualSalary1 * 12;
					double pf = actualSalary1 * 2 / 100;
					emp2.setEmploysalary(actualSalary1);
					emp2.setEmployPackage(packagee);
					emp2.setPf(pf);

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
					if (emp1.getLoanAmount() == 0.0) {
						System.out.println("Employee Loan Amount: N/A");
						System.out.println("Employee Emi: N/A");
						System.out.println("Employee Tenure: N/A");
						System.out.println("Employee LoanStartDate: N/A");
						System.out.println("Employee LoanEndDate: N/A");
					}
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
				System.out.println("Enter the Id to be Deleted");
				int x = sc.nextInt();
				if (x == emp1.getEmployid()) {
					emparray[i] = null;

					System.out.println("Deleted");
				}
				/*
				 * System.out.println("Enter the Id to be Deleted"); int x = sc.nextInt(); for
				 * (int i = 0; i <= emparray.length - 1; i++) { emp1 = emparray[i]; if (x ==
				 * emp1.getEmployid()) { emparray[i] = null;
				 * 
				 * System.out.println("Deleted"); }
				 */

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
							double eligibleAmount = sal * 5;
							emp1.setLoanAmount(eligibleAmount);
							System.out.println("you are eligible @amount of:" + eligibleAmount
									+ "with 14% per annum interest rate");
							System.out.println("do you want to continue plese enter  yes or  no");

							Scanner sc = new Scanner(System.in);
							String q2 = sc.nextLine();
							String q = "yes";
							String q11 = "no";
							if (q2.equals(q)) {
								System.out.println("please enter the tenure months");
								System.out.println("please enter 12 months or 24 months");
								int tenuremonths = sc.nextInt();
								if (tenuremonths != 12 && tenuremonths != 24) {
									System.out.println("please enter correct input ");
									int tenuremonthss = sc.nextInt();

									double emi = eligibleAmount / tenuremonthss;
									double emi1 = Math.round(emi * 100.0) / 100.0;
									emp1.setEmi(emi1);

									emp1.setTenure(tenuremonthss);
									Calendar date = Calendar.getInstance();
									date.setTime(new Date());
									Format f = new SimpleDateFormat("dd-MMMM-yyyy");
									String startDate = f.format(date.getTime());
									emp1.setLoanStartDate(startDate);
									date.add(Calendar.MONTH, tenuremonthss);
									String endDate = f.format(date.getTime());
									emp1.setLoanEndDate(endDate);

								} else {

									double emi = eligibleAmount / tenuremonths;
									emp1.setEmi(emi);
									emp1.setTenure(tenuremonths);
									Calendar date = Calendar.getInstance();
									date.setTime(new Date());
									Format f = new SimpleDateFormat("dd-MMMM-yyyy");
									String startDate = f.format(date.getTime());
									emp1.setLoanStartDate(startDate);
									date.add(Calendar.MONTH, tenuremonths);
									String endDate = f.format(date.getTime());
									emp1.setLoanEndDate(endDate);
								}
								System.out.println('\n' + "   Employee Name:" + emp1.getEmployName() + '\n'
										+ "   Employee id:" + emp1.getEmployid() + '\n' + "   Employee mobilenumber:"
										+ emp1.getMobileNumber() + '\n' + "   Employee package: "
										+ emp1.getEmployPackage() + '\n' + "   Employee pf:" + emp1.getPf() + '\n'
										+ "   Employee salary:" + emp1.getEmploysalary() + '\n'
										+ "   Employee Loan Amount:" + emp1.getLoanAmount() + '\n' + "   Loan Emi:"
										+ emp1.getEmi() + '\n' + "   Tenure:" + emp1.getTenure() + '\n'
										+ "   LoanStartDate:" + emp1.getLoanStartDate() + '\n' + "   LoanEndDate:"
										+ emp1.getLoanEndDate());

							} else if (q2.equals(q11)) {
								System.out.println("thank you");
							} else {
								System.out.println("plese enter correct input");
							}

						}

					} catch (GetALoanException e) {
						System.out.println(e);
					}

				}

			}

		}
	}
}
