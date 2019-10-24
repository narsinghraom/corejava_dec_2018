package com.vtalent.java.haritha;
import java.io.*;
public class Employee5 implements Serializable {
int id;
double salary;
public static void Serialization() throws Exception{
	Employee5 e=new Employee5();
	e.id=100;
	e.salary=25000.00;
	FileOutputStream fos=new FileOutputStream("serial.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e);
	System.out.println("Serialization is done");
}
}
