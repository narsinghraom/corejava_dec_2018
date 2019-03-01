package com.vtalent.sujith;

public class EmpArray {

	static Emp[] array=new Emp[4];

	public static void insertData(Emp emp) {
//		for(int i=0;i<=3;i++) {
//			emp=new Emp();
//			emp.setId(i+100);
//			emp.setSalary(25000*(i+1));
//			emp.setMobile(996699669+i);
//			array[i]=emp;
//		}


		if (array!=null && array.length>=0) {
//		Emp emp=null;
			for(int i=0;i<=3;i++) {
				if(array[i]==null) {
					array[i]=emp;
					break;
				}
			}
		}
	}
	public static void display() {
		boolean flag=false;
		if(array!=null && array.length>=0)
		for(int i=0;i<=3;i++) {
		Emp	emp=array[i];
		if(emp != null) {
		System.out.println("employee id is            :-"+emp.getId());
		System.out.println("employee mobile number is :-"+emp.getMobile());
		System.out.println("employee salary is        :-"+emp.getSalary());
		flag=true;
		}
		}
		if(!flag) {
			System.out.println("employee data not foud");
		}
	}
	
	public static void update(int id) {
		boolean flag=false;

		if(array!=null && array.length>=0) {
			for(int i=0;i<=3;i++) {
				Emp emp=array[i];
				if(emp != null) {
				if(emp.getId()==id) {
				emp.setMobile(7894561230l);
				emp.setSalary(30000);
				array[i]=emp;
				System.out.println("employee data updated");
				flag=true;
				}
				}
				if(!flag) {
					System.out.println("employee data updated");
			}
			}
		}
	}
	
	public static void singleEmployee(int id) {
		boolean flag=false;

		if(array!=null && array.length>=0) {
			for(int i=0;i<=3;i++) {
				Emp emp=array[i];
				if(emp != null) {
				if(emp.getId()==id) {
					System.out.println("employee id                "+emp.getId());
					System.out.println("employee mobile number     "+emp.getMobile());
					System.out.println("employee salary            "+emp.getSalary());
					System.out.println("single employee data displayed");
					flag=true;
				}
				}
			}
				if(!flag) {
					System.out.println("employee data not found");
			
			}
		}
	}
	public static void delete(int id) {
		boolean flag=false;
		if(array!=null && array.length>=0) {
			for(int i=0;i<=3;i++) {
				Emp emp=array[i];
				if(emp !=null) {
				if(emp.getId()==id) {
					emp=null;
					array[i]=emp;
					System.out.println("employee data deleted");
					flag=true;
				}
				}
			}
				if(!flag) {
					System.out.println("employee data not found");
				
			}
		}
	}
	
}
