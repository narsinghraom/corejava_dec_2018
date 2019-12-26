package com.vtalent.mallikarjun.basics;

public class ThisConstructor1 {
int x,y;

	public ThisConstructor1() {
		//this(5);
	x=5;
	y=7;
	
}

	public ThisConstructor1(int x) {
	this(5,6);
	this.x = x+this.x;
	y=x+y;
}

	public ThisConstructor1(int x, int y) {
		this();
	this.x = x+this.x;
	this.y = y+this.y;
}

	public static void main(String[] args) {
		ThisConstructor1 t=new ThisConstructor1(5);
		System.out.println(t.x+"  "+t.y);

	}

}
