package com.vtalent.rakesh;

public class Static {
	int i, j;
	static float f1, f2;

	public void functionOne() {

		i = 5;
		j = 7;
	}

	public static int functionTwo(float f1) {
		Static.f1 = f1 + Static.f1;
		f2 = Static.f1 + f2;
		return (int) f1;
	}

	public static void main(String[] args) {

		Static rak = new Static();

		rak.functionOne();
		int k = functionTwo((float) rak.i);

		System.out.println(k);
		System.out.println(rak.i + rak.j);
		System.out.println(f1 + f2);

	}

}
