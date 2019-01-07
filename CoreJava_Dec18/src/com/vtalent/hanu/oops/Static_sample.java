package com.vtalent.hanu.oops;

public class Static_sample {
	
	static int i;
	{
		System.out.println("in nonStatic ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		System.out.println(i);
		Static_sample s1=new Static_sample();
		Static_sample s2= new Static_sample();
	}
	static{
		System.out.println("In static block");
		i=100;
		Static_sample s3= new Static_sample();
	}

}
