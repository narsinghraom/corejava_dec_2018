package com.vtalent.mohammad;

public class Sample2 {
	double d1,d2;
	static Sample2 sample2;
	public static Sample2 function(double d1, double d2)
	{
		Sample2 s2 =new Sample2();
		s2.d1=s2.d1+d1;
		s2.d2=s2.d2+d2;
		
		return s2;
	}
	public double function()
	{
		d1=1.5;
		d2=2.5;
		Sample2 s3=function(d1,d2);
		return s3.d1+s3.d2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(null==sample2)
		{
			sample2= new Sample2();
		}
		sample2.d1=sample2.function();
		System.out.println(sample2.d1+sample2.d2);
	}

}
