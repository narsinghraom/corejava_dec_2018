package com.vtalent.sampath;

public class Polymorphism {






	public static void main(String[] args) {
		
		Poly1 p1=new Poly1();
		Poly2 p2=new Poly2();
		Poly3 p3=new Poly3();
		Poly1 p4=new Poly3();
		

		float f1=p1.function(2.5f, 1.5f);
		p1.function((long)f1);
		p1.function(f1);
		p1.function();

       
		System.out.println(p1.f1);
        System.out.println(p1.f2);
		

	}

}
