package com.vtalent.java.vishnu;
import java.io.*;
class Employee implements Serializable
{
	int id;
	double salary;//transient
	//generate seriazation Id;
	
	public static void serialization()throws Exception
	{
		Employee emp=new Employee();
		emp.id=100;
		emp.salary=25000.00;
		File file=new File("d:/serial.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("serialization done");
	}
	
	public static void deserialazation()throws Exception{
		FileInputStream fis=new FileInputStream("d:/serial.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		Employee emp=(Employee)o;
		System.out.println("Id="+ emp.id);
		System.out.println("salary="+emp.salary);
	}
			
		
	public static void main(String[] args) throws Exception {
		serialization();
		//deserialazation();
	}}