package com.vtalent.hanu.oops;
public class Polymarphism_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1= new Sample();
		s1.function(1.5f,1.5f);
		s1.function(25);
		System.out.println(s1.f1);
		System.out.println(s1.f2);
		
		SampleOne s2= new SampleOne();
		s2.function(1.5f,1.5f);
		s2.function(25);
		System.out.println(s2.f1);
		System.out.println(s2.f2);
		System.out.println(s2.l2);
		
		Sample s3=new SampleOne();
		s3.function(1.5f,1.5f);
		s3.function(25);
		s3.function('A');
		System.out.println(s3.f1);
		System.out.println(s3.f2);
		//System.out.println(s3.l2);
	}

}
