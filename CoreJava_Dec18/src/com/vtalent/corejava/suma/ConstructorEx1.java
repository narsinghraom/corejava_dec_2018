package com.vtalent.corejava.suma;

public class ConstructorEx1 {
	int x,y;
	ConstructorEx1(){
	this(6,7);
		x=2;
	y=5;
	}
	ConstructorEx1(int x){
		 
		this.x=this.x+x;
		y=y+x;
	}
	ConstructorEx1(int x, int y){
	this(5);
	this.x=this.x+x;
	this.y=this.y+y;
	
	}
	public static void main(String[] args){
		ConstructorEx1 c1 = new ConstructorEx1();
		
		System.out.println(c1.x+c1.y);
		
		
	}
}
