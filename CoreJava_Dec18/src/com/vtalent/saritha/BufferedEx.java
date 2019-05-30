package com.vtalent.saritha;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedEx {
	public static void main(String []args){
		BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
		/*Scanner sc=new Scanner(System.in);*/
		System.out.println("enter id");
		int empid =sc.nextInt();
		/*int empid =sc.nextInt();*/
		Integer itr=new Integer (empid);
		int Id=itr.intValue();
		System.out.println("enter name");
		
		System.out.println("enter salary");
		
		float salary=sc.nextFloat();
		System.out.println("Id="+Id);
	/*	System.out.println("Name="+empName);*/
		System.out.println("salary"+salary);
	}
	}


