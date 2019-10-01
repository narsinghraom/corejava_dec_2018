package com.vtalent.java.haritha;

import java.util.*;

class EmployeeBean2 {
	private int EmployeeId;
	private double EmployeeSalary;
	private long EmployeeMobileNo;
	private String EmployeeName;

	public void setEmployeeId(int EId) {
		this.EmployeeId = EId;
	}

	public void setEmployeeSalary(double ESalary) {
		this.EmployeeSalary = ESalary;
	}

	public void setEmployeeMobileNo(long EMobileNo) {
		this.EmployeeMobileNo = EMobileNo;
	}

	
	 public void setEmployeeName(String EName) {
		 this.EmployeeName=EName; } 
	 

	public int getEmployeeId() {
		return this.EmployeeId;
	}

	public double getEmployeeSalary() {
		return this.EmployeeSalary;
	}

	public long getEmployeeMobileNo() {
		return this.EmployeeMobileNo;
	}

	
	  public String getEmployeeName() {
		  return this.EmployeeName; }
	 
    static EmployeeBean2 emp;  
	static EmployeeBean2[] empbean;
	static Scanner in = new Scanner(System.in);

	public int InsertData() {
		int result = 0;
		System.out.println("please enter no of employeees to insert into Array");
		int n = in.nextInt();
		empbean = new EmployeeBean2[n];
		 
		for (int i = 0; i <= empbean.length - 1; i++) {
			EmployeeBean2 emp = new EmployeeBean2();
			System.out.println("please enter employee id");
			emp.EmployeeId = in.nextInt();
			
			  System.out.println("please enter employee name"); 
			  emp.EmployeeName=in.next();
			 
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

	/*
	 * public void searchdata() {
	 * System.out.println("please enter the data to be searched"); int n =
	 * in.nextInt(); for (int i = 0; i <= empbean.length - 1; i++) { if (empbean!=
	 * null) { EmployeeBean2 emp= empbean[i]; if(emp!=null) { if (n ==
	 * emp.getEmployeeId()) { System.out.println("EmployeeId=" + emp.getEmployeeId()
	 * + "  " + "EmployeeSalary=" + emp.getEmployeeSalary() + "  " +
	 * "EmployeeMobileNo=" + emp.getEmployeeMobileNo()); }else {
	 * System.out.println("enter valid id ");
	 * 
	 * }
	 * 
	 * } } } }
	 */		
	public void searchdata() {
	System.out.println("please enter the name to be searched");
	String s=in.next();
	for(int i=0;i<=empbean.length-1;i++) {
		if(empbean!=null) {
			EmployeeBean2 emp=empbean[i];
			if(emp!=null) {
				if(s.equals(emp.getEmployeeName())) {
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
	}
	public void searchdataletter() {
		System.out.println("enter the letter to be searched");
		char c=in.next().charAt(0);
		for(int i=0;i<=empbean.length-1;i++) {
			if(empbean!=null) {
				EmployeeBean2 emp=empbean[i];
				if(emp!=null) {
					if(c==emp.getEmployeeName().charAt(0)) {
						System.out.println("EmployeeId=" + emp.getEmployeeId() +
								"EmployeeName=" +emp.getEmployeeName() + 
								 "EmployeeSalary=" +""+ emp.getEmployeeSalary() + 
								 "EmployeeMobileNo=" + emp.getEmployeeMobileNo());
					}
					  else { 
				 System.out.println("enter valid letter");
				  }
}}}
	}
	public void updatedata() {
		if(empbean!=null) {
		
		System.out.println("if u want to update employee details please enter employeeid: ");
		int u=in.nextInt();
		for(int i=0;i<=empbean.length-1;i++) {
		EmployeeBean2 emp=empbean[i];	
		 if(emp!=null) {
					if (u == (emp.getEmployeeId())) {
						System.out.println("EmployeeId=" + emp.getEmployeeId() +
						"  "+"EmployeeName="+emp.getEmployeeName() +
					"EmployeeSalary=" + emp.getEmployeeSalary() + "  " +
				 "EmployeeMobileNo=" + emp.getEmployeeMobileNo());
		System.out.println("Do u want to update id of your employee data\t"+emp.getEmployeeId()+ "\tyes/no:");
		String n=in.next();
		if(n.equals("yes")) {
		System.out.println("enter id to updated");
		emp.setEmployeeId(in.nextInt());	
		}
		System.out.println("Do you want to update name of your employee data\t"+emp.getEmployeeName()+"\t yes/no");
		String param=in.next();
		if(param.equals("yes")) {
			System.out.println("enter name to update");
			emp.setEmployeeName(in.next());	
		}
		System.out.println("Do you want to update salary of your employee data\t"+emp.getEmployeeSalary()+"\t yes/no");
		String n1=in.next();
		if(n1.equals("yes")) {
			System.out.println("enter salary to update");
			emp.setEmployeeSalary(in.nextDouble());	
		}
		System.out.println("Do you want to update mobile number of your employeee data\t"+emp.getEmployeeMobileNo()+" \tyes/no");
		String n2=in.next();
		if(n2.equals("yes")) {
			System.out.println("enter mobile number to update");
			emp.setEmployeeMobileNo(in.nextLong());
		}
		empbean[i]=emp;
	}
		 }
		 
		}
		
		}
		else {
			System.out.println("Array empty, please insert data");
		}
	}
	
	
		public void printdata() {

		for (int i = 0; i <= empbean.length - 1; i++) {
			if (empbean[i] != null) {
				EmployeeBean2 emp=(EmployeeBean2)empbean[i];
				if(emp!=null) {
			System.out.println("EmployeeId=" + emp.getEmployeeId() + "  "+"EmployeeName="+emp.getEmployeeName() + "EmployeeSalary="
					+ emp.getEmployeeSalary() + "  " + "EmployeeMobileNo=" + emp.getEmployeeMobileNo());

			}
			}else {
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
					+ "3.search an employee from my Array.\n" + "4.search through letter from array.\n"+"5.update from my array.\n"+"6.print all the employees from my Array.\n"
					+ "7.Exit.");
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
				e.searchdataletter();
				break;
			case 5:
				e.updatedata();
				break;
			case 6:
				e.printdata();
				break;
			default:
				System.out.println("Enter valid input:");
				System.exit(0);
			}

		}

	}

}
