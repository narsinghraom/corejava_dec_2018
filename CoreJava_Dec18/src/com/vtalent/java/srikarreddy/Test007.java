package com.vtalent.java.srikarreddy;

    
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class EmployeeBean1 implements Serializable{
	private String employeeName;
	private int employeeId;
	private double employeeSalary;
	private long employeeMobileno; 
	static EmployeeBean1[] emparray;
	static Scanner s=new Scanner(System.in);
	
	public void setEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary=employeeSalary;
	}
	public void setEmployeeMobileno(long employeeMobileno) {
		this.employeeMobileno=employeeMobileno;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public double getEmployeeSalary() {
		return this.employeeSalary;
	}
	public long getEmployeeMobileno(){
		return this.employeeMobileno;
		}
	
	
	/*public String toString() {
		return "EmployeeBean1 [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + ", employeeMobileno=" + employeeMobileno + "]";
	}*/
	public void  writeObjectInFile(EmployeeBean1[] emparray)  throws IOException {
	 
		File f=new File("program.txt");
		FileOutputStream fd=new FileOutputStream(f);
		ObjectOutputStream cd=new ObjectOutputStream(fd);
		cd.writeObject(emparray);
		 System.out.println("serialization is done");
		    
	}
	public EmployeeBean1[] readFiles()  throws IOException, ClassNotFoundException {
	  
		FileInputStream fd=new FileInputStream("program.txt");
		ObjectInputStream cd=new ObjectInputStream(fd);
		Object o=cd.readObject();
		EmployeeBean1[] emparray=(EmployeeBean1[])o;
//		for(int i=0;i<emparray.length ;i++) {
//			if(emparray[i] !=null) {
//			EmployeeBean1 dr=(EmployeeBean1)emparray[i]; 
//			System.out.println("employeeName="+dr.getEmployeeName()+""+"id="+dr.getEmployeeId()+""+"salary="+dr.getEmployeeSalary()+""+"mobileno="+dr.getEmployeeMobileno());
		 
//		}}
		return emparray;
	 
	}
	public void insert() throws IOException, ClassNotFoundException {
				System.out.println("enter the no of employees to be stored");
		int size=s.nextInt();
				emparray=new EmployeeBean1[size];
				for(int i=0;i<size;i++) {
					EmployeeBean1 em=new EmployeeBean1();
			System.out.println("please enter employeename");
			s.nextLine();
			employeeName=s.nextLine();
			em.setEmployeeName(employeeName);
			System.out.println("please enter your employeeid");
			int id=s.nextInt();
			em.setEmployeeId(id);
			System.out.println("please enter your salary");
			double salary= s.nextDouble();
			em.setEmployeeSalary(salary);
	        System.out.printf("Please enter your Mobilenumber");
	        long Mobileno= s.nextLong();
	        em.setEmployeeMobileno(Mobileno);
	        emparray[i]=em;
				}
	        
	         
				 writeObjectInFile(emparray );
			        readFiles( );
				/*for(int i=0;i<size;i++){
					EmployeeBean1 em1=(EmployeeBean1)emparray[i];
				System.out.println("employeeName="+em1.getEmployeeName()+""+"id="+em1.getEmployeeId()+""+"salary="+em1.getEmployeeSalary()+""+"mobileno="+em1.getEmployeeMobileno());
				}*/
				}
	
	public void delete() throws IOException, ClassNotFoundException {
		System.out.println("enter particular value to be deleted");
	int n=s.nextInt();
	EmployeeBean1[] emparray=readFiles();
	if(emparray != null) {
	int u = 0;
	for(int i=0;i<=emparray.length-1;i++) {
		if(emparray[i] != null && emparray[i].employeeId == n) {
			emparray[i] = null;
			u++;
			break;
		}	
	} 
	if(u == 0) {
		System.out.println("employee id not found");
	}else {
		System.out.println("employee id deleted successfully");
		System.out.println("now the array is: ");
		for(int i=0;i<=emparray.length-1;i++) {
			if(emparray[i]!=null) {
				EmployeeBean1 em3=(EmployeeBean1)emparray[i];
			
				System.out.println("employeeName="+em3.getEmployeeName()+""+"id="+em3.getEmployeeId()+""+"salary="+em3.getEmployeeSalary()+""+"mobileno="+em3.getEmployeeMobileno());
			}	
		}
		 writeObjectInFile(emparray );
	 
	}
	}}
	public void search() throws IOException, ClassNotFoundException {
	System.out.println("enter particular value to be search");
	int n=s.nextInt();
	EmployeeBean1[] emparray=readFiles();
	if(emparray != null) {
	for(int i=0;i<emparray.length;i++) {
	EmployeeBean1 em2=(EmployeeBean1)emparray[i];
	
	if(em2.employeeId==n) {
		System.out.println("employeeName="+em2.getEmployeeName()+""+"id="+em2.getEmployeeId()+""+"salary="+em2.getEmployeeSalary()+""+"mobileno="+em2.getEmployeeMobileno());
System.out.println("the employee details successfully found");
return;
	}
	else {
		System.out.println("the given is not matched");
	}
	}}
	 
	}
public void printalldata() throws IOException, ClassNotFoundException {
	System.out.println("the all the employee details are");
	EmployeeBean1[] emparray=readFiles();
	if(emparray != null) {
	for(int i=0;i<emparray.length;i++) {
		if(emparray[i]!=null) {
		EmployeeBean1 em4=(EmployeeBean1)emparray[i];
		
		System.out.println("employeeName="+em4.getEmployeeName()+""+"id="+em4.getEmployeeId()+""+"salary="+em4.getEmployeeSalary()+""+"mobileno="+em4.getEmployeeMobileno());
//		System.out.println("print all employee list");
	}
	}}
    
}
public void searchemployeeName() throws IOException, ClassNotFoundException {
	boolean flag = false;
	int message=0;
	System.out.println("enter particular Name to be search");
	char e=s.next().charAt(0);
	EmployeeBean1[] emparray=readFiles();
	for(int i=0;i<emparray.length;i++) {
	EmployeeBean1 em5=(EmployeeBean1)emparray[i];
	
	if(emparray[i]!=null) {
		String q=emparray[i].employeeName;
		char[] w=q.toCharArray();
		if(w[0]==e) {
			flag = true;
			if(message==0) {
		System.out.println("employeeName="+em5.getEmployeeName()+""+"id="+em5.getEmployeeId()+""+"salary="+em5.getEmployeeSalary()+""+"mobileno="+em5.getEmployeeMobileno());
		message++;
	}
			}	
	}
	}
	if(!flag) {
	System.out.println("the employee name with letter " + e + " not found");
	}
	 
}

public void updatedetails() throws IOException, ClassNotFoundException {
		System.out.println("Enter the Id to be Updated");
		int n = s.nextInt();
		EmployeeBean1[] emparray=readFiles();
		for (int i = 0; i <= emparray.length - 1; i++) {
		EmployeeBean1 em6=(EmployeeBean1)emparray[i];
		
		if(emparray[i]!=null && emparray[i].employeeId==n) {
           System.out.println("enter Employees new Id yes or no");
           String w=s.next();
           if(w.equals("yes")) {
        	   System.out.println("enter new id:");
        	   int e=s.nextInt();
        	   emparray[i].employeeId=e;
           }else {
        	   System.out.println("no");
           }
            System.out.println("Enter Employees new Name yes or no.");
		    String z=s.next();
		       if(z.equals("yes")) {
		    	  System.out.println("enter name:");
		    	    employeeName=s.next();
		    	   emparray[i].employeeName=employeeName;
		       }else {
		    	   System.out.println("no");
		       }
		       System.out.println("Enter Employee new  Salary yes or no.");
		       String w1=s.next();
		       if(w1.equals("yes")) {
		    	   System.out.println("enter salary:");
		    	   double r=s.nextDouble();
		    	   emparray[i].employeeSalary= r;
		       }else {
		    	   System.out.println("no");
		       }
		}
		System.out.println("enter Employees new Mobileno yes or no. ");
		String e=s.next();
		if(e.equals("yes")) {
			System.out.println("enter mobile no:");
			long b=s.nextLong();
			emparray[i].employeeMobileno=b;
		}else {
			System.out.println("no");
		}
		 writeObjectInFile(emparray );
		 return;
		}
		 
}
}
public class Test007 {
	static Scanner s= new Scanner(System.in);
public static void main(String[] args) throws IOException, ClassNotFoundException {
	EmployeeBean1 a=new EmployeeBean1();
for(;;) {
System.out.println("please enter your choice\n"
		+"1.insert into Array.\n"
		+"2.delete from my Array.\n"
		+"3.search an employee from my Array.\n"
		+"4.print all the employees from my Array.\n"
		+"5.search an employee with name\n"
		+"6.update an employee details\n"
		+"7.exit.");
int n=s.nextInt();
switch(n) {
case 1:
	a.insert();
//	System.out.println("all the data inserted successfully");
	break;
case 2:
	a.delete();
//	System.out.println("the details successfully deleted");
	break;
case 3:
	a.search();
//	System.out.println("id found successfuly");
	break;
case 4:
	a.printalldata();
//	System.out.println("print all the employee list");
	break;
case 5:
	a.searchemployeeName();
//	System.out.println("search found successfully");
	break;
case 6:
	a.updatedetails();
	System.out.println("details updated successfully");
	break;
case 7:
	System.exit(0);
	break;
}
}
}
}