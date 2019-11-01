package com.vtalent.java.mahesh;

import java.util.Scanner;
import java.io.*;

public class EmpBean implements Serializable {
	
	private int EID;
	private String EName;
	private double ESalary;
	private long EMobileNumber;

	public void setEmpID(int empID) {
		this.EID = empID;
	}

	public int getEmpID() {
		return EID;
	}
	public void setEmpName(String empname){
		this.EName=empname;
	}

	public String getEmpName() {
		return EName;
	}

	public void setEmpSalary(double empSalary) {
		this.ESalary = empSalary;
	}

	public double getEmpSalary() {
		return ESalary;
	}

	public void setEmpMobileNumber(long empMobileNumber) {
		this.EMobileNumber = empMobileNumber;
	}

	public long getEmpMobileNumber() {
		return EMobileNumber;
	}
	static EmpBean emp;

	static EmpBean[] earray;
	
	static Scanner in = new Scanner(System.in);

	private void write(EmpBean[] earray)throws Exception {
		FileOutputStream fos=new FileOutputStream("min.txt");
	     ObjectOutputStream oos=new ObjectOutputStream(fos);
	     oos.writeObject(earray);
	     System.out.println("Serialization is done");
	}
	
	public static EmpBean[] read() throws Exception{
		FileInputStream fis=new FileInputStream("min.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		EmpBean[] earray = (EmpBean[])o;
		System.out.println("deserialization is done");
		return earray;
	}
	
	public int Insertdata()throws Exception{
		int result = 0;
		System.out.println("please enter no of employeees to be inserted:");
		int n = in.nextInt();
		earray = new EmpBean[n]; 
		for (int i = 0; i <= earray.length - 1; i++) {
			EmpBean emp = new EmpBean();
			System.out.println("please enter employee id");
			emp.EID = in.nextInt();
			System.out.println("please enter employee name"); 
			emp.EName=in.next(); 
			System.out.println("please enter salary: ");
			emp.ESalary = in.nextDouble();
			System.out.println("Please enter  MobileNo:");
			emp.EMobileNumber = in.nextLong();
					if (earray[i] == null) {
						earray[i] = emp;
						System.out.println("inserted successfully");
						result++;  
					}
				}
		write(earray);
		read();
		return result;
		
	}

	public int deletedata()throws Exception {
		int result=0;
		EmpBean[] earray=read();
		System.out.println("please enter the ID to be deleted");
		int n=in.nextInt();
		if(earray!=null) {
			for(int i=0;i<=earray.length-1;i++) {
				emp=earray[i];
				if(emp!=null) {
					if(n==emp.getEmpID()) {
						earray[i]=null;
						result++;
						System.out.println("deleted successfully");
					}
				}
			}
			write(earray);
		}
		return result;
	}
		
	public void searchdata()throws Exception{
		EmpBean[] earray = read();
		System.out.println("please enter the name to be searched:");
		String s=in.next();
			for(int i=0;i<=earray.length-1;i++) {
				if(earray!=null) {
					emp=earray[i];
					if(emp!=null) {
						if(s.equals(emp.getEmpName())) {
							System.out.println("EmployeeId=" + emp.getEmpID()+
									"  "+"EmployeeName=" +emp.getEmpName()+ 
									"  "+"EmployeeSalary=" + emp.getEmpSalary()+ 
									"  "+"EmployeeMobileNo=" + emp.getEmpMobileNumber());
						}
						else {
							System.out.println("enter valid name");
						}
					}
				}
		}
	}
	
	public void searchdataletter() throws Exception {
		EmpBean[] earray = read();
		System.out.println("enter the First letter of the names to be searched:");
		char c=in.next().charAt(0);
		for(int i=0;i<=earray.length-1;i++) {
			if(earray!=null) {
				 emp=earray[i];
				if(emp!=null) {
					if(c==emp.getEmpName().charAt(0)) {
						System.out.println("EmployeeId=" + emp.getEmpID()+
								"  "+"EmployeeName=" +emp.getEmpName()+ 
								"  "+"EmployeeSalary=" +""+ emp.getEmpSalary()+ 
								"  "+"EmployeeMobileNo=" + emp.getEmpMobileNumber());
					}
					  else { 
				 System.out.println("enter valid letter");
				  }
				}}}
	}
	
	public void updatedata() throws Exception {
		EmpBean[] earray = read();
		if(earray!=null) {
		System.out.println("if u want to update employee details please enter employeeid: ");
		int u=in.nextInt();
		
		for(int i=0;i<=earray.length-1;i++) {
		 emp=earray[i];	
		 if(emp!=null) {
					if (u == (emp.getEmpID())) {
						System.out.println("EmployeeId=" + emp.getEmpID()+
						"  "+"EmployeeName="+emp.getEmpName()+
						"  "+"EmployeeSalary=" + emp.getEmpSalary()+ 
						"  " + "EmployeeMobileNo=" + emp.getEmpMobileNumber());
		System.out.println("Do u want to update id of your employee data\t"+emp.getEmpID()+ "\tyes/no:");
		String n=in.next();
		if(n.equals("yes")) {
		System.out.println("enter id to updated");
		emp.setEmpID(in.nextInt());	
		}
		System.out.println("Do you want to update name of your employee data\t"+emp.getEmpName()+"\t yes/no");
		String param=in.next();
		if(param.equals("yes")) {
			System.out.println("enter name to update");
			emp.setEmpName(in.next());	
		}
		System.out.println("Do you want to update salary of your employee data\t"+emp.getEmpSalary()+"\t yes/no");
		String n1=in.next();
		if(n1.equals("yes")) {
			System.out.println("enter salary to update");
			emp.setEmpSalary(in.nextDouble());	
		}
		System.out.println("Do you want to update mobile number of your employeee data\t"+emp.getEmpMobileNumber()+" \tyes/no");
		String n2=in.next();
		if(n2.equals("yes")) {
			System.out.println("enter mobile number to update");
			emp.setEmpMobileNumber(in.nextLong());
		}
		earray[i]=emp;
	}
		 } 
		}write(earray);
		}
		else {
			System.out.println("please enter valid ID");
		}
	}
	
	public void printdata() throws Exception {
		EmpBean[] earray = read();
			for (int i = 0; i <= earray.length - 1; i++) {
			if (earray[i] != null) {
				emp=earray[i];
				if(emp!=null) {
			System.out.println("EmployeeId=" + emp.getEmpID() + 
						  "  "+"EmployeeName="+emp.getEmpName()+
						  "  "+ "EmployeeSalary="+emp.getEmpSalary()+
						  "  " + "EmployeeMobileNo=" + emp.getEmpMobileNumber());
			}
			}else {
				System.out.println("Enter valid ID");
			}
			}
		}
		
	public void Exit(){
		System.out.println("Task Exited");
		}
	
		public static void main(String[] args) throws Exception,NullPointerException {
		EmpBean e = new EmpBean();
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("please select your choice:\n" + "1.insert into Array.\n" + "2.delete an employee.\n"
					+ "3.search an employee by name.\n" + "4.search an employee through letter.\n"+"5.update an employee.\n"+"6.print all the employees.\n"
					+ "7.Exit.");
			int scan = sc.nextInt();
			switch (scan) {
			case 1:
				e.Insertdata();
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
			case 7:
				e.Exit();
				System.exit(0);
			}
		}
		}
}		