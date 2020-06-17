package com.vtalent.corejava.alekya;

import java.util.Scanner;

public class EmployeeRecord {
	Scanner sc=new Scanner(System.in);
	
	BeanEmp[] array;
	public  void insert()
	{
		System.out.println("Enter number of employees to insert");
		int sz=sc.nextInt(); 
		array=new BeanEmp[sz];
		if (array != null) {
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.println("enter details of "+(i+1));
			BeanEmp bean1=new BeanEmp();	
			System.out.println("Enter Id");
			bean1.setId(sc.nextInt());
			System.out.println("Enter a Name: ");  
		    bean1.setName(sc.next ());
			System.out.println("Enter Mobile");
		    bean1.setMobile(sc.nextLong());
			System.out.println("Enter a City: ");  
		    bean1.setCity(sc.next());
		    array[i]=bean1;
		    
		    System.out.println("Successfully Inserted");
		 }
		}else {
			System.out.println("already inserted");
		}
	}
	
	
		public void delete(){
		if (array != null) {
			BeanEmp bean1;
			for (int i = 0; i <= array.length - 1; i++) {
				bean1 = array[i];
			System.out.println(bean1.getId());
			}
			System.out.println("Enter the Id to be Deleted");
			int Id=sc.nextInt();
			
				for(int i=0;i<=array.length-1;i++) {
				bean1=array[i];
				
			  	if(Id==bean1.getId())
			  		
					
				{
					array[i]=null;
					System.out.println("Deleted Successfully");
				}
				}}else
				{
					System.out.println("No Data found please try again");
				}
			}
	    
			
		
		public void update()
		{
			if (array != null) {
				BeanEmp bean1;
				for (int i = 0; i <= array.length - 1; i++) {
					bean1 = array[i];
					System.out.println(bean1.getId() );
				}
			
			System.out.println("Enter the Id to update");
			int Id=sc.nextInt();
			for(int i=0;i<=array.length-1;i++) {
			BeanEmp bean;
			bean=array[i];
			if(Id==bean.getId()) {
				
				System.out.println("Enter  new EmpMobile");
				bean.setMobile(sc.nextLong());
				System.out.println("Enter the City ");
				bean.setCity(sc.next());
				System.out.println("Name:"+bean.getName()+" "+"Id- "+bean.getId()+" "+"Mobile"+bean.getMobile()+" "+"City:"+bean.getCity() );
				System.out.println("Updated Sucessfully");
			
			}}
			}
			
			else
			{
				System.out.println("not valid,enter valid data");
			}
		}

			public void search(){
				if (array != null){	
			System.out.println("Enter the Employ Id:");
			BeanEmp bean1;
			int x=sc.nextInt();
			for(int i=0;i<=array.length-1;i++) {
				bean1=array[i];
				if(x==bean1.getId()) 
				{
				System.out.println("Name:"+bean1.getName()+" "+"Id- "+bean1.getId()+" "+"Mobile"+bean1.getMobile()+" "+"City:"+bean1.getCity() );
				}else  {
					System.out.println("Here is the data ");
				}
				}}else{
					System.out.println("Insert the Employee Data first");
					
				}
				}
			
	

	public void searchAll() {
		if (array != null){	
			
					for(int i=0;i<=array.length-1;i++) {
					BeanEmp bean2=array[i];
					System.out.println(bean2.getId()+"   "+ bean2.getName()+" "+bean2.getMobile()+" "+bean2.getCity());
					}}else{
					System.out.println("Insert the Employee Data first" + '\n');
				}
	}
	public void exit()
	{
		System.out.println("Exit");
	}

}
