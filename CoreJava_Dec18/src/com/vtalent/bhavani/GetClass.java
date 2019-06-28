package com.vtalent.bhavani;

import java.lang.reflect.Method;

public class GetClass {
	public static void main(String[] args) {

		int Count = 0;
		Object o = new String("bhanu");
		Class c = o.getClass();
		System.out.println("Fully quliied name of class:" + c.getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("method informaion");
		for (Method m1 : m) {
			Count++;
			System.out.println(m1.getName());
		}
		System.out.println("the num of methods:" + Count);

	}
}
