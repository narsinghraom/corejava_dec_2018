package com.vtalent.saikrishna;

public class InstanceMethodSample {
	int a;
	float b;
	 
	public void method()//method inside a method
	{
	int b=method2(10,20);
		
	System.out.println(b);
	}
	public static int method2(int c,int d)
	{

		return c+d;
	}
	public static void main(String []a)
	{
		InstanceMethodSample im=new InstanceMethodSample();
		im.method();

	}

		
		
		
		
		
		
		
		
		
		
		
	}


