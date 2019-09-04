package com.vtalent.java.naveen;

public class Demo1 {
	int x, y;
	static float f1, f2;

	public int function(int x, int y) {
		this.x = this.x + x;  
		this.y = this.y * y;
		return this.x + this.y;
	}

	public static float function(float f1) {
		Demo1 tk = new Demo1();
		f1 = f1 + tk.function(2, 3);
		tk.f2 = f1;
		return f1;
	}

	public static void main(String[] args) {
		Demo1 da = new Demo1();
		da.f1 = da.function(1.5f);
		System.err.println(f1 + f2);
		System.out.println(da.x + da.y);

	}

}
