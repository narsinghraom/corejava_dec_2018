package com.vtalent.corejava.suma;

public class ConstructorEx {

int x,y;
	ConstructorEx(){
		this(8);
		x=2;
	y=5;
	}
	ConstructorEx(int x){
		this(2,2);
		this.x=this.x+x;
		y=y+x;
	}
	ConstructorEx(int x, int y){
		
	this.x=this.x+x;
	this.y=this.y+y;
	
	}
	public static void main(String[] args){
		ConstructorEx c1 = new ConstructorEx();
		System.out.println(c1.x+c1.y);
		
	}
}