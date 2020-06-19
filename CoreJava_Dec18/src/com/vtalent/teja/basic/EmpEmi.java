package com.vtalent.teja.basic;
import java.util.*;
public class EmpEmi {
	static Scanner ab= new Scanner(System.in);
	public static void main(String[] args) {
 double a=300000;
 double s;
 int emi;
 System.out.println(a+"enter  amount");
 int amt=ab.nextInt();
	int t=6,r=14;
	emi=amt/t+r;
	s=(a/12)-emi;
	 System.out.println("emi amount"+"    "+emi);
	 System.out.println("salary for year"+a);
	 System.out.println("enter  amount"+a/12);
	 System.out.println("salary"+s);
	
	emi=amt/2+r;	
}
}