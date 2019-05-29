package com.vtalent.saritha;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedEx {
	public static void main(String []args){
		BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		int empid = Input.read();
		Integer itr=new Integer (empid);
		int Id=itr.intValue();
		System.out.println("enter name");
		String empName=Input.readLine();
		System.out.println("enter salary");
		int salary=Input.read();
		float esalary=float.parseFloat(salary);
		System.out.println("Id="+Id);
		System.out.println("Name="+empName);
		System.out.println("salary"+esalary);
	}
	}


