package com.vtalent.saichand;

public class Abc1 {
	static float f1, f2;
	int i, j;

	Abc1() {
		i = 5;
		j = 7;
	}

	public int function(int i) {
		this.i = i * this.i;
		return i + this.j;
	}

	public float function(int i, int j) {
		this.i = this.i + i;
		this.j = this.j + j;
		System.out.println(this.i);
		System.out.println(this.j);
		f1 = i;
		f2 = j;
		System.out.println(f1);
		System.out.println(f2);

		return f1 + f2;
	}

}
