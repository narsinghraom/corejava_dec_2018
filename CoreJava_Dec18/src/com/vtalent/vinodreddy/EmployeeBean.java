
package com.vtalent.vinodreddy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class EmployeeBean implements Serializable {
	private int employeeId;
	private double employeeSalary;
	private long employeeMobileNo;
	private String employeeName;
	static EmployeeBean[] emparray;
	
	static Scanner s = new Scanner(System.in);

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public void setEmployeeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}

	public int getEmployeeId() {
		return this.employeeId;

	}

	public String getEmployeeName() {
		return this.employeeName;

	}

	public double getEmployeeSalary() {
		return this.employeeSalary;

	}

	public long getEmployeeMobileNo() {
		return this.employeeMobileNo;

	}

	private void writeObjectInToFile(EmployeeBean[] emparray) throws Exception {
		// TODO Auto-generated method stub
//			EmployeeBean emp =new EmployeeBean();
		File file = new File("employeedatata.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emparray);
		System.out.println("serializable");

	}

	private EmployeeBean[] readFileToGetObject() throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("employeedatata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		EmployeeBean[] emparray = (EmployeeBean[]) o;
		/*
		 * for (int i = 0; i < emparray.length; i++) { EmployeeBean emp = emparray[i];
		 * 
		 * System.out.println("id=" + emp.getEmployeeId() + "  " + "Name=" +
		 * emp.getEmployeeName() + "  " + "Salary=" + emp.getEmployeeSalary() + "  " +
		 * "MobileNumber=" + emp.getEmployeeMobileNo());
		 * 
		 * }
		 */
		return emparray;
	}

	public void insert() throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.of Employees to be stored");
		int size = s.nextInt();
		emparray = new EmployeeBean[size];

		for (int i = 0; i < size; i++) {
			EmployeeBean em = new EmployeeBean();
			System.out.println("enter the EmployeeName");
			s.nextLine();
			String name = s.nextLine();
			em.setEmployeeName(name);
			System.out.println("enter the EmployeeId");
			int id = s.nextInt();
			em.setEmployeeId(id);
			System.out.println("enter the EmployeeSalary");
			double sl = s.nextDouble();
			em.setEmployeeSalary(sl);
			System.out.println("enter the EmployeeMobileNumber");
			long mno = s.nextLong();
			em.setEmployeeMobileNo(mno);
			emparray[i] = em;
		}
		writeObjectInToFile(emparray);
		readFileToGetObject();
	}

	public void delete() throws Exception {
		EmployeeBean[] emparray =readFileToGetObject();
		 EmployeeBean emp; 
		for(int i =0;i<emparray.length;i++) {
			  emp = emparray[i];
		  
		  System.out.println("id="+emp.getEmployeeId()+"  "+"Name="+emp.getEmployeeName()+"  "+"salary="+emp.getEmployeeSalary()+"  "+"mobileno="+emp.getEmployeeMobileNo());
		  }
		 System.out.println("enter the id to be deleted"); 
		  int n =s.nextInt();
		 
		
		for(int i=0;i<emparray.length;i++) {
			emp =emparray[i];
			if(n ==emp.getEmployeeId()) {
				emp=null;
				emparray[i]=emp;
			}
		}
		
		  
		  writeObjectInToFile(emparray); 
		 

	}

	
	public void search() throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		EmployeeBean emp;
		EmployeeBean[] emparray =readFileToGetObject();
	    System.out.println("enter the id to be search");
		int n = s.nextInt();
		if(emparray!=null) {		
		for (int i = 0; i < emparray.length; i++) {
			emp = emparray[i];
			if (emp!=null && emp.getEmployeeId() == n ) {
				System.out.println("id=" + emp.getEmployeeId() + "  " + "Name=" + emp.getEmployeeName() + "  "
						+ "Salary=" + emp.getEmployeeSalary() + "  " + "MobileNumber=" + emp.getEmployeeMobileNo());
				System.out.println("the employee details successfully found");
				return;
			
			}
		}

		}	
		
	}

	public void pritntAllData() throws Exception {
		// TODO Auto-generated method stub
		/*
		 * EmployeeBean emp; System.out.println("The All the Employee details are");
		 * for(int i=0;i<emparray.length;i++) { if(emparray[i] != null) {
		 * emp=emparray[i]; // writeObjectInToFile();
		 * System.out.println("id="+emp.getEmployeeId()+" "+"Name="+emp.getEmployeeName(
		 * )+" "+"Salary="+emp.getEmployeeSalary()+"  "+"MobileNumber="+emp.
		 * getEmployeeMobileNo()); } } writeObjectInToFile();
		 */
		EmployeeBean[] emparray = readFileToGetObject();
		if (emparray != null) {
			for (int i = 0; i < emparray.length; i++) {
				EmployeeBean emp = emparray[i];
				if (emp != null) {
					System.out.println("id=" + emp.getEmployeeId() + "  " + "Name=" + emp.getEmployeeName() + "  "
							+ "Salary=" + emp.getEmployeeSalary() + "  " + "MobileNumber=" + emp.getEmployeeMobileNo());
				}

			}
		}
		
		 
	}

	public void searchwithemployeeName() throws Exception {
		// TODO Auto-generated method stub
		EmployeeBean[] emparray = readFileToGetObject();
		EmployeeBean emp;
		boolean flag = false;
		int message = 0;
		System.out.println("enter particular Name to be search");
		char e = s.next().charAt(0);
		for (int i = 0; i < emparray.length; i++) {
			emp = emparray[i];
			if (emparray[i] != null) {
				String q = emparray[i].employeeName;
				char[] w = q.toCharArray();
				if (w[0] == e) {
					flag = true;
					if (message == 0) {
						System.out.println("employeeName=" + emp.getEmployeeName() + "" + "id=" + emp.getEmployeeId()
								+ "" + "salary=" + emp.getEmployeeSalary() + "" + "mobileno="
								+ emp.getEmployeeMobileNo());
						message++;
					}
				}
			}
		}
		if (!flag) {
			System.out.println("the employee name with letter " + e + " not found");
		}
	}

	public void updatedetails() throws Exception {
		// TODO Auto-generated method stub
		EmployeeBean[] emparray = readFileToGetObject();
		EmployeeBean emp;
		System.out.println("Enter the Id to be Updated");
		int n = s.nextInt();
		for (int i = 0; i < emparray.length; i++) {
			emp = emparray[i];
			if (emparray[i] != null && emparray[i].employeeId == n) {
				System.out.println("enter Employees new Id yes or no");
				String w = s.next();
				if (w.equals("yes")) {
					System.out.println("enter new employee id:");
					int e = s.nextInt();
					emparray[i].employeeId = e;
					System.out.println("employeeName=" + emp.getEmployeeName() + "" + "id=" + emp.getEmployeeId() + ""
							+ "salary=" + emp.getEmployeeSalary() + "" + "mobileno=" + emp.getEmployeeMobileNo());
				} else {
					System.out.println("  ");
				}
				System.out.println("Enter Employees new Name yes or no.");
				String name = s.next();
				if (name.equals("yes")) {
					System.out.println("enter The new employee Name");
					employeeName = s.next();
					emparray[i].employeeName = employeeName;
					System.out.println("employeeName=" + emp.getEmployeeName() + "" + "id=" + emp.getEmployeeId() + ""
							+ "salary=" + emp.getEmployeeSalary() + "" + "mobileno=" + emp.getEmployeeMobileNo());
				} else {
					System.out.println("  ");
				}
				System.out.println("Enter Employee new  Salary yes or no.");
				String w1 = s.next();
				if (w1.equals("yes")) {
					System.out.println("enter salary:");
					double r = s.nextDouble();
					emparray[i].employeeSalary = r;
					System.out.println("employeeName=" + emp.getEmployeeName() + "" + "id=" + emp.getEmployeeId() + ""
							+ "salary=" + emp.getEmployeeSalary() + "" + "mobileno=" + emp.getEmployeeMobileNo());
				} else {
					System.out.println("  ");
				}
			}
			System.out.println("enter Employees new Mobileno yes or no. ");
			String e = s.next();
			if (e.equals("yes")) {
				System.out.println("enter mobile no:");
				long b = s.nextLong();
				emparray[i].employeeMobileNo = b;
				System.out.println("employeeName=" + emp.getEmployeeName() + "" + "id=" + emp.getEmployeeId() + ""
						+ "salary=" + emp.getEmployeeSalary() + "" + "mobileno=" + emp.getEmployeeMobileNo());
			} else {
				System.out.println("  ");
			}
		}
	}
}
