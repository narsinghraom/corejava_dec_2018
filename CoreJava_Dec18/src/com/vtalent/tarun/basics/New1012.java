package com.vtalent.tarun.basics;

public class New1012 {

	double d1, d2;
	static New1012 new1012;

	public static New1012 function(double d1, double d2) {
		New1012 s2 = new New1012();
		s2.d1 = s2.d1 + d1;
		s2.d2 = s2.d2 + d2;
		new1012 = s2;
		return s2;

	}

	public double function() {
		d1 = 1.5;
		d2 = 2.5;
		New1012 s3 = function(d1, d2);
		return (s3.d1 + s3.d2);

	}

	public static void main(String[] args) {
		if (null ==  new1012) {
		new1012 = new New1012();
		}
		new1012.d1 =  new1012.function();
			System.out.println(new1012.d1 + new1012.d2);
	}

}
