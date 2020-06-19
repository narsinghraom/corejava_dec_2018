package com.vtalent.tarun.basics;

public class NewCode {

	static int a, b; 
	float f1, f2; 

	public int function(float f1, float f2) { //1.5 ,2.5
		this.f1 = this.f1 + f1; //0+1.5 =1.5
		this.f2 = this.f2 + f2; //0+2.5=2.5

		a = (int) (this.f1); // 1
		b = (int) (this.f2); //2
		return a + b; //3
	}

	public static float function(int a, int b) { //3,5
		a = NewCode.a + a; // 0+ 3 = 3
		b = NewCode.b + b; // 0 + 5 = 5
		return a + b; //8
	}

	public static void main(String[] args) {
		NewCode t1 = new NewCode();
		t1.f1 = 1.5f;
		t1.f2 = 2.5f;
		a = t1.function(t1.f1, t1.f2); //3
		t1.f2 = function(a, a + 2); //8.0f 
		System.out.println(a + b); //3
		System.out.println(t1.f1 + t1.f2); //1.5+8.0 = 9.5
	}

}
