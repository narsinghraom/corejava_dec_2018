package com.vtalent.suma3;

public class ThisExample1 {
	int x,y;
	ThisExample1(){
		x=5;
		y=7;
	
	}
ThisExample1(int x){
	this.x=this.x+x;
	y=x+y;
}
ThisExample1(int x, int y){
	this.x=this.x+x;
	this.y=this.y+y;
}
public static void main(String [] args) {
	ThisExample1 t1 = new ThisExample1();
	System.out.println();
}
}
