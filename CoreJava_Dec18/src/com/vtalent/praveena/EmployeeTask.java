package com.vtalent.praveena;

import java.util.Scanner;
import java.io.*;

public class EmployeeTask {
	static EmployeeDetails[] empArray;
	static Scanner a = new Scanner(System.in);

	public static void insertData(EmployeeDetails emp) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i] == null) {
					empArray[i] = emp;
					break;
				}
			}
		}
	}

	public static void printAllEmployeeData() {
		if (empArray != null) {
			for (int i = 0; i < empArray.length; i++) {

				EmployeeDetails emp = empArray[i];
				if (empArray[i] == null) {

				} else {
					System.out.println("Employee ID: " + empArray[i].getemployeeID() + "\n" + "Employee Name: "
							+ empArray[i].getemployeeName() + "\n" + "Package" + empArray[i].getemployeePackage() + "\n"
							+ "Salary: " + empArray[i].getemployeeSalary() + "\n" + "PF" + empArray[i].getemployeePF());
				}
			}
		}

	}

	public static void updateData(int empID) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i].getemployeeID() == empID) {
					System.out.println("Enter new employee details");
					System.out.println("enter Package");
					empArray[i].setemployeePackage(a.nextDouble());
					// Employee empUD=new Employee();empUD.setemployeeSalary(a.nextDouble());
					// empArray[i]=empUD;
					System.out.println("Data got updated and updated employee details are");
					System.out.println("Employee ID: " + empArray[i].getemployeeID() + "\n" + "Employee Name: "
							+ empArray[i].getemployeeName() + "\n" + "Package" + empArray[i].getemployeePackage() + "\n"
							+ "Salary: " + empArray[i].getemployeeSalary() + "\n" + "PF" + empArray[i].getemployeePF());
					break;
				}

				System.out.println("Enter valid employee ID");

			}
		}

		else {
			System.out.println("No data available in database");

		}
	}

	public static void deleteData(int empID) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i].getemployeeID() == empID) {

					empArray[i] = null;
					System.out.println("Employee ID: " + empID + " deleted");
					break;

				}

				System.out.println("Enter valid Employee ID to delete");
			}
		}

		else {
			System.out.println("No data available in database");
		}
	}

	public static void SearchEmployee(int empID) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i] == null) {

				}

				else if (empArray[i].getemployeeID() == empID) {
					System.out.println("Employee ID: " + empArray[i].getemployeeID() + "\n" + "Employee Name: "
							+ empArray[i].getemployeeName() + "\n" + "Package" + empArray[i].getemployeePackage() + "\n"
							+ "Salary: " + empArray[i].getemployeeSalary() + "\n" + "PF" + empArray[i].getemployeePF());
					break;
				}

				System.out.println("enter valid employee ID");
			}

		} else {
			System.out.println("no data available in database");
		}
	}
<<<<<<< HEAD

	public static void getLoan(int empID) {
		if (empArray != null) {
			for (int i = 0; i <= empArray.length - 1; i++) {
				if (empArray[i].getemployeeID() == empID) {
					if (empArray[i].getemployeeSalary() > 20000) {
						System.out.println("Eligible for Loan");
						break;
					} else {
						System.out.println("Not eligible for Loan");
					}

				}

				System.out.println("Enter valid employee ID");
=======
	public static void getLoan(int empID)
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				if(empArray[i].getemployeeID()==empID)
				{
					Loan ln=new Loan();
					ln.LoanApproval(empArray[i].getemployeeSalary());
			
			}
			
>>>>>>> 7116f6cb8fc00c2f18c0b6c2a62c3a814bf19c94

			}
		} else {
			System.out.println("No data available in database");

		}
	}
<<<<<<< HEAD
=======
	public static void Serializable() throws IOException
	{
		File file=new File("D:/gunny.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(empArray);
	}
	public static void deserialization() throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:/gunny.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		EmployeeDetails[] emparray1=(EmployeeDetails[])obj;
		//System.out.println("Enter employee ID to search");
		//int empid=a.nextInt();
		if(emparray1!=null)
		{
		for(int i=0;i<emparray1.length;i++)
		{
			/*if(emparray1[i]==null)
			{
				
			}
			
			
			else if(emparray1[i].getemployeeID()==empid)
			{
				System.out.println("Employee ID: "+emparray1[i].getemployeeID()+"\n"+"Employee Name: "+emparray1[i].getemployeeName()+"\n"+"Package"+emparray1[i].getemployeePackage()+"\n"+"Salary: "+emparray1[i].getemployeeSalary()+"\n"+"PF"+emparray1[i].getemployeePF());
				break;
			}
		
			System.out.println("enter valid employee ID");
			
		}*/
			EmployeeDetails emp=emparray1[i];
			if(emparray1[i]==null)
			{
				
			}
			else
			{
				System.out.println("Employee ID: "+emparray1[i].getemployeeID()+"\n"+"Employee Name: "+emparray1[i].getemployeeName()+"\n"+"Package"+emparray1[i].getemployeePackage()+"\n"+"Salary: "+emparray1[i].getemployeeSalary()+"\n"+"PF"+emparray1[i].getemployeePF());
			}
			}
		
		}
		else
		{
			System.out.println("No data available in database");
		}
		
	}
}
		
	
>>>>>>> 7116f6cb8fc00c2f18c0b6c2a62c3a814bf19c94

}
