package com.vtalent.vijaya.basic;

public class Sample3 {
	double d1,d2;
	static Sample3 sample3;
	public static Sample3 function(double d1,double d2) {
		Sample3 s2=new Sample3();
		s2.d1=s2.d1+d1;
		s2.d2=s2.d2+d2;
		//sample3=s2;
		return s2;
		}
	public double function() {
		d1=1.5;
		d2=2.5;
		Sample3 s3=function(d1,d2);
		return s3.d1+s3.d2;
	}
	public static void main(String[] args) {
		if(null==sample3) {
			sample3=new Sample3();
		}
		sample3.d1=sample3.function();
		System.out.println(sample3.d1+sample3.d2);
		System.out.println(sample3);
	}

}
