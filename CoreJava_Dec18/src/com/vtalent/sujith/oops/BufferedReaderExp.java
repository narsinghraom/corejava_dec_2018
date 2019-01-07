package com.vtalent.sujith.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExp {

	public static void main(StringExample[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
