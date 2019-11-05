package com.vtalent.varshini;

import java.io.*;


import java.util.*;

class EmployeeBean implements Serializable {

	private int empid;
	private double empsal;
	private long empmobileno;
	private String empname;
	static ArrayList<EmployeeBean> empabc = new ArrayList<EmployeeBean>();
	static Scanner sc = new Scanner(System.in);
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
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

	private void  writeObjectFile(ArrayList<EmployeeBean> empabc2) throws Exception{
	 //File file=new File("serial.txt");
	 FileOutputStream fos=new FileOutputStream("serial.txt");
	 ObjectOutputStream oos=new ObjectOutputStream(fos); 
	 oos.writeObject(empabc2);
     System.out.println("Serialization is done"); //oos.close(); 
	}
	  
         //****insert data*****////
	            public void insertdata() throws Exception {
	            EmployeeBean  emp=new EmployeeBean();
		    	System.out.println("enter employee id ");
		    	emp.setEmpid(sc.nextInt());
		    	System.out.println("enter employee salary");
		    	emp.setEmpsal(sc.nextInt());
		    	System.out.println("enter employee mobile number");
		    	emp.setEmpmobileno(sc.nextLong());
		    	System.out.println("enter employee name");
		    	emp.setEmpname(sc.next());
		    	empabc.add(emp);
		    	    
		    writeObjectFile(empabc);
		    readObjectFile();
        }
	            
	             public static ArrayList<EmployeeBean> readObjectFile() throws Exception { 
	           	 FileInputStream fis=new FileInputStream("serial.txt"); 
	           	 ObjectInputStream ois=new ObjectInputStream(fis); 
	           	 Object o=ois.readObject();
	           	 ArrayList<EmployeeBean> emp=(ArrayList<EmployeeBean>)o; 
	           	// for(int i=0;i<=array.length-1;i++)
	           	 return emp;
	           	 }
	    //*******delete data**************//
       public void deletedata() throws Exception {
    	   ArrayList<EmployeeBean> empabc=readObjectFile();
    	   System.out.println("enter the deleteted data information");
    	      int d=sc.nextInt();
    	      for(EmployeeBean ab2:empabc) {
    	    	  if(empabc !=null) {
    	    		  if(ab2 !=null && ab2.empid==d) {
    	    			  empabc.remove(ab2);
    	    		  }
    	    	  }
    	      writeObjectFile(empabc);
	    	}
    	}
    	  
    				
      ////**************search data****************//
       public void searchdata() throws Exception {
    	  
    	ArrayList<EmployeeBean> empabc = readObjectFile();

   		System.out.println("Enter an employeeId details");
   		int x = sc.nextInt();
   		//for (int i=0;i<empbean.length;i++) {
   	        for(EmployeeBean ab3:empabc)				//EmployeeBean  ab3 = (EmployeeBean)empbean;
   				if(ab3 !=null && ab3.empid== x) {
   					System.out.println("Id="+ab3.empid +" "+"Salary="+ab3.empsal +" "+"Mobile no="+ab3.empmobileno);
   					System.out.println("Given employeeId is in the array. ");
   					return;
   				}
   			
   		
       System.out.println("Employee id not found. ");
       }
       
       public void searchempdata() throws Exception {
    	   
    	   ArrayList<EmployeeBean> empabc = readObjectFile();

      		System.out.println("Enter an employeename details");
      		String s = sc.nextLine();
      		//for (int i=0;i<empbean.length;i++) {
      			if(empabc != null) {
      				//EmployeeBean ab4 = (EmployeeBean)empbean[i];
      				for(EmployeeBean ab4:empabc)
                   	if(s.equals(ab4.getEmpname())) {
      					System.out.println("Id="+ab4.empid +" "+"Salary="+ab4.empsal +" "+"Mobile no="+ab4.empmobileno+"empname="+ab4.empname);
      					System.out.println("Given employeename is in the array. ");
      					return;
      				}
      			}
      		
      		System.out.println("Employee id not found. ");
      	}
       public void updatedata() throws Exception {
    	   ArrayList<EmployeeBean> empabc = readObjectFile();

    	   if(empabc !=null) {
    		   System.out.println("if u want to update the employee details");
    		   int b = sc.nextInt();{
    		  // for (int i=0;i<empbean.length;i++) 
    			   for(EmployeeBean ab5:empabc)
                     // EmployeeBean ab5 = empbean[i];
                        if(ab5 != null) {
                        	if(b==(ab5.getEmpid())) {
                     
           		      	System.out.println("Id="+ab5.empid +" "+"Salary="+ab5.empsal +" "+"Mobile no="+ab5.empmobileno);
      					
      				} 
                    System.out.println("Do u want to update the empid details yes/no");
                    String n=sc.next();
                    if(n.equals("yes")) {
                    	System.out.println("enter id to update");
                    	ab5.setEmpid(sc.nextInt());
                    }
                    System.out.println("Do u want to update the empsal details yes/no");
                    String n1=sc.next();
                    if(n1.equals("yes")) {
                    	System.out.println("employee salary to update");
                    	ab5.setEmpsal(sc.nextDouble());
                    }
                    System.out.println("Do u want to update the empmobile details yes/no");
                    String n2=sc.next();
                    if(n2.equals("yes")) {
                    	System.out.println("enter mobile details to update");
                    	ab5.setEmpmobileno(sc.nextLong());
                    }
                    System.out.println("Do u want to update the emp details yes/no");
                    String n3=sc.next();
                    if(n3.equals("yes")) {
                    	System.out.println("enter id to update");
                    	ab5.setEmpname(sc.nextLine());
                    }
    	   }
    		   }
    	   }
       }
       
       
   	///////***********print data***********/////
   	public void printAll() throws Exception{
   		ArrayList<EmployeeBean> empabc = readObjectFile();
   		
   		//for(int i=0;i<empbean.length;i++) 
   		for(EmployeeBean ab4:empabc)
               if(empabc != null) {
   				//EmployeeBean ab4 = (EmployeeBean)empbean[i];
   				System.out.println("Id="+ab4.empid +" "+"Salary="+ab4.empsal +" "+"Mobile no="+ab4.empmobileno +"empname="+ab4.empname);
   			}
   		
   		System.out.println("employee details printed successfully. ");
   	}	 
   	}
       
 
   	public class Test12 {

   		public static void main(String[] args) throws Exception {
   			EmployeeBean eb=new EmployeeBean();
   			for(;;) {
   				Scanner sc = new Scanner(System.in);
   				System.out.println("Please select your choice: \r\n" +
   						"1. insert Into Array.\r\n" + 
   						"2. delete from my Array.\r\n" + 
   						"3. Search an employee from my Array.\r\n" +
   						"4. serch emp.\r\n"+
   						"5. update emp.\r\n"+
   						"6. Print All the employees from my Array.\r\n" + 
   						"7. Exit.");
   				int ch = sc.nextInt();
   				switch(ch) {
   				case 1: eb.insertdata();
   				break;
   				case 2: eb.deletedata();
   				break;
   				case 3: eb.searchdata();
   				break;
   				case 4: eb.searchempdata();
   				break;
   				case 5:eb.updatedata();
   				break;
   				case 6: eb.printAll();
   				break;
   				default: System.out.println("Please give a valid Input: ");
   				
   				}
   			}
   		}

   	}
