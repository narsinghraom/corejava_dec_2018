package com.vtalent.java.prashanth;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PolyOne p1=new Polytwo();
		Polytwo p1=new Polytwo();
		int k=p1.function(2.0);
		k=p1.function((double)k,(double)k);
		double d1=p1.function(k,k,k);
		System.out.println(d1);
		System.out.println(k);
		System.out.println(p1.a);
		System.out.println(p1.b);

	}

}
