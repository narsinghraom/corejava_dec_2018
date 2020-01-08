package com.vtalent.jhansi.basics;

public class Test3{
	public static void main(String[] args) {
		PolyOne p1=new PolyTwo();
		int k=p1.function(2.0);
		//k=p1.function((double)k,(double)k);
		double d1=p1.function(k,k);
		System.out.println(d1);
		System.out.println(k);
		System.out.println(p1.a);
		System.out.println(p1.b);
	}

}
