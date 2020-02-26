package com.vtalent.corejava.saumyaranjandash;

public class ThisKeyWordExp {
	int a;
	int b;

	public void setData(int a, int b) {
		this.a = a + this.b;
		this.b = b;
	}

	public void showData() {
		System.out.println("Value of A =" + a);
		System.out.println("Value of B =" + b);
	}

	public static void main(String args[]) {
		ThisKeyWordExp obj = new ThisKeyWordExp();
		obj.setData(2, 3);
		obj.showData();
	}

}
