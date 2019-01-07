package com.vtalent.vijay.oops;

public class InterfaceTestXyz {

	public static void main(String[] args) {
		Abc abc=new XyzImpl();
		System.out.println((abc.function(2)));
		System.out.println((abc.function(2,2)));
		//abc.function();
		
Xyz xyz=new XyzImpl();
System.out.println(xyz.function(2));
System.out.println(xyz.function(2,2));
xyz.function();
	}
   
	
}
