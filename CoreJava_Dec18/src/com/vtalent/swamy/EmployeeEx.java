package com.vtalent.swamy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeEx {
	static Scanner sc = new Scanner(System.in);
	static int size = sc.nextInt();
	public static EmployeeBeen[] emparry = new EmployeeBeen[size];
	public static int insert(EmployeeBeen eb) throws IOException {
		int result = 0;
		/*File file=new  File("C:\\swami/edata.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);*/
		  
		if (eb !=null && emparry != null) {
			for (int i = 0; i <= emparry.length - 1; i++) {
				if (emparry[i] == null) {
					emparry[i] = eb;
					System.out.println(emparry[i]);
					//oos.writeObject(emparry);
					 writeObjectFile();//method reusing this method is bottom
					result++;
					break;
				}

			}
		}
		return result;
	}

	public static int delete(EmployeeBeen eb) throws IOException, ClassNotFoundException {
		int result = 0;
	/*	File file=new  File("C:\\swami/edata.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		EmployeeBeen[] e=(EmployeeBeen[])o;*/	
		EmployeeBeen[] e= readObjectFile();//----->this method as follows in below execution 
		System.out.println("id");
			int i1=sc.nextInt();
			for (int i = 0; i <= e.length - 1; i++) {
				if(i1==e[i].getEmpid()) {
				/*EmployeeBeen arrayData = null;
				arrayData = e[i];
				if (arrayData != null && arrayData.getEmpid() == eb1.getEmpid()) {*/
					e[i] = null;
					emparry=e;
					result++;
				}
				writeObjectFile();
			}
		
		return result;
	}

	public static int searchById(EmployeeBeen eb2) {
		int result = 0;
		if (emparry != null) {
			for (int i = 0; i <= emparry.length - 1; i++) {
				EmployeeBeen arrayData = null;
				arrayData = emparry[i];
				if (emparry[i] != null && arrayData.getEmpid() == eb2.getEmpid()) {
					System.out.println(emparry[i]);
					result++;
				}
			}
		}
		return result;
	}
	public static void searchbyName() {
		 EmployeeBeen eb=null;
		boolean b = false;
		int result = 0;
		System.out.println("Enter an employeeName Starting Letter to be search: ");
		char c = sc.next().charAt(0);
		for (int i = 0; i < emparry.length; i++) {
			// eb=new EmployeeBeen();
			if (emparry[i] != null) {
				String e1 = emparry[i].getEmpname();
				char[] ch = e1.toCharArray();
				if (ch[0] == c) {
					b = true;
					if (result == 0) {
						System.out.println("EmployeeName with " + c + " letter. ");
						result++;
					}
					System.out.println(emparry[i]);
				}
			}
		}
		if (!b) {
			System.out.println("EmployeeName not found with " + c + " letter. ");
		}
	}
	public static int displayAll() throws IOException, ClassNotFoundException {
		/*File file=new  File("C:\\swami/edata.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		EmployeeBeen[] e=(EmployeeBeen[])o;*/
		EmployeeBeen[] e=readObjectFile();
		for (int i1 = 0; i1 <= e.length - 1; i1++) {
			System.out.println("fiele "+e[i1]);
		}
		for (int i = 0; i <= emparry.length - 1; i++) {
			if (emparry[i] != null) {
				System.out.println(emparry[i]);
			}
		}
		return 0;
	}
	public static int update(EmployeeBeen eb) throws IOException, ClassNotFoundException {
		int result = 0;
		//EmployeeBeen eb = null;
		eb = new EmployeeBeen();
		displayAll();
		System.out.println("do u want to update in any Array enter 'id':");
		int i1 = sc.nextInt();
		eb.setEmpid(i1);
		if (emparry != null) {
			for (int i = 0; i <= emparry.length - 1; i++) {
				EmployeeBeen arrayData = null;
				arrayData = emparry[i];
				if (emparry[i] != null && arrayData.getEmpid()==eb.getEmpid()) {
					System.out.println("it is valied id" + "   " + i1 + "");
					System.out.println(emparry[i]);
					System.out.println("do u want change id  press 'y/n'");
					String s = sc.next();
					if (s.equals("y")) {
						System.out.println("please enter  your id ");
						int i3 = sc.nextInt();
						arrayData.setEmpid(i3);
						
						// emparry[i].setEmpid(sc.nextInt());
					}
					System.out.println("do u want change name press 'y/n'");
					String s1 = sc.next();
					if (s1.equals("y")) {
						System.out.println("please enter your name");
						String c = sc.next();
						arrayData.setEmpname(c);
					}
					System.out.println("do u want change salary  press 'y/n'");
					String s2 = sc.next();
					if (s2.equals("y")) {
						System.out.println("please enter  your salary");
						double d1 = sc.nextDouble();
						arrayData.setEmpsalary(d1);
					}
					System.out.println("do u want change mobile  press 'y/n'");
					String s3 = sc.next();
					if (s3.equals("y")) {
						System.out.println("please enter  your mobile");
						long l = sc.nextLong();
						arrayData.setEmpmobile(l);
					}
					writeObjectFile();
					result++;
					System.out.println(emparry[i]);
				} else {
					System.out.println(""+i1+ "   " + "id is not valied");
					
				}
			}
			
		}
		return result;

	}
	public static EmployeeBeen[] readObjectFile() throws IOException, ClassNotFoundException{
		File file=new  File("C:\\swami/edata.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		EmployeeBeen[] e=(EmployeeBeen[])o;
		return e;
	}
	public static EmployeeBeen[] writeObjectFile() throws IOException {
		File file=new  File("C:\\swami/edata.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emparry);
		return emparry;
		

	}
}
		