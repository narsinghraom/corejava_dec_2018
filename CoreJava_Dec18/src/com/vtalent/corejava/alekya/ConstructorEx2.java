package com.vtalent.corejava.alekya;

public class ConstructorEx2 {
	int x,y;
	ConstructorEx2(){
		this(11,11);
		x=2;
		y=5;
	System.out.println("value of no argument x"+"     "+x);
		System.out.println("value of no argument y"+"     "+y);
}
	ConstructorEx2(int x){
	this();
	System.out.println("value of single argument x"+"     "+x);
		
		this.x=this.x+x;
		
		y=y+x;
		System.out.println(this.x);
		System.out.println("value of single argument this.x"+"     "+x);
		System.out.println("value of single argument y"+"     "+y);
	}
	ConstructorEx2(int x, int y)
	{
		System.out.println("value of double argument x"+x);
		System.out.println("value of double argument y"+y);
		this.x=this.x+x;
		this.y=this.y+y;
		
		System.out.println("value of double argument x"+this.x);
		System.out.println("value of double argument y"+this.y);
	}
	public static void main(String[] args){
		ConstructorEx2 c2= new ConstructorEx2(10);
		System.out.println(c2.x+c2.y);
		
	}
	


}
