package com.vtalent.hanu;

import java.util.Scanner;

public class EmployeeArray {
	
	static Employe[] empArray= new Employe[5];
	
	public void insertData() {
		Employe emp=null;
		for (int i = 0; i < empArray.length; i++) {
			emp=new Employe();
			emp.setId(100+i);
			emp.setMobile(9490859);
			emp.setSal(2500*i);
			empArray[i]=emp;
		}
		System.out.println("Inserted..");
		//System.out.println(empArray.length);
	}
	
	public void viewdata() {
		//insertData();
		//Employe e=null;
		System.out.println(empArray.length);
		if (empArray!=null && empArray.length>0) {
		for (Employe e : empArray) {	
			System.out.println(e.getId());
			System.out.println(e.getMobile());
			System.out.println(e.getSal());
			System.out.println("---------");
		}
		}
	}
	
	public void exit() {
		System.out.println("exiting...");
		System.exit(0);
		System.out.println("22");
	}
	
	public void updateData() {
		Employe emp=null;
		/*for (int i = 0; i < empArray.length; i++) {
			emp=new Employe();
			emp.setId(100+i);
			emp.setMobile(9490859);
			emp.setSal(2500*i);
			empArray[i]=emp;
		}
		for (Employe e : empArray) {			
			System.out.println(e.getId()+"-"+e.getMobile()+"-"+e.getSal());
			System.out.println("---------");
		}*/
		for (Employe e : empArray) {
			if (e.getSal()<50000) {
				System.out.println(e.getId()+"'s data updating...");
				e.setSal(e.getSal()+5000);
			}
		}
		for (Employe e : empArray) {
			System.out.println(e.getId()+"-"+e.getMobile()+"-"+e.getSal());
			System.out.println("---------");
		}
		System.out.println("Updated....");
	}
	
	public void deleteData( int n) {
		//insertData();
		int loc=0;
		Employe e=null;
		for (int i = 0; i < empArray.length; i++) {
			e=empArray[i];
			if (e.getId()==n) {
				loc=i;
			}
		}
		System.out.println(loc);
		/*for (int i = 0; i < empArray.length; i++) {
			if (loc==i) {
				for (int j =i+1;i< empArray.length; j++) {
					empArray[i-1]=empArray[j];
					j++;
				}
			}
		}
		viewdata();*/
		
	}
	
	public static void main(String[] args) {
		EmployeeArray aa= new EmployeeArray();
		Scanner s= new Scanner(System.in);
		while (true) {
			System.out.println("choose");
			System.out.println("0 -insert");
			System.out.println("1 -view");
			System.out.println("2 -exit");
			System.out.println("3 -update");
		
		System.out.println("Enter Your Choice....");
		int i=s.nextInt();
		switch (i) {
		case 0:aa.insertData();
			
			break;
			case 1:aa.viewdata();
			break;
			case 2:aa.exit();
			break;
			case 3:aa.updateData();
			break;
			case 4:System.out.println("Enter Employee Id..");
			  		int num=s.nextInt();
				aa.deleteData(num);
			break;

		default:
			break;
		}
	}
	}
	
	
}
