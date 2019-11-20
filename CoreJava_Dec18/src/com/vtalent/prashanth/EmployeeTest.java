package com.vtalent.prashanth;

import java.io.*;
import java.util.*;

class EmployeeBean1 implements Serializable {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private long employeeMobileNo;
//	static EmployeeBean1[] emp1;
	static ArrayList<EmployeeBean1> emp1 = new ArrayList<EmployeeBean1>();
	static Scanner sc = new Scanner(System.in);
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalaray(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public long getEmployeeMobileNo() {
		return employeeMobileNo;
	}
	public void setEmployeeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	
	public void writeObjectFile(ArrayList<EmployeeBean1> emp1) throws Exception {
		File file = new File("EmployeeBeanT.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("Serialization is done");
	} 
	public ArrayList<EmployeeBean1> readObjectFile() throws Exception {
		FileInputStream fis = new FileInputStream("EmployeeBeanT.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		ArrayList<EmployeeBean1> emp1 = (ArrayList<EmployeeBean1>)o;
		return emp1;
	}
	
	public void insert() throws Exception {
//		System.out.println("Please enter no of employees to insert in to Array: ");
//		int z = sc.nextInt();
//		emp1 = new ArrayList<EmployeeBean1>();
		
//		for(int i=0;i<emp1.length;i++) {
			EmployeeBean1 ae = new EmployeeBean1();
			System.out.println("Please enter employee Id: ");
			employeeId = sc.nextInt();
			ae.setEmployeeId(employeeId);
			System.out.println("Plese enter employee Name: ");
			sc.nextLine();
			employeeName = sc.nextLine();
			ae.setEmployeeName(employeeName);
			System.out.println("Please enter Salary: ");
			employeeSalary = sc.nextDouble();
			ae.setEmployeeSalaray(employeeSalary);
			System.out.println("Please enter Mobile no: ");
			employeeMobileNo = sc.nextLong();
			ae.setEmployeeMobileNo(employeeMobileNo);
			emp1.add(ae);
//			emp1[i] = ae;
//		}
		writeObjectFile(emp1);
		readObjectFile();
		for(EmployeeBean1 ae1:emp1) {
//			EmployeeBean1 ae1 = (EmployeeBean1)emp1[i];
			System.out.println("Id="+ae1.employeeId +" "+"Name="+ae1.employeeName+" "+"Salary="+ae1.employeeSalary +" "+"Mobile no="+ae1.employeeMobileNo);
		}
		System.out.println("Employee data inserted successfully in to the Array. ");
	}
	
	public void delete() throws Exception {
		System.out.println("Enter an employeeId to be delete. ");
		int w = sc.nextInt();
		ArrayList<EmployeeBean1> emp1=readObjectFile();
		int count=0;
		if(emp1 != null) {
			for(EmployeeBean1 a2:emp1) {
				if(a2!=null && a2.employeeId == w){
//					a2=null;
					emp1.remove(a2);
//					System.out.println("Id="+a2.employeeId +" "+"Name="+a2.employeeName+" "+"Salary="+a2.employeeSalary +" "+"Mobile no="+a2.employeeMobileNo);
					count++;
					break;
				}
			}
		}
		if(count == 0) {
			System.out.println("Employee Id Not Found..!!");
		} else {
			System.out.println("Employee id Deleted Successfully..!!");
			System.out.println("Now the New Array is : ");
			for(EmployeeBean1 ae2:emp1) {
				if(ae2 != null) {
//					EmployeeBean1 ae2 = (EmployeeBean1)emp1[i];
					System.out.println("Id="+ae2.employeeId +" "+"Name="+ae2.employeeName+" "+"Salary="+ae2.employeeSalary +" "+"Mobile no="+ae2.employeeMobileNo);
				}
			}
		}
		writeObjectFile(emp1);
	}
	
	public void search() throws Exception {
		System.out.println("Enter an employeeId to be search: ");
		int x = sc.nextInt();
		ArrayList<EmployeeBean1> emp1=readObjectFile();
		if(emp1 != null) {
			for (EmployeeBean1 ae3:emp1) {
//				EmployeeBean1 ae3 = (EmployeeBean1)emp1[i];
				if(ae3 != null && ae3.employeeId == x) {
					System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					System.out.println("Given employeeId is in the array. ");
					return;
				}
			}
		System.out.println("Employee id not found. ");
		}
	}
	
	public void printAll() throws Exception {
		ArrayList<EmployeeBean1> emp1=readObjectFile();
		if(emp1 != null) {
			for(EmployeeBean1 ae4:emp1) {
				if(ae4 != null) {
//					EmployeeBean1 ae4 = (EmployeeBean1)emp1[i];
					System.out.println("Id="+ae4.employeeId +" "+"Name="+ae4.employeeName+" "+"Salary="+ae4.employeeSalary +" "+"Mobile no="+ae4.employeeMobileNo);
				}
			}
		System.out.println("All the employee details printed successfully. ");
		}
	}
	
	public void searchWithName() throws Exception {
		boolean flag = false;
		int message=0;
		System.out.println("Enter an employeeName Starting Letter to be search: ");
		char t = sc.next().charAt(0);
		ArrayList<EmployeeBean1> emp1=readObjectFile();
		if(emp1 != null) {
			for (EmployeeBean1 ae5:emp1) {
//				EmployeeBean1 ae5 = (EmployeeBean1)emp1[i];
				if(ae5 != null) {
					String e1 = ae5.employeeName;
					char[] n = e1.toCharArray();
					if( n[0] == t) {
						flag = true;
						if(message==0) {
							System.out.println("EmployeeName found with " + t + " letter. ");
							message++;
						}
						System.out.println("Id="+ae5.employeeId +" "+"Name="+ae5.employeeName+" "+"Salary="+ae5.employeeSalary +" "+"Mobile no="+ae5.employeeMobileNo);	
					}
				}
			}
		}
		if(!flag) {
			System.out.println("EmployeeName not found with " + t + " letter. ");
		}
	}
	
	public void update() throws Exception {
		System.out.println("Enter an employeeId to be update: ");
		int c = sc.nextInt();
		ArrayList<EmployeeBean1> emp1=readObjectFile();
		if(emp1 != null) {
			for (EmployeeBean1 ae3:emp1) {
//				EmployeeBean1 ae3 = (EmployeeBean1)emp1[i];
				if(ae3 != null && ae3.employeeId == c) {
					System.out.println("Given employeeId details. ");
					System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					System.out.println("Do you want to update employeeId yes or no. ");
					String es = sc.next();
					if(es.equals("yes")) {
						System.out.println("Enter employeeId to be update: ");
						int l = sc.nextInt();
						ae3.employeeId = l;
						System.out.println("Employee Id updated successfully. ");
						System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					}else {
						System.out.print("");
					}
					System.out.println("Do you want to update employeeName yes or no");
					String es1 = sc.next();
					if(es1.equals("yes")) {
						System.out.println("Enter employeeName to be update: ");
						sc.nextLine();
						String s1 = sc.nextLine();
						ae3.employeeName = s1;
						System.out.println("Employee Name updated successfully.");
						System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					}else {
						System.out.print("");
					}
					System.out.println("Do you want to update employeeSalary yes or no");
					String es2 = sc.next();
					if(es2.equals("yes")) {
						System.out.println("Enter employeeSalary to be update: ");
						double d1 = sc.nextDouble();
						ae3.employeeSalary = d1;
						System.out.println("Employee Salary updated successfully.");
						System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					}else {
						System.out.print("");
					}
					System.out.println("Do you want to update employeeMobileNo yes or no");
					String es3 = sc.next();
					if(es3.equals("yes")) {
						System.out.println("Enter employeeMobileNo to be update: ");
						long l1 = sc.nextLong();
						ae3.employeeMobileNo = l1;
						System.out.println("Employee MobileNo updated successfully.");
						System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					}else {
						System.out.println("Employee details successfully updated. ");
						System.out.println("Id="+ae3.employeeId +" "+"Name="+ae3.employeeName+" "+"Salary="+ae3.employeeSalary +" "+"Mobile no="+ae3.employeeMobileNo);
					}
					writeObjectFile(emp1);
					return;
				}
			}
			System.out.println("Employee id not found. ");
		}
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		
		EmployeeBean1 a = new EmployeeBean1();
		for(;;) {
			Scanner s = new Scanner(System.in);
			System.out.println("Please select your choice: \r\n" +
					"1. insert Into Array.\r\n" + 
					"2. delete from my Array.\r\n" + 
					"3. Search an employee from my Array.\r\n" + 
					"4. Print All the employees from my Array.\r\n" +
					"5. Search an employeeName with letter from my Array.\r\n" +
					"6. Update an employee details.\r\n" +
					"7. Exit.");
			int scan = s.nextInt();
			switch(scan) {
			case 1: a.insert();
			break;
			case 2: a.delete();
			break;
			case 3: a.search();
			break;
			case 4: a.printAll();
			break;
			case 5: a.searchWithName();
			break;
			case 6: a.update();
			break;
			case 7: 
			System.exit(0);
			default: System.out.println("Please give a valid Input: ");
			
			}
		}
	}

}
