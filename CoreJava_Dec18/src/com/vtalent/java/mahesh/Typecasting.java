package com.vtalent.java.mahesh;
public class Typecasting {
	public static void main(String arg[]) 
	{
	        byte b;
	        int i = 100;
	        double d = 234.142;
	        float f = 87.38f;
	        char c = 'A';
	        boolean s=true;
	        long l=467;
	        short g=567;
	        //s=(boolean)d; double to boolean casting not possible
	        //double
	        {
	        i = (int) d;
        	System.out.println("d = " + d + " i = " + i);//double to integer
        	f=(float)d;
        	System.out.println("d = " + d + " f = " + f);//double to float
        	b=(byte)d;
        	System.out.println("d = " + d + " b = " + b);//double to byte
        	c=(char)d;
        	System.out.println("d = " + d + " c = " + c);//double to char
        	l=(long)d;
        	System.out.println("d = " + d + " l = " + l);//double to long
        	g=(short)d;
        	System.out.println("d = " + d + " g = " + g);//double to short
	        }
        	//long
	        {
	        	
        	i=(int)l;
        	System.out.println("l = " + l + " i = " + i);//long to integer
        	f=(float)l;
        	System.out.println("l = " + l + " f = " + f);//long to float
        	b=(byte)l;
        	System.out.println("l = " + l + " b = " + b);//long to byte
        	c=(char)l;
        	System.out.println("l = " + l + " c = " + c);//long to char
        	g=(short)l;
        	System.out.println("l = " + l + " g = " + g);//long to short
	        }
        	//float
	        {
        	i=(int)f;
        	System.out.println("f = " + f + " i = " + i);//float to integer
        	g=(short)f;
        	System.out.println("f = " + f + " g = " + g);//float to short
        	c=(char)f;
        	System.out.println("f = " + f + " c = " + c);//float to char
        	b=(byte)f;
        	System.out.println("f = " + f + " b = " + b);//float to byte
	        }
        	//integer
	        {
	        b=(byte)i;
	        System.out.println("i = " + i + " b = " + b);
	        c=(char)i;
	        System.out.println("i = " + i + " c = " + c);
	        g=(short)i;
	        System.out.println("i = " + i + " g = " + g);
	        }
        	//short
	        b=(byte)g;
	        System.out.println("g = " + g + " b = " + b);
        	//char
	    }
}