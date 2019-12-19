package com.vtalent.bharathi.basics;

public class Sample2 {
	int a,b,d;
		public void function(int c) {
		a =c;
		b = c+5;
		d = a+b;		
	}
	public static void main(String[] args) {
		c = 15;
		Sample2 sampRef = new Sample2();
		sampRef.function(c);
		System.out.println(sampRef.a+sampRef.b+sampRef.d+c);
		
	}
	static int c;

}
