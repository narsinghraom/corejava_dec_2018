package com.vtalent.venkatesh;

     
     import java.util.Scanner;

     public class EmployeeOperations {
	  static Employee[] emparray;
		Scanner sc=new Scanner(System.in);	
		
		
	public static void insertData(Employee emp) {
			if(emparray!=null) {
				for(int i=0;i<=emparray.length-1;i++) {
					if(emparray[i]==null) {
				emparray[i]=emp;
				// System.out.println("here");
				break;
					}
				}
				System.out.println("Successfully Inserted."+'\n');
				}
			
				else {
					System.out.println("Already Inserted"+'\n');
				}
			}
			
			
		

			public void printAllData() {
					if(emparray!=null) {
						for(int i=0;i<=emparray.length-1;i++) {
							Employee emp1=emparray[i];
							System.out.println(emp1.getEmployId()+"   "+ emp1.getEmploySalary());
							
															  }
					}
					else {
						System.out.println("Insert the Employee Data first"+'\n');
					}
					}
					
			
			
			public void updateData() {
							if(emparray!=null) {
								Employee emp1;
								for(int i=0;i<=emparray.length-1;i++) {
									emp1=emparray[i];	
									System.out.println(emp1.getEmployId()+"   "+ emp1.getEmploySalary());
								}
								
								System.out.println("Enter the Id to be Updated"+'\n');
								int x=sc.nextInt();
								for(int i=0;i<=emparray.length-1;i++) {
									Employee emp2;
								emp2=emparray[i];
								if(x==emp2.getEmployId()) {
									System.out.println("Enter the new Salary to be Updated"+'\n');
									emp2.setEmploySalary(sc.nextDouble());
								}
								}	
							}
							
							else {
								System.out.println("First Insert Employee Data"+'\n');
							}
			}
						
						public void searchData() {
							if(emparray!=null) {
								System.out.println("Enter the Employ_Id:");
								Employee emp1;
								int x=sc.nextInt();
								for(int i=0;i<=emparray.length-1;i++) {
									emp1=emparray[i];
									if(x==emp1.getEmployId()) {
									System.out.println("Employ_Id- "+emp1.getEmployId()+'\n'+"Employ_Salary- "+emp1.getEmploySalary() );
															  }
									else {
										System.out.println("Enter the Valid Id"+'\n');
									}
									}
						}
							else {
								System.out.println("Insert the Employee Data first"+'\n');
							}
						}
						public void deleteEmploy() {
							if(emparray!=null) { 
								Employee emp1;
								for(int i=0;i<=emparray.length-1;i++) {
									 emp1=emparray[i];
									System.out.println(emp1.getEmployId());
									
																	  }
								System.out.println("Enter the Id to be Deleted");
									int x=sc.nextInt();
									for(int i=0;i<=emparray.length-1;i++) {
										 emp1=emparray[i];
										 	if(x==emp1.getEmployId()) {
										 		emparray[i]=null;
										 		System.out.println("Deleted");
									}
									
									}
						
						
						
												
	}
							else {
								System.out.println("No Data Found"+'\n');
							}
							
							}

     			}
