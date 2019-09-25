package com.vtalent.java.mahesh;
import java.util.Scanner;
public class Employ extends Employe{
	Scanner in =new Scanner(System.in);
	public void InsertData(){
		System.out.println("Enter No Of Employees to Be Stored.");
		int size = in.nextInt();

		Employe.earray = new Employe[size];

		for (int i = 0; i <= size - 1; i++) {

			System.out.println("Enter " + (i + 1) + " EmployeeData ");
			Employe emp = new Employe();
			System.out.println("Enter Id:");
			emp.setEmpID(in.nextInt());
			
			System.out.println("Enter Name:");
			emp.setEmpName(in.next());
			
			System.out.println("Enter Mobile Number:");
			emp.setEmpMobileNumber(in.next());
			
			System.out.println("Enter the Salary:");
			emp.setEmpSalary(in.nextDouble());
			Employe.InsertData(emp);
		}
	}
public static void main(String args[]) {
	Employe e = new Employe();
	Employ e1 = new Employ();
Scanner in=new Scanner(System.in);
	for (;;){
		System.out.println("1.Insert an Employee." + '\n' + "2.Delete an Employee"
				+ '\n' + "3.Search an Employee" + '\n' + "4.Print the Employee Data" + '\n' + "5.Exit");
		int Employe = in.nextInt();

		switch (Employe) {
		
		case 1: e1.InsertData();
		break;
		
		case 2: e.DeleteData();
		break;
		
		case 3: e.searchData();
		break;
		
	 	case 4: e.PrintData();
		break;
		
		case 5: e.Exit();
		System.exit(0); 
		}	
	}
}
}
	