package com.vtalent.sri;
import java.util.Scanner;

public class Test_1 {
	static Employee[] empArray;
	static Scanner input = new Scanner(System.in);
	static Employee emp;

	public static int insertEmployeeArray(Employee emp) {
		int index=0;
		boolean flag=true;
		if(empArray!=null){
			for(int i=0;i<=empArray.length-1;i++){
				if(empArray[i]==null){
					index=i;
				
					flag = false;
					break;
				}				
			}
			
		}
		if(!flag){
			empArray[index]=emp;
			return index+1;
		}
		else
		System.out.println("Array Full");
		return 0;
	}
	
	public static void deleteEmployeeArray(){
		boolean flag=false;
		System.out.println("Enter Id to delete");
		int tempId=input.nextInt();
		for(int i=0;i<empArray.length-1;i++){
			Employee emp=empArray[i];
			if(emp.getEmpId()==tempId){
				empArray[i]=null;
				flag=true;
			}
		}
		if(flag){
			System.out.println("Successfully delete");
		}else{
			System.out.println("Invalid Id");
		}
	}
	public static void viewEmployeeArray(){
		if(empArray!=null){
			for(int i=0;i<=empArray.length-1;i++){
				Employee emp=empArray[i];
				if(emp!=null){
					System.out.println(emp.getEmpId()+"   "+emp.getEmpSalary());
				}
			}
		}
	}
	public static void updateEmployeeArray(){
		boolean flag=false;
		System.out.println(" enter employee id you want to update");
		int tempId=input.nextInt();
		System.out.println("enter salary you want to update");
		double empSalary=input.nextDouble();
		if(empArray!=null){
			for(int i=0;i<=empArray.length-1;i++){
				Employee emp=empArray[i];
				if(emp.getEmpId()==tempId){
					emp.setEmpSalary(empSalary);
					empArray[i]=emp;
					flag=true;
				}
			}
			if(flag){
				System.out.println("updated Successfully");
			}else{
				System.out.println("Invalid Id");
			}
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean done = false;
		

		System.out.println("Enter number how many array you want to create4 ");
		int n = input.nextInt();
		empArray = new Employee[n];
		while (done == false) {
			System.out.println("Select below options as for your requirement");
			System.out.println("1.Insert Employee Data");
			System.out.println("2.Delete employee data");
			System.out.println("3.View employees Data");
			System.out.println("4.Update Employee Data");
			System.out.println("5.Exit ");
			System.out.println("6.Invalid Option ");

			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("you choosen insert employee data");
				emp = new Employee();
				System.out.println("Enter Employee Id");
				emp.setEmpId(input.nextInt());
				System.out.println("Enter Employee Salary");
				emp.setEmpSalary(input.nextDouble());
				insertEmployeeArray(emp);
				break;

			case 2:
				System.out.println("you choosen delete employee");
				deleteEmployeeArray();
				break;

			case 3:
				System.out.println("you choosen view employees data");
				viewEmployeeArray();
			
				break;
			case 4:System.out.println("you have choosen update employee data");
			updateEmployeeArray();
			break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("invalid number,please choose correct option");
			}

		}

	}

}
