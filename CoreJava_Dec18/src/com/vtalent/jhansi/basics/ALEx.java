package com.vtalent.jhansi.basics;
import java.util.*;
class Employee2{
	int empId;
	String empName;
}
public class ALEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Employee2 emp=new Employee2();
emp.empId=100;
emp.empName="Vtalent";
Employee2 emp1=new Employee2();
emp1.empId=200;
emp1.empName="Info";
ArrayList<Employee2> empList=new ArrayList<Employee2>();
empList.add(emp);
empList.add(emp1);
Iterator itr=empList.iterator();
while(itr.hasNext())
{
	Employee2 emp2=(Employee2)itr.next();
	System.out.println(emp2.empId+" "+ emp2.empName);
}
for(Employee2 emp3:empList)
{
	System.out.println(emp3.empId+" "+emp3.empName);
}
}

}
