package com.vtalent.amreen;

import java.util.Scanner;
import java.util.*;
/**
 * 
 * @author Admin
 * 
 */
public class Basic1 {
	int i, j;
	static float f1, f2;

	public void functionOne() {
		i = 5;
		j = 7;
	}

	public static int functionTwo(float f1) {
 Basic1.f1 = f1 + Basic1.f1;
		f2 = Basic1.f1 + f2;
		return (int) f1;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Basic1 obj = new Basic1();
		//obj.functionOne();
		int k = functionTwo((float) obj.i);
		obj.functionOne();
		System.out.println(obj.i + obj.j);
		System.out.println(f1 + f2);

	}

}
