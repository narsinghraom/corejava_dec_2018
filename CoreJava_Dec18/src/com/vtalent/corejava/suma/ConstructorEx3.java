package com.vtalent.corejava.suma;

public class ConstructorEx3 {
	int x,y;
	ConstructorEx3(){
	this(9);
		x=2;
	y=5;
	System.out.println("value of null argument"+"     "+x);
	System.out.println("value of null argument"+"     "+y);
	}
	ConstructorEx3(int x){
		
		this.x=this.x+x;
		y=y+x;
		System.out.println("value of single argument"+"     "+this.x);
		System.out.println("value of single argument"+"     "+this.y);
		System.out.println("value of single argument"+"     "+x);
		System.out.println("value of single argument"+"     "+y);
		
	}
	ConstructorEx3(int x, int y){
	this();
	this.x=this.x+x;
	this.y=this.y+y;
	System.out.println("value of double argument"+"     "+this.x);
	System.out.println("value of double argument"+"     "+this.y);
	System.out.println("value of double argument"+"     "+x);
	System.out.println("value of double argument"+"     "+y);
	
	
	}
	public static void main(String[] args){
		ConstructorEx3 c3 = new ConstructorEx3(2,5);
		System.out.println(c3.x+c3.y);
		
	}
}
