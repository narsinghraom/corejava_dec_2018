package com.vtalent.bharathi.basics;

public class Sample1 {
	int a,b;
		static int c;
		public static void main(String[] args) {
			c=10;
			Sample1 S1 = new Sample1();
			S1.function(c);
			System.out.println(S1.a+S1.b+c);
						
		}
public void function(int c) {
	a = c;
	b = c+5;
	
}
}
