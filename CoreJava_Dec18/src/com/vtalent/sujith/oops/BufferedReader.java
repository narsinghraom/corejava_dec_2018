package com.vtalent.sujith.oops;

import java.io.*;

public class BufferedReader {

	public static void main(StringExample[] args) throws IOException {
		// TODO Auto-generated method stub

		java.io.BufferedReader br=new java.io.BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		String id1=br.readLine();
		int id2=Integer.parseInt(id1);
		System.out.println("enter name");
		String name=br.readLine();
		System.out.println("enter salary");
		String salary=br.readLine();
		double sal=Double.parseDouble(salary);
		System.out.println("id=     "+id2);
		System.out.println("name=   "+name);
		System.out.println("salary= "+sal);
	}

}
