package com.vtalent.mallikarjun.basics;

public class Poly3 extends Poly2 {
int x,y;
public void function() {
	System.out.println("poly3 function with out arg");
	x=10;
	y=20;
	System.out.println(this.x+" "+this.y);
}
public void function(int x) {
	System.out.println("poly3 function with one arg");
	this.x=x+this.x;
	y=x;
	System.out.println(this.x+" "+this.y);
}
public void function(int x,int y) {
	System.out.println("poly3 function with 2 arg");
	this.x=this.x+x;
	this.y=this.y+y;
	System.out.println(this.x+" "+this.y);
}
}
