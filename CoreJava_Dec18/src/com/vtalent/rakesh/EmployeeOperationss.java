package com.vtalent.rakesh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EmployeeOperationss {

	static ArrayList<Employee> empArray = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> empArray1 = new ArrayList<>();

	public static void storeData(Employee emp) {
		if (null != empArray) {
			empArray.add(emp);

			Employee emp1 = new Employee();
			emp1.setEmployid(001);
			emp1.setEmployName("rakesh");
			emp1.setEmploysalary(678908);
			emp1.setMobileNumber("9985324524");
			empArray1.add(emp1);
			empArray.addAll(empArray1);
			empArray.add(emp1);

		} else {
			System.out.println("Already Inserted" + '\n');
		}
	}

	public void printAllData() {
		FileInputStream fi = null;

		if (empArray != null) {
			for (Employee emp : empArray) {
				System.out.println("   Employee Name:" + emp.getEmployName() + '\n' + "   Employee id:"
						+ emp.getEmployid() + '\n' + "   Employee mobilenumber:" + emp.getMobileNumber() + '\n'
						+ "   Employee package: " + emp.getEmployPackage() + '\n' + "   Employee pf:" + emp.getPf()
						+ '\n' + "   Employee salary:" + emp.getEmploysalary());

				if (emp.getLoanAmount() == 0.0) {
					System.out.println("   Employee Loan Amount: N/A");
					System.out.println("   Employee Emi: N/A");
					System.out.println("   Employee Tenure: N/A");
					System.out.println("   Employee LoanStartDate: N/A");
					System.out.println("   Employee LoanEndDate: N/A");
				}
			}
		} else {

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

		if (empArray != null) {

			for (Employee emp : empArray) {

				System.out.println("Enter the Id to be Updated" + '\n');
				int x = sc.nextInt();

				if (x == emp.getEmployid()) {
					System.out.println("Enter the new Salary to be Updated" + '\n');
					double updatedSalary = sc.nextDouble();

					double actualSalary = updatedSalary * 2 / 100;
					double actualSalary1 = actualSalary + actualSalary;
					double packagee = actualSalary1 * 12;
					double pf = actualSalary1 * 2 / 100;
					emp.setEmploysalary(actualSalary1);
					emp.setEmployPackage(packagee);
					emp.setPf(pf);

				}
			}
		} else {
			System.out.println("First Insert Employee Data" + '\n');
		}
	}

	public void deleteEmploy() {
		int index = 0;

		if (empArray != null) {

			for (Employee emp : empArray) {
				System.out.println("Enter the Id to be Deleted");
				int x = sc.nextInt();
				if (x == emp.getEmployid()) {

					empArray.remove(index);
					System.out.println("Deleted");
				}
				index++;
			}

		} else {
			System.out.println("No Data Found" + '\n');
		}
	}

	public void searchData() {
		if (empArray != null) {
			System.out.println("Enter the Employ_Id:");

			int x = sc.nextInt();
			for (Employee emp : empArray) {
				if (emp.getEmployid() == x) {
					if (x == emp.getEmployid()) {
						System.out.println("Employ_Id- " + emp.getEmployid() + '\n' + "Employ_Salary- "
								+ emp.getEmploysalary() + '\n' + "Employ_pf " + emp.getPf() + '\n' + "Employ_name "
								+ emp.getEmployName() + "Employ_mobilenumber- " + emp.getMobileNumber());
						if (emp.getLoanAmount() == 0.0) {
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
			}
		} else {

			System.out.println("Insert the Employee Data first" + '\n');
		}

	}

	public void validateLoan() {

		for (Employee emp : empArray) {

			System.out.println("enter id to find loan eligibility");

			int id = sc.nextInt();

			if (id == emp.getEmployid()) {
				double sal = emp.getEmploysalary();
				try {
					if (sal <= 10000) {
						throw new GetALoanException();
					} else {
						System.out.println("loan granted");
						double eligibleAmount = sal * 5;
						emp.setLoanAmount(eligibleAmount);
						System.out.println(
								"you are eligible @amount of:" + eligibleAmount + "with 14% per annum interest rate");
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
								emp.setEmi(emi1);

								emp.setTenure(tenuremonthss);
								Calendar date = Calendar.getInstance();
								date.setTime(new Date());
								Format f = new SimpleDateFormat("dd-MMMM-yyyy");
								String startDate = f.format(date.getTime());
								emp.setLoanStartDate(startDate);
								date.add(Calendar.MONTH, tenuremonthss);
								String endDate = f.format(date.getTime());
								emp.setLoanEndDate(endDate);

							} else {

								double emi = eligibleAmount / tenuremonths;
								emp.setEmi(emi);
								emp.setTenure(tenuremonths);
								Calendar date = Calendar.getInstance();
								date.setTime(new Date());
								Format f = new SimpleDateFormat("dd-MMMM-yyyy");
								String startDate = f.format(date.getTime());
								emp.setLoanStartDate(startDate);
								date.add(Calendar.MONTH, tenuremonths);
								String endDate = f.format(date.getTime());
								emp.setLoanEndDate(endDate);
							}
							System.out.println('\n' + "   Employee Name:" + emp.getEmployName() + '\n'
									+ "   Employee id:" + emp.getEmployid() + '\n' + "   Employee mobilenumber:"
									+ emp.getMobileNumber() + '\n' + "   Employee package: " + emp.getEmployPackage()
									+ '\n' + "   Employee pf:" + emp.getPf() + '\n' + "   Employee salary:"
									+ emp.getEmploysalary() + '\n' + "   Employee Loan Amount:" + emp.getLoanAmount()
									+ '\n' + "   Loan Emi:" + emp.getEmi() + '\n' + "   Tenure:" + emp.getTenure()
									+ '\n' + "   LoanStartDate:" + emp.getLoanStartDate() + '\n' + "   LoanEndDate:"
									+ emp.getLoanEndDate());

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
