package com.vtalent.shiva;

public class Test {
	public static void main(String[] args) {
		PolyTwo p2=new PolyTwo();
		int k=p2.function(2.0);
		k=p2.function((double)k, (double)k);
		double d1=p2.function (k+k);
	    System.out.println(d1);
		System.out.println(k);
		System.out.println(p2.a);
		System.out.println(p2.b);
	}

}
