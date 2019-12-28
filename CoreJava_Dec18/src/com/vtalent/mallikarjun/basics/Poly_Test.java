package com.vtalent.mallikarjun.basics;



public class Poly_Test {
	public static void main(String[] args) {
		
		Poly3 p3=new Poly3();
		p3.function();
		p3.function(5);
		p3.function(p3.x,p3.y);
		System.out.println(p3.x+" "+p3.y);
	
		System.out.println("poly3 completed");
		
		Poly2 p2=new Poly3();
		p2.function();
		p2.function(5);
		p2.function(p2.x,p2.y);
		System.out.println(p2.x+" "+p2.y);
	
		System.out.println("poly2 completed");
		
		Poly1 p1=new Poly3();
		//p1.function();
		p1.function(2);
		p1.function(5,6);
		System.out.println(p1.x+" "+p1.y);
		
		System.out.println("poly1 completed");
		System.out.println(p2.x+" "+p2.y);

		System.out.println(p3.x+" "+p3.y);

	
	}

}
