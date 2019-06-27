package com.vtalent.sanjana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class EmpList {
	static List<Employee> arl=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
public static void insertData(Employee emp)
{
	arl.add(emp);
	
}
public static void printAllEmployeeData()
{
	/*Iterator<Employee> itr=arl.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}*/
for(Employee emp:arl)
{
	System.out.println("Employee ID: "+emp.getEmployeeId()+" "+" Name: "+emp.getEmployeeName()+" "+"Package: "+emp.getEmployeePackage1()+" "+ "Salary: "+emp.getEmployeeSalary1()+"pf--"+emp.getEmployeepf1());
	if(emp.getLoanAmount()==0.0)
	{
		System.out.println("Employee Loan: "+"N/A"+" "+" Tenure: "+"N/A"+" "+"Emi: "+"N/A"+" "+" Loan start Date: "+"N/A"+" "+" Loan End Date: "+"N/A"+" "+"Take Home salary: "+emp.getTakeHome1());

		//System.out.println("Employee Loan: "+empArray[i].getLoanAmount1()+"\n"+"Employee Tenure: "+empArray[i].getTenure1()+"\n"+"Employee Emi: "+empArray[i].getEMI1()+"\n"+"Employee Take Home salary: "+empArray[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+empArray[i].getStartDate1()+"\n"+"Employee Loan End Date: "+empArray[i].getEndDate1());
	}
	else
	{
		System.out.println("Employee Loan: "+emp.getLoanAmount1()+" "+" Tenure: "+emp.getTenure()+" "+" Emi: "+emp.getEMI1()+" "+" Loan Start Date: "+emp.getStartTime()+" "+"Loan End Date: "+emp.getEndTime()+"\n"+"Take Home salary: "+emp.getTakeHome1());
	}
}
}
public static void deleteEmployee( int id)
{
 	int index=0;
	for(Employee emp:arl)
	{
if(id==emp.getEmployeeId())
{
	arl.remove(index);
	System.out.println("Deleted");
	break;
}
index++;
}
	
}
public static void update(int id1)
{
	for(Employee emp:arl)
	{
		if(id1==emp.getEmployeeId())
		{
			System.out.println("Enter Package to be updated");
			double d=sc.nextDouble();
			emp.setEmployeePackage(d);
	//	int k=arl.indexOf(emp);
	//	arl.set(k, emp.getEmployeePackage());
		}
	}
}
public static void searchEmployee(int id2)
{
	for(Employee emp:arl)
	{
		if(emp.getEmployeeId()==id2)
		{
			System.out.println("Employee ID: "+emp.getEmployeeId()+" "+" Name: "+emp.getEmployeeName()+" "+"Package: "+emp.getEmployeePackage1()+" "+ "Salary: "+emp.getEmployeeSalary1()+"pf--"+emp.getEmployeepf1());
			if(emp.getLoanAmount()==0.0)
			{
				System.out.println("Employee Loan: "+"N/A"+" "+" Tenure: "+"N/A"+" "+"Emi: "+"N/A"+" "+" Loan start Date: "+"N/A"+" "+" Loan End Date: "+"N/A"+" "+"Take Home salary: "+emp.getTakeHome1());

				//System.out.println("Employee Loan: "+empArray[i].getLoanAmount1()+"\n"+"Employee Tenure: "+empArray[i].getTenure1()+"\n"+"Employee Emi: "+empArray[i].getEMI1()+"\n"+"Employee Take Home salary: "+empArray[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+empArray[i].getStartDate1()+"\n"+"Employee Loan End Date: "+empArray[i].getEndDate1());
			}
			else
			{
				System.out.println("Employee Loan: "+emp.getLoanAmount1()+" "+" Tenure: "+emp.getTenure()+" "+" Emi: "+emp.getEMI1()+" "+" Loan Start Date: "+emp.getStartTime()+" "+"Loan End Date: "+emp.getEndTime()+"\n"+"Take Home salary: "+emp.getTakeHome1());
			}
		}
}
}}
