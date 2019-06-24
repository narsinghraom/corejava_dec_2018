package com.vtalent.rakesh;

public class Poly1 {

	float f1, f2;

	Poly1() {
		f1 = 1.5f;
		f2 = 6.5f;
	}

	public void function(float f1) {
		this.f1 = f1 + f1;
		f2 = this.f1 + f1;
		System.out.println("poly1");

	}

	public float function(float f1, float f2) {
		this.f1 = this.f1 + f1;
		this.f2 = this.f2 + f2;
		System.out.println("poly1");
		return (int) (f1 + f2);
	}

	public void function() {
		System.out.println("f1  " + f1);
		System.out.println("f2  " + f2);
		System.out.println("poly1");
	}

}
