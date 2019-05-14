package com.vtalent.naresh;

public class Constructors_Demo1 {
	int x,y;
	
	Constructors_Demo1(){
		x=5;
		y=7;
	}
	
	Constructors_Demo1(int x){
	this.x=this.x+x;
	y=y+this.x;
	}
Constructors_Demo1(int x,int y){
	this.x=this.x+x;
	y=this.y+y;
}
	
	public static void main(String[] args) {
		Constructors_Demo1 c1=new  Constructors_Demo1();
		Constructors_Demo1 c2=new  Constructors_Demo1(1);
		Constructors_Demo1 c3=new  Constructors_Demo1(1,1);
		System.out.println("C1 Value of x+y:" +(c1.x+c1.y));
		System.out.println("C2 Value of x+y:" +(c2.x+c2.y));
		System.out.println("C3 Value of x+y:" +(c3.x+c3.y));
	}

}
