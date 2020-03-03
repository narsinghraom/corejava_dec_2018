package com.vtalent.corejava.alekya;

public class Const12 {
	int x,y;
	Const12(){
		this(12);
		x=2;
		y=5;
		System.out.println("value of no argument x"+"     "+x);
		System.out.println("value of no argument y"+"     "+y);
	}
	Const12(int x){
		this(5,5);
		this.x=this.x+x;
		y=y+x;
		System.out.println("value of single argument x"+"     "+this.x);
		System.out.println("value of single argument y"+"     "+this.y);
		System.out.println("value of single argument x"+"     "+x);
		System.out.println("value of single argument y"+"     "+y);
	}
	Const12(int x, int y)
	{

		System.out.println("value of double argument"+"     "+(this.x +y));
		this.x=this.x+x;
		this.y=this.y+y;
		System.out.println("value of double argument x"+"     "+x);
		System.out.println("value of double argument y"+"     "+y);
		System.out.println("value of double argument y"+"     "+this.y);
		System.out.println("value of double argument y"+"     "+this.x);
		
	}
	public static void main(String[] args){
		Const12 c2= new Const12();
		System.out.println(c2.x+c2.y);
	}
	

}



