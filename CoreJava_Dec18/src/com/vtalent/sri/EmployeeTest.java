package com.vtalent.sri;
import java.util.Scanner;

public class EmployeeTest {
	

	public static void main(String[] args) {
		boolean done=false;
		boolean deletecheck=false;

		// TODO Auto-generated method stub
		Scanner scne = new Scanner(System.in);
		System.out.println("Enter number howmany employees do you want store");
		int n = scne.nextInt();
		System.out.println(n);
		Employee[] emp = new Employee[n];
		
		Employee[] newArr=null;
		
		while(done==false){
		System.out.println("Select below options as for your requirement");
		
		System.out.println("1.Insert Employee Data");
		System.out.println("2.Delete employee data");
		System.out.println("3.View employees Data");
		System.out.println("4.Exit ");
		
		int choose=scne.nextInt();
		switch(choose){
		case 1 : System.out.println("you choosen insert employee data");
		for(int i=0;i<emp.length;i++){
			emp[i]=new Employee();
			System.out.println("enter employee id");
			int empId=scne.nextInt();
			emp[i].setEmpId(empId);
			System.out.println("enter employee salary");
			double empSalary=scne.nextDouble();
			emp[i].setEmpSalary(empSalary);
		}
		break;
		
		case 2 : System.out.println("you choosen delete employee");
		System.out.println("Enter employee id to delete");
		int empId=scne.nextInt();
		for(int i=0;i<emp.length;i++){
			if(emp[i].getEmpId()==empId){
				newArr=new Employee[emp.length-1];
				//System.out.println(newArr[emp.length]);
				for(int index =0;index<i;index++){
					newArr[index]=emp[index];
				}
				for(int j=i;j<emp.length-1;j++){
					newArr[j]=emp[j+1];
				}
				if(newArr.length>=0){
					emp=newArr;
				}
				System.out.println("delete employee");
				deletecheck=false;
				break;
				
			}else{
				//System.out.println("Employee id is not found,please enter valid employee id");
				//break;
				deletecheck=true;
			}
		}
		if(deletecheck==true){
			System.out.println("Employee id is not found,please enter valid employee id");
		}
		
		break;
		
		case 3 : System.out.println("you choosen view employees data");
		for(int i=0;i<emp.length;i++){
			System.out.println(emp[i].getEmpId()+" "+emp[i].getEmpSalary());
		}
		
		break;
		case 4 : done=true;
		break;
		
		}
		
		}
		System.out.println("end of the program");
	}
}
			
		
		
	
			
		
		
		