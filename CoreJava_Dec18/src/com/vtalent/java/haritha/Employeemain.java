package com.vtalent.java.haritha;

import java.util.*;

class EmployeeBean2 {
	private int EmployeeId;
	private double EmployeeSalary;
	private long EmployeeMobileNo;
	//private String EmployeeName;

	public void setEmployeeId(int EId) {
		this.EmployeeId = EId;
	}

	public void setEmployeeSalary(double ESalary) {
		this.EmployeeSalary = ESalary;
	}

	public void setEmployeeMobileNo(long EMobileNo) {
		this.EmployeeMobileNo = EMobileNo;
	}

	
	/* public void setEmployeeName(String EName) { this.EmployeeName=EName; } */
	 

	public int getEmployeeId() {
		return this.EmployeeId;
	}

	public double getEmployeeSalary() {
		return this.EmployeeSalary;
	}

	public long getEmployeeMobileNo() {
		return this.EmployeeMobileNo;
	}

	/*
	 * public String getEmployeeName() { return this.EmployeeName; }
	 */
    static EmployeeBean2 emp;  
	static EmployeeBean2[] empbean;
	static Scanner in = new Scanner(System.in);

	public int InsertData() {
		int result = 0;
		System.out.println("please enter no of employeees to insert into Array");
		int n = in.nextInt();
		empbean = new EmployeeBean2[n];
		EmployeeBean2 emp ;
		for (int i = 0; i <= empbean.length - 1; i++) {
			emp = new EmployeeBean2();
			System.out.println("please enter employee id");
			emp.EmployeeId = in.nextInt();
			/*
			 * System.out.println("please enter employee name"); emp.EmployeeName=in.next();
			 */
			System.out.println("please enter salary ");
			emp.EmployeeSalary = in.nextDouble();
			System.out.println("EmployeeMobileNo");
			emp.EmployeeMobileNo = in.nextLong();
					if (empbean[i] == null) {
						empbean[i] = emp;
						System.out.println("inserted successfully in the array");
						result++;

					}
				}
		return result;
	}

	public int deletedata() {
		int result=0;
		System.out.println("please enter the data to be deleted");
		int n=in.nextInt();
		if(empbean!=null) {
			for(int i=0;i<=empbean.length-1;i++) {
				emp=empbean[i];
				if(emp!=null) {
					if(n==emp.getEmployeeId()) {
						empbean[i]=null;
						result++;
						System.out.println("deleted successfully");
					}
				}
				
			}
			
		}
		return result;
	}

	public void searchdata() {
		System.out.println("please enter the data to be searched");
		int n = in.nextInt();
			for (int i = 0; i <= empbean.length - 1; i++) {
				if (empbean!= null) {
					EmployeeBean2 emp= empbean[i];
					if(emp!=null) {
					if (n == emp.getEmployeeId()) {
						System.out.println("EmployeeId=" + emp.getEmployeeId() + "  " + "EmployeeSalary="
								+ emp.getEmployeeSalary() + "  " + "EmployeeMobileNo=" + emp.getEmployeeMobileNo());
					}else {
						System.out.println("enter valid id ");

					}

				}
			}
		}
	}
		/*System.out.println("please enter the name to be searched");
	String s=in.next();
	for(int i=0;i<=empbean.length-1;i++) {
		if(empbean!=null) {
			EmployeeBean2 emp=empbean[i];
			if(emp!=null) {
				if(s==emp.getEmployeeName()) {
					System.out.println("EmployeeId=" + emp.getEmployeeId() +
							"EmployeeName=" +emp.getEmployeeName() + 
							 "EmployeeSalary=" + emp.getEmployeeSalary() + 
							 "EmployeeMobileNo=" + emp.getEmployeeMobileNo());
				}
				else {
					System.out.println("enter valid name");
				}
			}
		}
	}
	}*/

	public void printdata() {

		for (int i = 0; i <= empbean.length - 1; i++) {
			if (empbean[i] != null) {
				EmployeeBean2 emp=(EmployeeBean2)empbean[i];
			System.out.println("EmployeeId=" + emp.getEmployeeId() + "  " + "EmployeeSalary="
					+ emp.getEmployeeSalary() + "  " + "EmployeeMobileNo=" + emp.getEmployeeMobileNo());

			} else {
				System.out.println("insert the employee data first");
			}
		}
	}
}

public class Employeemain {

	public static void main(String[] args) {
		EmployeeBean2 e = new EmployeeBean2();
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("please select your choice:\n" + "1.insert into Array.\n" + "2.delete from my Array.\n"
					+ "3.search an employee from my Array.\n" + "4.print all the employees from my Array.\n"
					+ "5.Exit.");
			int scan = sc.nextInt();
			switch (scan) {
			case 1:
				e.InsertData();
				break;
			case 2:
				e.deletedata();
				break;
			case 3:
				e.searchdata();
				break;
			case 4:
				e.printdata();
				break;
			case 5:
				return;
			default:
				System.out.println("Enter valid input:");
				System.exit(0);
			}

		}

	}

}
