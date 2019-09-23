package com.vtalent.varshini;

import java.util.*;

class EmployeeBean {

	private int empid;
	private double empsal;
	private long empmobileno;
	public static EmployeeBean[] empbean;
	static Scanner sc = new Scanner(System.in);
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public long getEmpmobileno() {
		return empmobileno;
	}
	public void setEmpmobileno(long empmobileno) {
		this.empmobileno = empmobileno;
	}
         //****insert data*****////
	            public void insertdata() {
	        	Scanner input=new Scanner(System.in);
	        	int n=input.nextInt();
	        	empbean=new EmployeeBean[n];
		    for(int i=0;i<=empbean.length-1;i++)
		    {
		    	System.out.println("enter the number of employees information");
				System.out.println("****enter employee details*****");
		    	EmployeeBean  emp=new EmployeeBean();
		    	System.out.println("enter employee id ");
		    	emp.setEmpid(input.nextInt());
		    	System.out.println("enter employee salary");
		    	emp.setEmpsal(input.nextInt());
		    	System.out.println("enter employee mobile number");
		    	emp.setEmpmobileno(input.nextLong());
		    	empbean[i]=emp;
		    }
        }
	    //*******delete data**************//
       public void deletedata() {
    	   System.out.println("enter the deleteted data information");
    	      int d=sc.nextInt();
    	      int i,count=0;
    	      for(i=0;i<empbean.length;i++) {
    	    	  if(empbean[i]!=null&&empbean[i].empid==d)
    	    	  {
    	    		  empbean[i]=null;
    	    		  count++;
    	    		  break;
    	    	  }
    	      }
    	      if(count==0)
    	      {
    	    	  System.out.println("not found");
    	      }
    	      else {
    	    	  System.out.println("deleted succussesfully");
    	      } 		
	    	}
      ////**************search data****************//
       public void searchdata() {
   		System.out.println("Enter an employeeId details");
   		int x = sc.nextInt();
   		for (int i=0;i<empbean.length;i++) {
   			if(empbean[i] != null) {
   				EmployeeBean ab3 = (EmployeeBean)empbean[i];
   				if(empbean[i].empid == x) {
   					System.out.println("Id="+ab3.empid +" "+"Salary="+ab3.empsal +" "+"Mobile no="+ab3.empmobileno);
   					System.out.println("Given employeeId is in the array. ");
   					return;
   				}
   			}
   		}
   		System.out.println("Employee id not found. ");
   	}
   	///////***********print data***********/////
   	public void printAll() {
   		for(int i=0;i<empbean.length;i++) {
   			if(empbean[i] != null) {
   				EmployeeBean ab4 = (EmployeeBean)empbean[i];
   				System.out.println("Id="+ab4.empid +" "+"Salary="+ab4.empsal +" "+"Mobile no="+ab4.empmobileno);
   			}
   		}
   		System.out.println("employee details printed successfully. ");
   	}
}
   	public class Test12 {

   		public static void main(String[] args) {
   			
   			EmployeeBean eb= new EmployeeBean();
   			for(;;) {
   				Scanner sc = new Scanner(System.in);
   				System.out.println("Please select your choice: \r\n" +
   						"1. insert Into Array.\r\n" + 
   						"2. delete from my Array.\r\n" + 
   						"3. Search an employee from my Array.\r\n" + 
   						"4. Print All the employees from my Array.\r\n" + 
   						"5. Exit.");
   				int ch = sc.nextInt();
   				switch(ch) {
   				case 1: eb.insertdata();
   				break;
   				case 2: eb.deletedata();
   				break;
   				case 3: eb.searchdata();
   				break;
   				case 4: eb.printAll();
   				break;
   				default: System.out.println("Please give a valid Input: ");
   				
   				}
   			}
   		}

   	}
