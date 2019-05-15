package com.vtalent.rakesh;

import java.util.Scanner;

/**
 * 
 * @author Admin
 * 
 */
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

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Static obj = new Static();
		// obj.functionOne();
		int k = functionTwo((float) obj.i);
		obj.functionOne();
		System.out.println(obj.i + obj.j);
		System.out.println(f1 + f2);

	}

}
