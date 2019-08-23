package com.vtalent.java.mahesh;
public class Typecasting {
	public static void main(String arg[]) 
	{
	        byte b;
	        int i = 100;
	        double d = 234.142;
	        float f = 87.38f;
	        char c = 'A';
	        
	        c = (char) i;
	        System.out.println("i = " + i + " c = " + c);
	        i = (int) d;
	        System.out.println("d = " + d + " i = " + i);
	        i = (int) f;
	        System.out.println("f = " + f + " i = " + i);
	        b = (byte) d;
	        System.out.println("d = " + d + " b = " + b);
	    
	    }
}
