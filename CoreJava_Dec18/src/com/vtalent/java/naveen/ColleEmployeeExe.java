package com.vtalent.java.naveen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ColleEmployeeExe {
	//Execution class for employee and creat arraylist
	static List<EmployeeBeanP> l = new ArrayList<EmployeeBeanP>();
	static Scanner sc = new Scanner(System.in);

	public static void insert(EmployeeBeanP e) throws IOException {
		l.add(e);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Write();
		
	}

	public static void delete() throws ClassNotFoundException, IOException {
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		List o1 = readEmployee();
		System.out.println(o1.size());
		System.out.println("enter Employee id for deleting");
		int id = sc.nextInt();
		for (int j = 0; j < o1.size(); j++) {
			EmployeeBeanP p = (EmployeeBeanP) o1.get(j);
			if (p.getEmployeeId() == id) {
				o1.remove(p);
				}
			l = o1;
			Write();
		}
	}// method
	public static void searchEmployee() throws ClassNotFoundException, IOException {
		// EmployeeBeanP vs=new EmployeeBeanP();
		List o1 = readEmployee();
		System.out.println(o1.size());
		System.out.println("Search By Employee Id");
		Integer isd = sc.nextInt();
	//	if (o1.size() >= isd) {
			for (int i = 0; i < o1.size(); i++) {
				EmployeeBeanP p = (EmployeeBeanP) o1.get(i);
				if (p.getEmployeeId() == isd) {
					System.out.println(p);
				}
			}
	//	} else
			//System.err.println("Employee not found............!");
	}

	public static void printAll() throws ClassNotFoundException, IOException {
		List o1 = readEmployee();
		// System.out.println(o1);
		Enumeration e = Collections.enumeration(o1);
		e.hasMoreElements();
		System.out.println("enumeration"+e.nextElement());
		if (l.size() != 0) {
			for (int y = 0; y < l.size(); y++) {
				System.out.println("ArrayList   " + l.get(y));
			}
		}
	}

	public static void updateEmployee() throws ClassNotFoundException, IOException {
		List o1 = readEmployee();
		System.out.println(o1);
		System.out.println("enter  id to update ");
		int isd = sc.nextInt();
		for (int i = 0; i < o1.size(); i++) {
			EmployeeBeanP p = (EmployeeBeanP) o1.get(i);
			if (p.getEmployeeId() == isd) {
				System.out.println("           " + o1.get(i));
				String s = "n";
				System.out.println("do u want to update y/n");
				s = sc.next();
				if (s.equalsIgnoreCase("y")) {
					System.out.println("do u want to update name y/n");
					String ss = sc.next();
					if (ss.equalsIgnoreCase("y")) {
						System.out.println("Enter name");
						p.setEmployeeename(sc.next());
						/*
						 * l=o1; Write();
						 */
					}
					System.out.println("Do u want chasnge id  y");
					String s1 = sc.next();
					if (s1.equalsIgnoreCase("y")) {
						System.out.println("enter id");
						p.setEmployeeId(sc.nextInt());
					}
					System.out.println("Do you want change salary       y");
					String s2 = sc.next();
					if (s2.equalsIgnoreCase("y")) {
						System.out.println("enter salary  ");
						p.setEmployeesalary(sc.nextDouble());
					}
				}
			}
			l = o1;
			Write();
		}
	}

	public static void Write() throws IOException {
		File f = new File("Employeelist.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l);
	}

	public static List readEmployee() throws IOException, ClassNotFoundException {
		File fa = new File("Employeelist.txt");
		FileInputStream fis = new FileInputStream(fa);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		List ll = (List) o;
		System.out.println(" read" + o);
		System.out.println();
		return ll;

	}

}// class
