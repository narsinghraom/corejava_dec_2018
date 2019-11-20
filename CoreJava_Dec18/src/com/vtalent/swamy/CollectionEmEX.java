package com.vtalent.swamy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionEmEX {
	static List<EmployeeBeen> al = new ArrayList<EmployeeBeen>();
	static Scanner sc = new Scanner(System.in);

	public static void insert() throws IOException {
		EmployeeBeen eb = new EmployeeBeen();
		System.out.println("Employee id");
		int id = sc.nextInt();
		eb.setEmpid(id);
		System.out.println("Employee name");
		String s = sc.next();
		eb.setEmpname(s);
		System.out.println("Employee salary");
		float f = sc.nextFloat();
		eb.setEmpsalary(f);
		System.out.println("Employee mobile");
		long l = sc.nextLong();
		eb.setEmpmobile(l);
		al.add(eb);
		System.out.println(al);
		writeObj(al);
	}

	public static void delete() throws ClassNotFoundException, IOException {
		/*
		 * for(EmployeeBeen bb:al) { System.out.println(bb); } int vc=sc.nextInt();
		 * al.remove(vc); }
		 */
		System.out.println("enter id");
		Integer n = sc.nextInt();
		List<EmployeeBeen> al=readObj();
		int c=0;
		if(al !=null) {
			for(EmployeeBeen ee:al) {
			//	EmployeeBeen p = r.get(i);
				if (ee!=null&& ee.getEmpid()== n) {
					al.remove(ee);
					c++;
					System.out.println("remove emp ="+ee);
					break;
				}
			}
		}
		if(c == 0) {
			System.out.println("employee id not found");
		}else {
			System.out.println("employe id deleted successfully");
			System.out.println("new array is: ");
				for(EmployeeBeen ee:al) {
					if(al!=null) {
					System.out.println(ee);
					}
				}
			}
		writeObj(al);
		}

	public static void printall() throws ClassNotFoundException, IOException {
		for (EmployeeBeen bb : al) {
			System.out.println(bb);
		}
	System.out.println(readObj());
	}
public static void search() {
	System.out.println("enter id");
	Integer n=sc.nextInt();
	if(al.size()>=n){
	for(int i=0;i<=al.size()-1;i++) {
		EmployeeBeen p=al.get(i);
		if(p.getEmpid()==n) {
			System.out.println(p);
		}
	}

	}else
		System.out.println("Employee not found");
}

	public static List<EmployeeBeen> writeObj(List<EmployeeBeen> al) throws IOException {
		File f = new File("C://swami/file2.txt");
		FileOutputStream fis = new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fis);
		os.writeObject(al);
		return al;
	}

	public static List<EmployeeBeen> readObj() throws IOException, ClassNotFoundException {
		File f = new File("C://swami/file2.txt");
		FileInputStream ff = new FileInputStream(f);
		ObjectInputStream oi = new ObjectInputStream(ff);
		Object o = oi.readObject();
		List<EmployeeBeen> list = (List<EmployeeBeen>) o;
		return list;
	}
}
