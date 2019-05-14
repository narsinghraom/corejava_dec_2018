package com.vtalent.saichand;

public class prog1 {
	int i, j;
	static float f1, f2;

	public void functionOne() {
		i = 5;
		j = 7;
	}

	public static int functionTwo(float f1) {
		prog1.f1 = f1 + prog1.f1;
		f2 = prog1.f1 + f1;
		return (int) f1;
	}

	public static void main(String[] args) {
		prog1 Prog1 = new prog1();
		Prog1.functionOne();
		int k = functionTwo((float) Prog1.i);
		System.out.println(k);
		System.out.println(Prog1.i + Prog1.j);
		System.out.println(f1 + f2);
	}
}
