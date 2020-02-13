package com.vtalent.jhansi.basics;

public class SuperInheritance {
	public static void main(String[] args) {
		Three t1=new Three();
		int k=t1.function(t1.function(2,3));
		float f1=t1.functionOne(k, t1.y);
		System.out.println(k);
		System.out.println(f1);
		System.out.println(t1.f1);
		System.out.println(t1.y);
		System.out.println(t1.x);
	}
	

}
