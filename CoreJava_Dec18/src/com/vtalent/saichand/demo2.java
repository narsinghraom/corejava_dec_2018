package com.vtalent.saichand;

import java.util.Scanner;

public class demo2 {
	int i, j;
	static float f1, f2;

	public void functionOne() {

		i = 5;
		j = 7;

	}

	public static int functiontwo(float f1) {
		demo2.f1 = f1 + demo2.f1;
		f2 = demo2.f1 + f2;
		return (int) f1;
	}

	public static void main(String[] args) {
		demo2 demo = new demo2();
		demo.functionOne();
		int k = functiontwo((float) demo.i);
		System.out.println(k);
		System.out.println(demo.i + demo.j);
		System.out.println(f1 + f2);
		Scanner sc = new Scanner(System.in);

	}
}