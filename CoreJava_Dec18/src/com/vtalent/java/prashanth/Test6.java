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
		First1 f2=new Second2();
		k=f2.function(k);
		//k=f2.function(k,k); signature not there so error.
		System.out.println(k);
		System.out.println(f2.x+f2.y);
		First1 f3 = new First1();
		k=f3.function(k);
		//k=f2.function(k,k); signature not there so error.
		System.out.println(k);
		System.out.println(f3.x+f3.y);
		Second2 f4=new Second2();
		//k=f4.function(k);error
		//k=f2.function(k,k); signature not there so error.
		System.out.println(k);
		//System.out.println(f4.x+f4.y);error
		
		
	}

}
