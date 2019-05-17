package com.vtalent.naresh;
import java.util.Scanner;



public class EmployeeTest {
	

	static Scanner sc=new Scanner(System.in);
		public void insertData() {
		System.out.println("Enter the no.of Employees to be stored");
			int size=sc.nextInt();
			
				EmployeeOperations.emparray=new Employee[size];
								for(int i=0;i<=size-1;i++) {
									
					System.out.println("Enter " + (i+1) +" EmployeeData " );
					Employee emp=new Employee();
							System.out.println("Enter Id:");
								emp.setEmployId(sc.nextInt());
								
								System.out.println("Enter Salary:");
									emp.setEmploySalary(sc.nextDouble());
									
									EmployeeOperations.insertData(emp);		
				}	
		}
							
									
				

			public static void main(String[] args) {
				EmployeeTest et=new EmployeeTest();
				EmployeeOperations eo=new EmployeeOperations();
				Scanner sc=new Scanner(System.in);
				
				for(;;) {
					System.out.println("1.Insert an Employee."+'\n'+"2.Update an Employee."+'\n'+"3.Delete an Employee"+'\n'+"4.Search an Employee"+'\n'+"5.Print All the Employee Data"+'\n'+"6.Exit");
				int a=sc.nextInt();
				
					if(a==1) {
						et.insertData();
					}
					else if(a==2) {
						eo.updateData();	
					}
					
					else if(a==3) {
						eo.deleteEmploy();
						//System.out.println("still under process..."+'\n');
					}
					else if(a==4) {
						eo.searchData();
					}
					
					else if(a==5) {
						eo.printAllData();
					}
					
					else if(a==6) {
						break;
					}
					
					else {
						System.out.println("Enter Valid Search"+'\n');
					}
					
				}
				}
			}