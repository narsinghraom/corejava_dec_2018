package com.vtalent.java.mahesh;

public class Basic {
	int i, j;
	static float f1, f2;

	public void functionOne() {
	i = 5;
	j = 7;
	}

	public static int functionTwo(float f1) {
	Basic.f1 = f1 + Basic.f1;
	f2 = Basic.f1 + f2;
	return (int) f1;
	}
	public static void main(String[] args) {
	Basic obj = new Basic();
	obj.functionOne();
	int k = functionTwo((float) obj.i);
	System.out.println(obj.i + obj.j);
	System.out.println(f1 + f2);
}
}