package com.vtalent.corejava.avinash;

public class ConstructorEx {
	int x,y;
	ConstructorEx(){
	x=2;
	y=5;
	}
ConstructorEx(int x){
	this();
	this.x=this.x+x;
	y=y+x;
}
ConstructorEx(int x,int y)
{
	this(x+y);
	this.x=this.x+x;
	this.y=this.y+y;
}
public static void main(String[]args) {
	ConstructorEx c3=new ConstructorEx(2,5);
	System.out.println(c3.x+c3.y);
}
}
