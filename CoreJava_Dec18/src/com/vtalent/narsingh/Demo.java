package com.vtalent.narsingh;

import java.util.Scanner;

/**
 * 
 * @author TOSHIBA
 *
 */
public class Demo {
	int i, j;
	static float f1, f2;

	public void functionOne() {
		i = 5;
		j = 7;
	}

	/**
	 * 
	 * @param f1
	 * @return
	 */

	public static int functionTwo(float f1) {
		Demo.f1 = f1 + Demo.f1;
		f2 = Demo.f1 + f1;
		return (int) f1;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		Scanner sc = new Scanner(System.in);
		demo.functionOne();
		int k = functionTwo((float) demo.i);
		System.out.println("k");
		System.out.println(demo.i + demo.j);
		System.out.println(f1 + f2);
	}

}
