package com.vtalent.corejava.alekya;

public class ConstructorExample2 {
	int x,y;
	ConstructorExample2(){
		x=2;
		y=5;
		System.out.println("value of no argument x"+"     "+this.x);
		System.out.println("value of no argument x"+"     "+this.y);
		System.out.println("value of no argument x"+"     "+x);
		System.out.println("value of no argument x"+"     "+y);
	}
	ConstructorExample2(int x){
		this();
		this.x=this.x+x;
		y=y+x;
		System.out.println("value of single argument x"+"     "+this.x);
		System.out.println("value of single argument x"+"     "+y);
	}
	ConstructorExample2(int x, int y)
	{
		this(8);
		this.x=this.x+x;
		this.y=this.y+y;
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] args){
		ConstructorExample2 c3= new ConstructorExample2(9,6);
		System.out.println(c3.x+c3.y);
		
	}
	

}

 