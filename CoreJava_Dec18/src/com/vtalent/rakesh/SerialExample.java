package com.vtalent.rakesh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExample {
	public static void serialization() throws IOException {

		Employeee emp = new Employeee();
		// emp.setId(100);
		// emp.setName("rakeshh");
		// emp.setSalary(10);
		File file = new File("D:\\Rakesh\\r");
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(emp);
	}

	public static void deSerialization() {

		try {
			FileInputStream fi = new FileInputStream("D:\\Rakesh\\r");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Object obj = ois.readObject();
			Employeee emp = (Employeee) obj;

			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.print(emp.getSalary());
		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {
		try {
			serialization();

		} catch (Exception e) {
		}
		try {
			deSerialization();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}