package com.vtalent.corejava.suma;

public class ConstructorEx33 {
	int x,y;
	ConstructorEx33(){
	x=2;
	y=5;
	}
	ConstructorEx33(int x){
		this();
		this.x=this.x+x;
		y=y+x;
	}
	ConstructorEx33(int x, int y){
	this(x+y);
	this.x=this.x+x;
	this.y=this.y+y;
	
	}
	public static void main(String[] args){
		ConstructorEx33 c3 = new ConstructorEx33(2,5);
		System.out.println(c3.x+c3.y);
		
	}
}
