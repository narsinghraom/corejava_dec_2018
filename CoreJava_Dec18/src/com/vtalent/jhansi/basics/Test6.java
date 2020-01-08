package com.vtalent.jhansi.basics;

public class Test6 {
public static void main(String[] args) {
	Two5 t1=new Three5();
	int k=t1.function(2.0);
	k=t1.function(k,k);
	System.out.println(k);
	System.out.println(t1.x+t1.y);
	System.out.println(t1.a);
	One5 o1=new Three5();
	k=o1.function((double)k);
	//k=o1.function(k,k);
	System.out.println(k);
	//System.out.println(o1.x+o1.y);
	System.out.println(o1.a);
	One5 o2=new Two5();
	k=o2.function((double)k);
	//k=o2.function(k,k);
	System.out.println(k);
	//System.out.println(o2.x+o2.y);
	System.out.println(o2.a);
	}
}
