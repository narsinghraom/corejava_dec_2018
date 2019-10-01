package com.vtalent.vinodreddy;

import java.util.*;


public class EmployeeBean {
	private	int employeeId;
	private	double employeeSalary;
	private long employeeMobileNo;
	private String employeeName;
	static EmployeeBean [] emparray;
	static Scanner s = new Scanner(System.in);
	
 	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
 	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary=employeeSalary;
	}
	public void setEmployeeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo=employeeMobileNo;
	}
	public int getEmployeeId() {
		return this.employeeId;
		
	}
	public String getEmployeeName() {
		return this.employeeName;
		
	}
	
	public double getEmployeeSalary() {
		return this.employeeSalary;
		
	}
	public long getEmployeeMobileNo() {
		return this.employeeMobileNo;
		
	}

	public void insert() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.of Employees to be stored");
		int size=s.nextInt();
		emparray=new EmployeeBean[size];


		for(int i = 0;i<size;i++) {
			EmployeeBean em =new EmployeeBean();
			System.out.println("enter the EmployeeName");
			s.nextLine();
			String name =s.nextLine();
			em.setEmployeeName(name);
			System.out.println("enter the EmployeeId");
			int id =s.nextInt();
			em.setEmployeeId(id);
			System.out.println("enter the EmployeeSalary");
			double sl =s.nextDouble();
			em.setEmployeeSalary(sl);
			System.out.println("enter the EmployeeMobileNumber");
			long mno =s.nextLong();
			em.setEmployeeMobileNo(mno);
			emparray[i]=em;
			
			
		}
		for(int i =0;i<size;i++) {
			
			  EmployeeBean em1 =emparray[i];
			  System.out.println("id="+em1.getEmployeeId()+"  "+"Salary="+em1.getEmployeeSalary()+"  "+"MobileNumber="+em1.getEmployeeMobileNo());
		}
	}

	public void delete() {
		// TODO Auto-generated method stub
		EmployeeBean em2;
		for(int i =0;i<emparray.length;i++) {
			em2 = emparray[i];
			System.out.println(em2.getEmployeeId());
		}
		System.out.println("enter the id to be deleted");
		int n =s.nextInt();	
		for(int i=0;i<=emparray.length-1;i++) {
			 em2=emparray[i];
			 	if(n==em2.getEmployeeId()) {
			 		emparray[i]=null;
			 		System.out.println("Deleted");
			 	}
		}
	    

		
	}

	
	

	

	public void search() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		EmployeeBean em3;
		System.out.println("enter the id to be search");
		     int n =s.nextInt();
		    
				for(int i=0;i<emparray.length;i++) {
			    em3 =emparray[i];
				if(em3.employeeId==n) {
					System.out.println("id="+em3.getEmployeeId()+" "+"Salary="+em3.getEmployeeSalary()+"  "+"MobileNumber="+em3.getEmployeeMobileNo());
					System.out.println("the employee details successfully found");
					return;
				}
				else {
					System.out.println("the given Id is not matched");
				}
			}
				

	}

	public void pritntAllData() {
		// TODO Auto-generated method stub
		EmployeeBean em;
		System.out.println("The All the Employee details are");
		for(int i=0;i<emparray.length;i++) {
		 em=emparray[i];
		
		System.out.println("id="+em.getEmployeeId()+" "+"Name="+em.getEmployeeName()+" "+"Salary="+em.getEmployeeSalary()+"  "+"MobileNumber="+em.getEmployeeMobileNo());
		
	}
	}

	public void searchwithemployeeName() {
		// TODO Auto-generated method stub
		EmployeeBean em;
		boolean flag = false;
		int message=0;
		System.out.println("enter particular Name to be search");
		char e=s.next().charAt(0);
		for(int i=0;i<emparray.length;i++) {
		em =emparray[i];
		if(emparray[i]!=null) {
			String q=emparray[i].employeeName;
			char[] w=q.toCharArray();
			if(w[0]==e) {
				flag = true;
				if(message==0) {
			System.out.println("employeeName="+em.getEmployeeName()+""+"id="+em.getEmployeeId()+""+"salary="+em.getEmployeeSalary()+""+"mobileno="+em.getEmployeeMobileNo());
			message++;
		}
				}	
		}
		}
		if(!flag) {
		System.out.println("the employee name with letter " + e + " not found");
		}
	}

		
	

	public void updatedetails() {
		// TODO Auto-generated method stub
		EmployeeBean em;
		System.out.println("Enter the Id to be Updated");
		int n = s.nextInt();
		for (int i = 0; i <emparray.length; i++) {
		em =emparray[i];
		if(emparray[i]!=null && emparray[i].employeeId==n) {
           System.out.println("enter Employees new Id yes or no");
           String w=s.next();
           if(w.equals("yes")) {
        	   System.out.println("enter new employee id:");
        	   int e=s.nextInt();
        	   emparray[i].employeeId=e;
        	   System.out.println("employeeName="+em.getEmployeeName()+""+"id="+em.getEmployeeId()+""+"salary="+em.getEmployeeSalary()+""+"mobileno="+em.getEmployeeMobileNo());
           }else {
        	   System.out.println("  ");
           }
            System.out.println("Enter Employees new Name yes or no.");
		    String name=s.next();
		       if(name.equals("yes")) {
		    	  System.out.println("enter The new employee Name");
		    	    employeeName=s.next();
		    	   emparray[i].employeeName=employeeName;
		    	   System.out.println("employeeName="+em.getEmployeeName()+""+"id="+em.getEmployeeId()+""+"salary="+em.getEmployeeSalary()+""+"mobileno="+em.getEmployeeMobileNo());
		       }else {
		    	   System.out.println("  ");
		       }
		       System.out.println("Enter Employee new  Salary yes or no.");
		       String w1=s.next();
		       if(w1.equals("yes")) {
		    	   System.out.println("enter salary:");
		    	   double r=s.nextDouble();
		    	   emparray[i].employeeSalary= r;
		    	   System.out.println("employeeName="+em.getEmployeeName()+""+"id="+em.getEmployeeId()+""+"salary="+em.getEmployeeSalary()+""+"mobileno="+em.getEmployeeMobileNo());
		       }else {
		    	   System.out.println("  ");
		       }
		}
		System.out.println("enter Employees new Mobileno yes or no. ");
		String e=s.next();
		if(e.equals("yes")) {
			System.out.println("enter mobile no:");
			long b=s.nextLong();
			emparray[i].employeeMobileNo=b;
			System.out.println("employeeName="+em.getEmployeeName()+""+"id="+em.getEmployeeId()+""+"salary="+em.getEmployeeSalary()+""+"mobileno="+em.getEmployeeMobileNo());
		}else {
			System.out.println("  ");
		}
		}
}
	}

	
	
	
	

