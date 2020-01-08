package com.vtalent.jhansi.basics;

public class Test2 {
	public static void main(String[] args) {
		First1 f = new First1();
		f.function(5);
		System.out.println(f.i);
		System.out.println(f.j);
		Second2 s = new Second2();
		s.function(3);
		s.function(f.i, f.j);
		System.out.println(s.i);
		System.out.println(s.j);

	}
}
