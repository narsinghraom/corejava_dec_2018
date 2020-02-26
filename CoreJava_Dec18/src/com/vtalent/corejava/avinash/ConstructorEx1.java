package com.vtalent.corejava.avinash;

public class ConstructorEx1 {
	int x,y;
	ConstructorEx1(){
		x=2;
		y=5;
			}
	ConstructorEx1(int x){
		this.x=this.x+x;
		y=y+x;
	}
	ConstructorEx1(int x,int y){
		this.x=this.x+x;
		this.y=this.y+y;
		}
	public static void main(String[]args) {
	ConstructorEx1 c1=new ConstructorEx1();
	System.out.println(c1.x+c1.y);
	ConstructorEx1 c2=new ConstructorEx1(5);
	System.out.println((c2.x+c2.y));
	ConstructorEx1 c3=new ConstructorEx1(2,5);
	System.out.println(c3.x+c3.y);
	}
}