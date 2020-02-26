package com.vtalent.saikrishna;

public class StaticInstanceSample {

	public static float function(float a,float b)
	{

	return a+b;
	}
	public int function2(int c)
	{
		
	return c;
	}
		
	public static void main(String []a)
	{
	StaticInstanceSample si=new StaticInstanceSample();
	System.out.println(si.function2(30));
	float d=StaticInstanceSample.function(1.5f, 2.0f);
	System.out.println(d);
		
	}


}
