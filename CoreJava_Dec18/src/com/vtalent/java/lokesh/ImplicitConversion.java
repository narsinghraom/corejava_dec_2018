package com.vtalent.java.lokesh;

public class ImplicitConversion {
	public void m1() { 
double d =83.09;
	
	long l = (long)d;
	float f =(float)l;
	int i =(int)f;
	
	System.out.println("the value of double"+d);
	System.out.println("the value of long"+l);
	System.out.println("the value of float"+f);
	System.out.println("the value of int"+i);
	
	}
}