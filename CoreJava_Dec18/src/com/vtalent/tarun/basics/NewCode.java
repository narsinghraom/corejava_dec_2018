package com.vtalent.tarun.basics;

public class NewCode {

	static int a, b;
	float f1, f2;

	public int function(float f1, float f2) {
		this.f1 = this.f1 + f1;
		this.f2 = this.f2 + f2;

		a = (int) (this.f1);
		b = (int) (this.f2);
		return a + b;
	}

	public static float function(int a, int b) {
		a= NewCode.a  + a;
		b=NewCode.b+ b;
		return a+b;
	}

	public static void main(String[] args) {
		NewCode t1 = new NewCode();
		t1.f1 = 1.5f;
		t1.f2 = 2.5f;
		a = t1.function(t1.f1, t1.f2);
		t1.f2 = function(a, a + 2);
		System.out.println(a + b);
		System.out.println(t1.f1 + t1.f2);
	}

}
