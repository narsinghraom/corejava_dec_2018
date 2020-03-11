package com.vtalent.corejava.alekya;

public class Const21 {
	int x,y;
	Const21(){
		x=2;
		y=5;
	System.out.println("value of no argument x"+"     "+x);
		System.out.println("value of no argument y"+"     "+y);
}
	Const21(int x){
	this(1,1);
	System.out.println("value of single argument x"+"     "+x);
		
		this.x=this.x+x;
		
		y=y+x;
		System.out.println(this.x);
		System.out.println("value of single argument this.x"+"     "+x);
		System.out.println("value of single argument y"+"     "+y);
	}
	Const21(int x, int y){
	this();
	
		System.out.println("value of double argument x"+x);
		System.out.println("value of double argument y"+y);
		this.x=this.x+x;
		this.y=this.y+y;
		
		System.out.println("value of double argument x"+this.x);
		System.out.println("value of double argument y"+this.y);
	}
	public static void main(String[] args){
		Const21 c2= new Const21(10);
		System.out.println(c2.x+c2.y);
		

}
}