package com.vtalent.shiva;

import java.io.*;

public class Serialization implements Serializable{ 
		 int id;
		 double salary;
		public String mobile;
	public static void serialization() throws IOException  {
		Serialization se=new Serialization()  ;
		se.id=100;
		se.salary=25000.00;
		File file=new File("Serial.text");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(se);
		System.out.println("Serialization is done");
		
	}

	public static void deserialization() throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("Serial.text");
		ObjectInputStream ois=new ObjectInputStream(fis);
				Object o=ois.readObject();
				Serialization se=(Serialization)o;
				System.out.println("id =" + se.id);
				System.out.println("salary =" + se.salary);
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
				serialization();
		
	}
}
