package com.vtalent.java.lokesh;


import java.util.Scanner;

class EmployeeBean1{
private String employeeName;
private int employeeId;
private double employeeSalary;
private long employeeMobileno;
static EmployeeBean1[] emparray;
static Scanner s=new Scanner(System.in);
public void setemployeeName(String employeeName) {
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
public void insert() {
System.out.println("enter the no of employees to be stored");
int size=s.nextInt();
emparray=new EmployeeBean1[size];
for(int i=0;i<size;i++) {
EmployeeBean1 em=new EmployeeBean1();
System.out.println("enter the employeeName");
employeeName=s.next();
em.setemployeeName(employeeName);
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
for(int i=0;i<size;i++){
EmployeeBean1 em1=(EmployeeBean1)emparray[i];
System.out.println("Name="+em1.getEmployeeName()+"id="+em1.getEmployeeId()+""+"salary="+em1.getEmployeeSalary()+""+"mobileno="+em1.getEmployeeMobileno());
}
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
System.out.println("Name="+em3.getEmployeeName()+""+"id="+em3.getEmployeeId()+""+"salary="+em3.getEmployeeSalary()+""+"mobileno="+em3.getEmployeeMobileno());
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
System.out.println("Name="+em2.getEmployeeName()+""+"id="+em2.getEmployeeId()+""+"salary="+em2.getEmployeeSalary()+""+"mobileno="+em2.getEmployeeMobileno());
System.out.println("the employee details successfully found");
return;
}
else {
System.out.println("the given is not matched");
}
}
}
public void printalldata() {
System.out.println("the all the employee details are");
for(int i=0;i<emparray.length;i++) {
EmployeeBean1 em4=(EmployeeBean1)emparray[i];
System.out.println("Name="+em4.getEmployeeName()+""+"id="+em4.getEmployeeId()+""+"salary="+em4.getEmployeeSalary()+""+"mobileno="+em4.getEmployeeMobileno());
System.out.println("print all employee list");
}
}

public void employeeName() {
	boolean flag = false;
	int message=0;
	System.out.println("enter the employeeName");
char e=s.next().charAt(0);
for(int i=0;i<emparray.length;i++) {
EmployeeBean1 em5=(EmployeeBean1)emparray[i];
if(emparray[i]!=null) {
	String q=emparray[i].employeeName;
	char[]w=q.toCharArray();
	if(w[0]==e) {
		flag=true;
		if(message==0) {
System.out.println("Name="+em5.getEmployeeName()+""+"id="+em5.getEmployeeId()+""+"salary="+em5.getEmployeeSalary()+""+"mobileno="+em5.getEmployeeMobileno());
message++;
}	
}
}}
if(!flag) {
System.out.println("the employee name with letter " + e + "not found" );
}}}
public class Test2 {
static Scanner s= new Scanner(System.in);
public static void main(String[] args) {
EmployeeBean1 a=new EmployeeBean1();
for(;;) {
System.out.println("please enter your choice\n"
+"1.insert into Array.\n"
+"2.delete from my Array.\n"
+"3.search an employee from my Array.\n"
+"4.print all the employees from my Array.\n"
+"5.enter the employeeName\n"
+"6.exit.");
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
a.printalldata();
System.out.println("print all the employee list");
case 5:
	a.employeeName();
	System.out.println("Name found sucessfully");
case 6:
System.exit(0);
break;
}
}
}
}
