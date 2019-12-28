package com.vtalent.mallikarjun.basics;

public class Poly2 extends Poly1 {
	int x;
	public void function() {
		System.out.println("poly2 function with no arg");
		x=10;
		System.out.println(this.x);
		
	}
	public void function(int x) {
		System.out.println("poly2 function with one arg");
		this.x=this.x+x;
		System.out.println(this.x);
	}

}
