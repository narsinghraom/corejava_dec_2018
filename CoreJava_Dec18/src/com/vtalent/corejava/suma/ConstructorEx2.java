package com.vtalent.corejava.suma;

public class ConstructorEx2 {
	int x,y;
	ConstructorEx2(){
	x=2;
	y=5;
	}
	ConstructorEx2(int x){
		this(1,1);
		this.x=this.x+x;
		y=y+x;
	}
	ConstructorEx2(int x, int y){
	this();
	this.x=this.x+x;
	this.y=this.y+y;
	
	}
	public static void main(String[] args){
		ConstructorEx2 c2 = new ConstructorEx2(10);
		System.out.println(c2.x+c2.y);
		
	}  
}
