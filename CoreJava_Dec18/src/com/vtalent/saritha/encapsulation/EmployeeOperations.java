package com.vtalent.saritha.encapsulation;
import java.util.Scanner;

public class EmployeeOperations {
	static Employee[] empArray;
	Scanner sc=new Scanner(System.in);
	public static void insertData(Employee emp){
		if(empArray!=null){
			for (int i=0;i<=empArray.length-1;i++){
				if(empArray[i]==null){
					empArray[i]=emp;
					break;
				}
			}
			System.out.println("successfully inserted");
		}
		else{
			System.out.println("already inserted"+'\n');
		}
	}
	
	public static void updateData(){
		if (empArray !=null){
			Employee emp1;
			for(int i=0;i<=empArray.length-1;i++){
				emp1=empArray[i];
				System.out.println(emp1.getEmpId()+""+emp1.getEmpSalary());
			}
			System.out.println("enter the id to be updated"+'\n');
			int x=sc.nextInt();
			Employee emp2;
			emp2=empArray[i];
			for(int i=0;i<=empArray.length-1;i++){
				if(x==emp2.getEmpId()){
					System.out.println("enter the salary to be updated"+'\n');
					emp2.setEmpSalary(sc.nextDouble());
				}
			}
		}
		else{
			System.out.println("first insert employee data");
		}
		
				}
			public static void searchData(){
				if(empArray !=null){
					System.out.println("enter the empId:");
					Employee emp1;
					int x=sc.nextInt();
					for(int i=0;i<=empArray.length-1;i++){
						emp1=empArray[i];
						if (x==emp1.getEmpId()){
							System.out.print("emp_Id "+emp1.getEmpId()+'\n'+ +"emp_Salary"+emp1.getEmpSalary());
							else
								System.out.println("ENTER THE VALID ID");
				
							}
						}
						else
							System.out.println("insert the employee data first"+'\n');
						
					}
					public static void deleteEmployee(){
						if (empArray !=null){
							Employee emp1;
							for(int i=0;i<=empArray.length-1;i++){
								emp1=empArray[i];
								System.out.println(emp1.getEmpId());
							System.out.println("enter the id to be deleted");
							int x=sc.nextInt();
							for(int i=0;i<=empArray.length-1;i++);{
								emp1=empArray[i];
								if(x==emp1.getEmpId()){
									empArray[i]=null;
									System.out.println("deleted");
								}
							}
							
								System.out.println("no data found exception");
							}
							}
							
									
								}
					
			
	public static void printAllEmployeeData(){
		if (empArray !=null){
			for(int i=0;i<empArray.length-1;i++){
				Employee emp=empArray[i];
				if(emp!=null){
					System.out.println(emp.getEmpId()+" "+emp.getEmpSalary());
				}
			}
		}
	}
	
		
	

