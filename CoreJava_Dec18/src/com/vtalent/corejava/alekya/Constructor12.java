package com.vtalent.corejava.alekya;

public class Constructor12 {
	int x,y;
	Constructor12(){
		x=2;
		y=5;
		System.out.println("value of no argument x"+"     "+x);
		System.out.println("value of no argument y"+"     "+y);
	}
	Constructor12(int x){
		this();
		this.x=this.x+x;
		y=y+x;
		System.out.println("value of single argument x"+"     "+this.x);
		System.out.println("value of single argument y"+"     "+this.y);
		System.out.println("value of single argument x"+"     "+x);
		System.out.println("value of single argument y"+"     "+y);
	}
	Constructor12(int x, int y)
	{
		this(1);
		System.out.println("value of double argument"+"     "+(this.x +y));
		this.x=this.x+x;
		this.y=this.y+y;
		System.out.println("value of double argument x"+"     "+x);
		System.out.println("value of double argument y"+"     "+y);
		System.out.println("value of double argument y"+"     "+this.y);
		System.out.println("value of double argument y"+"     "+this.x);
		
	}
	public static void main(String[] args){
		Constructor12 c3= new Constructor12(10,15);
		System.out.println(c3.x+c3.y);
		
	}
	

}
