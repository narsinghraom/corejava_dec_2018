package com.vtalent.praveena;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class EmployeeOperationWithList {
	//public static void main(String[]args){
		
	
	static List<EmployeeDetails> empArray = new ArrayList<>();
	static Scanner a = new Scanner(System.in);

	public static void insertData(EmployeeDetails emp) {

		empArray.add(emp);
		
	}
	public static void printAllEmployeeData() throws Exception
	{
		
		for(EmployeeDetails emp:empArray)
		{
			System.out.println("Employee ID: "+emp.getemployeeID()+"\n"+"Employee Name: "+emp.getemployeeName()+"\n"+"Employee Package"+emp.getemployeePackage()+"\n"+"Employee Salary: "+emp.getempActualSal1()+"\n"+"Employee PF: "+emp.getemployeePF1());

			if(emp.getLoanAmount()==0.0)
			{
				System.out.println("Employee Loan: "+"N/A"+"\n"+"Employee Tenure: "+"N/A"+"\n"+"Employee Emi: "+"N/A"+"\n"+"Employee Loan taken Date: "+"N/A"+"\n"+"Employee Loan End Date: "+"N/A"+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());

			}
			else
			{
				System.out.println("Employee Loan: "+emp.getLoanAmount1()+"\n"+"Employee Tenure: "+emp.getTenure()+"\n"+"Employee Emi: "+emp.getEMI1()+"\n"+"Employee Loan taken Date: "+emp.getStartTime()+"\n"+"Employee Loan End Date: "+emp.getEndTime()+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());
		}

		}
		
		}
/*Iterator itr=empArray.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
}*/
	
	public static void updateData(int empID) {
		
for(EmployeeDetails emp:empArray)
{
	if(emp.getemployeeID()==empID)
	{
		System.out.println("Enter new employee details");
		System.out.println("enter Package");
		emp.setemployeePackage(a.nextDouble());
		// Employee empUD=new Employee();empUD.setemployeeSalary(a.nextDouble());
		// empArray[i]=empUD;
		System.out.println("Data got updated and updated employee details are");
		System.out.println("Employee ID: " + emp.getemployeeID() + "\n" + "Employee Name: "
				+ emp.getemployeeName() + "\n" + "Package" + emp.getemployeePackage() + "\n"
				+ "Salary: " + emp.getemployeeSalary() + "\n" + "PF" + emp.getemployeePF());
		System.out.println("Employee ID: "+emp.getemployeeID()+"\n"+"Employee Name: "+emp.getemployeeName()+"\n"+"Employee Package"+emp.getemployeePackage()+"\n"+"Employee Salary: "+emp.getempActualSal1()+"\n"+"Employee PF: "+emp.getemployeePF1());
		if(emp.getLoanAmount()==0.0)
		{
			System.out.println("Employee Loan: "+"N/A"+"\n"+"Employee Tenure: "+"N/A"+"\n"+"Employee Emi: "+"N/A"+"\n"+"Employee Loan taken Date: "+"N/A"+"\n"+"Employee Loan End Date: "+"N/A"+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());

		}
		else
		{
			System.out.println("Employee Loan: "+emp.getLoanAmount1()+"\n"+"Employee Tenure: "+emp.getTenure()+"\n"+"Employee Emi: "+emp.getEMI1()+"\n"+"Employee Loan taken Date: "+emp.getStartTime()+"\n"+"Employee Loan End Date: "+emp.getEndTime()+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());
	}
	}
		break;
	}

	System.out.println("Enter valid employee ID");

	}


	public static void deleteData(int empID)
	{
		for(EmployeeDetails emp:empArray)
		{
			if(emp.getemployeeID()==empID)
			{	
				empArray.remove(emp);
			}
	break;
		}
		System.out.println("Enter valid employee ID");

	}
	
	
	public static void SearchEmployee(int empID)
	{
		for(EmployeeDetails emp:empArray)
		{
			if(emp.getemployeeID()==empID)
			{
				System.out.println("Employee ID: " + emp.getemployeeID() + "\n" + "Employee Name: "
						+ emp.getemployeeName() + "\n" + "Package" + emp.getemployeePackage() + "\n"
						+ "Salary: " + emp.getemployeeSalary() + "\n" + "PF" + emp.getemployeePF());
				System.out.println("Employee ID: "+emp.getemployeeID()+"\n"+"Employee Name: "+emp.getemployeeName()+"\n"+"Employee Package"+emp.getemployeePackage()+"\n"+"Employee Salary: "+emp.getempActualSal1()+"\n"+"Employee PF: "+emp.getemployeePF1());
				if(emp.getLoanAmount()==0.0)
				{
					System.out.println("Employee Loan: "+"N/A"+"\n"+"Employee Tenure: "+"N/A"+"\n"+"Employee Emi: "+"N/A"+"\n"+"Employee Loan taken Date: "+"N/A"+"\n"+"Employee Loan End Date: "+"N/A"+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());

				}
				else
				{
					System.out.println("Employee Loan: "+emp.getLoanAmount1()+"\n"+"Employee Tenure: "+emp.getTenure()+"\n"+"Employee Emi: "+emp.getEMI1()+"\n"+"Employee Loan taken Date: "+emp.getStartTime()+"\n"+"Employee Loan End Date: "+emp.getEndTime()+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());
			}
			}
			break;
}
		System.out.println("Enter valid employee ID");

	}
		public static void getLoan(int empID)
		{
			for(EmployeeDetails emp:empArray)
			{
				if(emp.getemployeeID()==empID)
				{
					Loan ln=new Loan();
					ln.LoanApproval(emp,emp.getemployeeSalary());
			
			}
			
				break;
			}
			System.out.println("Enter valid employee ID");

	}
		public static void Serializable() throws IOException
		{
			File file=new File("D:/gunny.txt");
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(empArray);
			oos.close();
		}
		public static void deserialization() throws Exception
		{
			FileInputStream fis=new FileInputStream("D:/gunny.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			ArrayList<EmployeeDetails> empArray=(ArrayList<EmployeeDetails>)obj;
			if(empArray!=null)
			{
				for(EmployeeDetails emp:empArray)
				{
					System.out.println("Employee ID: "+emp.getemployeeID()+"\n"+"Employee Name: "+emp.getemployeeName()+"\n"+"Employee Package"+emp.getemployeePackage()+"\n"+"Employee Salary: "+emp.getempActualSal1()+"\n"+"Employee PF: "+emp.getemployeePF1());

					if(emp.getLoanAmount()==0.0)
					{
						System.out.println("Employee Loan: "+"N/A"+"\n"+"Employee Tenure: "+"N/A"+"\n"+"Employee Emi: "+"N/A"+"\n"+"Employee Loan taken Date: "+"N/A"+"\n"+"Employee Loan End Date: "+"N/A"+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());

					}
					else
					{
						System.out.println("Employee Loan: "+emp.getLoanAmount1()+"\n"+"Employee Tenure: "+emp.getTenure()+"\n"+"Employee Emi: "+emp.getEMI1()+"\n"+"Employee Loan taken Date: "+emp.getStartTime()+"\n"+"Employee Loan End Date: "+emp.getEndTime()+"\n"+"Employee Take Home salary: "+emp.getTakeHome1());
				}

				}
			
			ois.close();
			}
			else
			{
				System.out.println("No data available in database");
			
			}
			}
}