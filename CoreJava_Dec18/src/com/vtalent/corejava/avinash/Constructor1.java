package com.vtalent.corejava.avinash;

public class Constructor1 {
int x,y;
Constructor1(){
	this(7);
	x=2;
	y=5;
}
Constructor1(int x){
	this(2,3);
	this.x=this.x+x;
	y=y+x;
}
Constructor1(int x,int y){
	this.x=this.x+x;
	this.y=this.y+y;
}
public static void main(String[]args)
{
	Constructor1 c1=new Constructor1();
	System.out.println(c1.x+c1.y);
}
}
