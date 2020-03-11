package com.vtalent.corejava.alekya;


public class Constructor123 {
	int x,y;
	Constructor123(){
		this(1);
		x=2;
		y=5;
		System.out.println("value of no argument x"+"     "+x);
		System.out.println("value of no argument y"+"     "+y);
	}
	Constructor123(int x){
		this.x=this.x+x;
		y=y+x;
		System.out.println("value of single argument x"+"     "+this.x);
		System.out.println("value of single argument y"+"     "+this.y);
		System.out.println("value of single argument x"+"     "+x);
		System.out.println("value of single argument y"+"     "+y);
	}
	Constructor123(int x, int y)
	{
		this();
		System.out.println("value of double argument"+"     "+(this.x +y));
		this.x=this.x+x;
		this.y=this.y+y;
		System.out.println("value of double argument x"+"     "+x);
		System.out.println("value of double argument y"+"     "+y);
		System.out.println("value of double argument y"+"     "+this.y);
		System.out.println("value of double argument y"+"     "+this.x);
		
	}
	public static void main(String[] args){
		Constructor123 c2= new Constructor123(1,2);
		System.out.println(c2.x+c2.y);
	}
	

}


