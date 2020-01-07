package com.vtalent.suma3;

public class ThisExample1 {
	int x,y;
	ThisExample1(){
		x=5;
		y=7;
	
	}
ThisExample1(int x)
{
	this(2,3);
	this.x=this.x+x;
	y=x+y;
}
ThisExample1(int x, int y)
{
	this ();
	this.x=this.x+x;
	this.y=this.y+y;
}
public static void main(String [] args) {
	/*ThisExample1 t1 = new ThisExample1();
	System.out.println(t1.x);
	System.out.println(t1.y);
	
	ThisExample1 t2 = new ThisExample1(5);
	System.out.println(t2.x);
	System.out.println(t2.y);*/
	
	ThisExample1 t3 = new ThisExample1(5,6);
	System.out.println(t3.x);
	System.out.println(t3.y);
}
}
