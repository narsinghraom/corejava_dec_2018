package com.vtalent.java.haritha;
import java.io.*;
import java.util.*;

class EmployeeBean2 implements Serializable{
	private static final int EmployeeBean2 = 0;
	private int EmployeeId;
	private double EmployeeSalary;
	private long EmployeeMobileNo;
	private String EmployeeName;
	static ArrayList<EmployeeBean2> empbean=new ArrayList<EmployeeBean2>();


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
	static Scanner in = new Scanner(System.in);
	
	private void write(ArrayList<EmployeeBean2> empbean)throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("serial.txt");
	     ObjectOutputStream oos=new ObjectOutputStream(fos);
	     oos.writeObject(empbean);
	     System.out.println("Serialization is done");
	}
		public int InsertData()throws Exception{
		int result = 0;
			EmployeeBean2 emp1 = new EmployeeBean2();
			System.out.println("please enter employee id");
			emp1.EmployeeId = in.nextInt();
			System.out.println("please enter employee name"); 
			emp1.EmployeeName=in.next();
			System.out.println("please enter salary ");
			emp1.EmployeeSalary = in.nextDouble();
			System.out.println("EmployeeMobileNo");
			emp1.EmployeeMobileNo = in.nextLong();
			empbean.add(emp1);
			System.out.println(empbean);
			for(EmployeeBean2 emp10:empbean) {
			System.out.println("EmployeeId="+emp10.EmployeeId);
			System.out.println("EmployeeName="+emp10.EmployeeName);
			System.out.println("EmployeeSalary="+emp10.EmployeeSalary);
			System.out.println("EmployeeMobileNo"+emp10.EmployeeMobileNo);
			 System.out.println("inserted successfully in the array");
		}
		 write(empbean); read();
		return result;	
		}

	public static ArrayList<EmployeeBean2> read() throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("serial.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		ArrayList<EmployeeBean2> arry = (ArrayList<EmployeeBean2>)o;
		  for(EmployeeBean2 e:empbean) { 
		  System.out.println("EmployeeId=" + e.getEmployeeId() + "EmployeeName="
		 +e.getEmployeeName() + "EmployeeSalary=" + e.getEmployeeSalary() +
		  "EmployeeMobileNo=" + e.getEmployeeMobileNo()); }
		  System.out.println("deserialization is done");
		 return arry;
	}

	public void deletedata()throws Exception {
		int result=0;
		System.out.println("please enter the data to be deleted");
		int n=in.nextInt();
		ArrayList<EmployeeBean2> empbean=read();
		if(empbean!=null) {
			for(EmployeeBean2 emp:empbean) {
//				emp=empbean[i];
				if(emp!=null && n==emp.getEmployeeId()) {
					empbean.remove(emp);
						result++;	
				}	
			}
			if(result == 0) {
				System.out.println("Employee id not found");
			}else {
				System.out.println("Employee id deleted successfully");
				for(EmployeeBean2 emp15:empbean) {
				System.out.println("EmployeeId=" + emp15.getEmployeeId() +
						"EmployeeName=" +emp15.getEmployeeName() + 
						 "EmployeeSalary=" + emp15.getEmployeeSalary() + 
						 "EmployeeMobileNo=" + emp15.getEmployeeMobileNo());
			}
					}
						}
		write(empbean);
	}

	public void searchdata()throws Exception{
		ArrayList<EmployeeBean2> empbean = read();
	System.out.println("please enter the name to be searched");
	String s=in.next();
	for(EmployeeBean2 emp:empbean) {
		if(empbean!=null) {
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
		for(EmployeeBean2 emp:empbean) {
			if(empbean!=null) {
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
}
	}
		}
			}
	public void updatedata() throws Exception {
		ArrayList<EmployeeBean2> empbean = read();
		if(empbean!=null) {
		System.out.println("if u want to update employee details please enter employeeid: ");
		int u=in.nextInt();
		for(EmployeeBean2 emp:empbean) {
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
	}
		 }
		 
		}
		write(empbean);
		}
		else {
			System.out.println("Array empty, please insert data");
		}
	}
	public void printdata() throws Exception {
			ArrayList<EmployeeBean2> empbean = read();
		for (EmployeeBean2 emp:empbean) {
		if (empbean != null) {
				if(emp!=null) {
			System.out.println("EmployeeId=" + emp.getEmployeeId() + "  "+"EmployeeName="+emp.getEmployeeName()+" " + "EmployeeSalary="
					+ emp.getEmployeeSalary() + "  " + "EmployeeMobileNo=" + emp.getEmployeeMobileNo());
			}
			}else {
				System.out.println("insert the employee data first");
			}
		}
	}
	}
public class Employeemain {
public static void main(String[] args) throws Exception,NullPointerException {
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
