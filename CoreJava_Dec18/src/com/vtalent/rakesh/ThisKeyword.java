package com.vtalent.rakesh;

public class ThisKeyword {
	double d1, d2;

	public long function(double d1, double d2) {

		d1 = d1 + d2;
		this.d2 = this.d1 + d2;
		System.out.println(this.d1);
		System.out.println(d1);
		return (long) ((long) d1 + d2);

	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		ThisKeyword obj1 = new ThisKeyword();
		obj.function(10.0, 15.0);
		System.out.println(obj.d1 + obj.d2);
		System.out.println(obj);
		System.out.println(obj1);

	}
}
