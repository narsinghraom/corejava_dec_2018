package com.vtalent.sathyam.basics;

public class ThisExample1 {
	int x,y;
	ThisExample1()
	{
		this(2);
		x=5;
		y=7;
	}
	ThisExample1(int x) {
		this.x=this.x+x;
		y=x+y;
	}
	
	
	
	

	ThisExample1(int x,int y)
	{
	this();

	{

		this.x=this.x+x;
		this.y=this.y+y;
}
}
public static void main(String[] args) {

	ThisExample1 t3=new ThisExample1(5,6);
	
	System.out.println(t3.x);
	System.out.println(t3.y);
}
	}
	
	


