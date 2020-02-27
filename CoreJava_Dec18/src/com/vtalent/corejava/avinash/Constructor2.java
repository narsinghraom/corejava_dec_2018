package com.vtalent.corejava.avinash;
public class Constructor2 {
int x,y;
Constructor2()
{
	this(3,8);
	x=2;y=5;
}
Constructor2(int x){
	this();
	this.x=this.x+x;
	y=y+y;
}
Constructor2(int x,int y){
	this.x=this.x+x;
	this.y=this.y+y;
}
public static void main(String[]args)
{
	Constructor2 c1=new Constructor2(5);
	System.out.println(c1.x+c1.y);
}
}

