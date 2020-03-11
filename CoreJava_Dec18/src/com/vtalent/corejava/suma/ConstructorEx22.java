 package com.vtalent.corejava.suma;

public class ConstructorEx22 {
	int x,y;
	ConstructorEx22(){
	this(11,11);
		x=2;
	y=5;
	}
	ConstructorEx22(int x){
		this();
		this.x=this.x+x;
		y=y+x;
	}
	ConstructorEx22(int x, int y){
	this.x=this.x+x;
	this.y=this.y+y;
	
	}
	public static void main(String[] args){
		ConstructorEx22 c2 = new ConstructorEx22(10);
		System.out.println(c2.x+c2.y);
		
	}  
}
