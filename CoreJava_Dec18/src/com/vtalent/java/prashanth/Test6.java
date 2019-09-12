package com.vtalent.java.prashanth;

public class Test6 {

	public static void main(String[] args) {
		Third3 t1=new Third3();
		int k=t1.function(5);
		k=t1.function(k, k);
		System.out.println(k);
		System.out.println(t1.x+t1.y);
		Second2 s1=new Third3();
		k=s1.function(k);
		k=s1.function(k,k);
		System.out.println(k);
		System.out.println(s1.x+s1.y);
		First1 f1=new Third3();
		k=f1.function(k);
		//k=f1.function(k,k);
		System.out.println(k);
		System.out.println(f1.x+f1.y);
	}

}
