package com.vtalent.saritha.encapsulation;
import java.util.Scanner;

public class Test {
		 static Scanner sc=new Scanner(System.in);
		public static void main(String []args){
			//case1:
			System.out.println("enter no of employee to insert");
		int size=sc.nextInt();
		EmployeeOperations.empArray=new Employee[size];
		System.out.println("enter Id");
		int tempId=sc.nextInt();
		System.out.println("enter salary");
		
			//System.out.println("Enter"+i+1+"EmployeeData");
			//Employee emp=new Employee();
			double tempSalary=sc.nextDouble();
			//emp.SetEmpId(sc.nextInt());
						Employee emp=new Employee();					//emp.SetEmpId(tempId);
						emp.SetEmpSalary(tempSalary);

			//emp.SetEmpSalary(nextDouble);
			EmployeeOperations.insertData(emp);
		
		
		
		//public static void main(String []args){
			Test t=new Test();
			EmployeeOperations eo=new EmployeeOperations();
			Scanner sc=new Scanner(System.in);
			for(;;){
				System.out.println("1.insert an employee"+'\n'+ "2.update an empnloyee"+'\n'+"3.delete an employee"+'\n'+"4.search an employee"+'\n'+"5.printAll the employee data"+'\n'+"6.exit");
	int a=sc.nextInt();
	if(a==1){
		//t.insertData();
	}
	else if(a==2){
		eo.updateData();
	}
	else if(a==3){
		eo.deleteEmployee();
		//System.out.println("still under process"+'\n');
		}
		else if (a==4){
			eo.searchData();
		}
		else if(a==5){
			eo.printAllEmployeeData();
		}
		else if (a==6)
			break;
		
			System.out.println("enter valid search");
		
		}
		}
}
			
			
		
		
	
	
	
	
	


