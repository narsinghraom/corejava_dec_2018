package com.vtalent.java.prashanth;

public class ConstructorEx {

	int i, j;

	ConstructorEx() {
		this(3, 5);
		i = 5;
		j = 7;
	}

	ConstructorEx(int i) {
		this();
		this.i = this.i + i;// 7
		j = j + this.i;// 14
	}

	ConstructorEx(int i, int j) {
		this.i = this.i + i;
		this.j = this.j * j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ConstructorEx e1=new ConstructorEx();
		ConstructorEx e2 = new ConstructorEx(2);
		// ConstructorEx e3=new ConstructorEx(3,5);
		// System.out.println(e1.i+e1.j);
		System.out.println(e2.i + e2.j);// 21
		// System.out.println(e3.i+e3.j);
	}

}
