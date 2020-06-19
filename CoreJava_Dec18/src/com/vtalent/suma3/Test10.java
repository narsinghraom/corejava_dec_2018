package com.vtalent.suma3;
import java.io.*;
class EmployeeOne implements Serializable
{
	int empId;
	String empName;
	double empSalary;
	//transient double empSalary; // it is nothing but hide the data for security reasons
}

class Test10 {
	public static void doSerializedObject() throws Exception
	{
		EmployeeOne emp=new EmployeeOne();
		emp.empId=101;
		emp.empName="Suma";
		emp.empSalary=25000.00;
		File file=new File("D://SerialObject.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}
	public static void getSerializedObject() throws Exception
	{
		FileInputStream fis=new FileInputStream("SerialObject.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		EmployeeOne emp =(EmployeeOne)o;
		//EmployeeOne emp=(EmployeeOne)ois.readObject();
		System.out.println("Id="+emp.empId+"\n"+"Name="+emp.empName+"\n"+"Salary= "+emp.empSalary);

	}
public static void main(String[] args)
{
	try
	{
		doSerializedObject();
		getSerializedObject();
	}
	catch (Exception e)
	{
		System.out.println("Something Went Wrong");
		
	}
}
}

