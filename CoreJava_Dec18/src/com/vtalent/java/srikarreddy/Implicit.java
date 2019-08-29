package com.vtalent.java.srikarreddy;

public class Implicit {
	public void m1() {
	 byte i=100;                    
	    short j = i;
	    int k = j;
	    long l = k;
	    float m = l;
	    double n = m;
	    System.out.println("byte value : "+i);
	    System.out.println("short value : "+j);
	    System.out.println("int value : "+k);
	    System.out.println("long value : "+l);
	    System.out.println("float value : "+m);
	    System.out.println("double value : "+n);
		
	}
	  
	public static void main(String[] args) {
		Implicit r=new Implicit();
		r.m1();
	 
	}
}
 
 
