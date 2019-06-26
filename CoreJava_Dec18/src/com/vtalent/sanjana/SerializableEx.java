package com.vtalent.sanjana;

import java.io.*;

public class SerializableEx {

	static	Employee emp;
	public static void doSerialization() throws Exception{
File file=new File("F:/sanju.txt");
FileOutputStream fos=new FileOutputStream(file);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(EmployeeOperations.empArray);
			}
	public static void deSerialization() throws Exception{
		FileInputStream fis=new FileInputStream("F:/sanju.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Employee[] empArray1=(Employee[])obj;
		for(int i=0;i<=empArray1.length-1;i++) {
			System.out.println("Id- "+empArray1[i].getEmployeeId()+'\n'+"Name- "+empArray1[i].getEmployeeName()+'\n'+"Package- "+empArray1[i].getEmployeePackage()+'\n'+"Salary- "+empArray1[i].getEmployeeSalary()+'\n'+"pf- "+empArray1[i].getEmployeepf());
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	doSerialization();
	deSerialization();
}
catch(Exception ex)
{
	
}
	}

}
