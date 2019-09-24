package com.vtalent.java.srikarreddy;

import java.util.Scanner;

class EmployeeBean1{
private int employeeId;
private double employeeSalary;
private long employeeMobileno;
static EmployeeBean1[] emparray;
static Scanner s=new Scanner(System.in);

public void setEmployeeId(int employeeId) {
this.employeeId=employeeId;
}
public void setEmployeeSalary(double employeeSalary) {
this.employeeSalary=employeeSalary;
}
public void setEmployeeMobileno(long employeeMobileno) {
this.employeeMobileno=employeeMobileno;
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
public void insert() {
 
System.out.println("enter the no,of employees to be stored");
int size=s.nextInt();
emparray=new EmployeeBean1[size];
for(int i=0;i<size;i++) {
EmployeeBean1 em=new EmployeeBean1();
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
for(int i=0;i<size; i++) {
	EmployeeBean1 em1=(EmployeeBean1)emparray[i];
 
		System.out.println("id="+em1.getEmployeeId()+""+"salary="+em1.getEmployeeSalary()+""+"Mobileno="+em1.getEmployeeMobileno());}
       }

public void delete() {
System.out.println("enter particular value to be deleted");
int n=s.nextInt();
int count = 0;
for(int i=0;i<=emparray.length-1;i++) {
if(emparray[i] != null && emparray[i].employeeId == n) {
emparray[i] = null;
count++;
break;
}
}
if(count == 0) {
System.out.println("employee id not found");
}else {
System.out.println("employee id deleted successfully");
System.out.println("now the array is: ");
for(int i=0;i<=emparray.length-1;i++) {
if(emparray[i]!=null) {
EmployeeBean1 em3=(EmployeeBean1)emparray[i];
System.out.println("id="+em3.getEmployeeId()+""+"salary="+em3.getEmployeeSalary()+""+"mobileno="+em3.getEmployeeMobileno());
}
}
}
}
 
public void search() {
	System.out.println("enter particular value to be search");
	int n=s.nextInt();
	for(int i=0;i<emparray.length;i++) {
		EmployeeBean1 em2=(EmployeeBean1)emparray[i];
		if(em2.employeeId==n) {
			System.out.println("id="+em2.getEmployeeId()+""+"salary="+em2.getEmployeeSalary()+""+"Mobileno="+em2.getEmployeeMobileno());
			System.out.println("The employee details found");
			return;
		}
		else {
			System.out.println("the given is not matched ");
		}
	}
	
	
}
public void printAll() {
	for(int i=0;i<emparray.length; i++) {
		EmployeeBean1 em4=(EmployeeBean1)emparray[i];
	 
			System.out.println("id="+em4.getEmployeeId()+""+"salary="+em4.getEmployeeSalary()+""+"Mobileno="+em4.getEmployeeMobileno());
			System.out.println("print the all employee list  ");
}
	       }}
	 
public class Test007 {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
 
EmployeeBean1 a=new EmployeeBean1();
for(;;) {
System.out.println("please enter your choice\n"
+"1.insert into Array.\n"
+"2.delete from my Array.\n"
+"3.search an employee from my Array.\n"
+"4.print all the employees from my Array.\n"
+"5.exit.");
int n=s.nextInt();
switch(n) { 
case 1:
a.insert();
System.out.println("all the data inserted successfully");
break;
case 2:
a.delete();
System.out.println("the details successfully deleted");
break;
case 3:
a.search();
System.out.println("id found successfuly");
break;
case 4:
	a.printAll();
	System.out.println("print all the employees list");
	break;
case 5:
 
	System.exit(0); 
	break;
}}
}}

 
