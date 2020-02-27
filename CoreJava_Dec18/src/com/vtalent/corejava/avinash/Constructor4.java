package com.vtalent.corejava.avinash;

public class Constructor4 {
	int x,y;
	Constructor4(){
		x=3;
		y=8;
	}
	Constructor4(int x){
		this(7,9);
		this.x=this.x+x;
		y=y+x;
	}
	Constructor4(int x,int y){
		this();
		this.x=this.x+x;
		this.y=this.y+y;
	}
public static void main(String[]args) {
	Constructor4 c1=new Constructor4(5);
	System.out.println(c1.x+c1.y);
}
}
