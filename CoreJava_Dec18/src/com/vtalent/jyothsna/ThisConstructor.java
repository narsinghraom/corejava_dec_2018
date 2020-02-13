package com.vtalent.jyothsna;

public class ThisConstructor {
int x,y;

	public ThisConstructor() {
		this(5);
	x=5;
	y=7;
	
}

	public ThisConstructor(int x) {
	this(5,6);
	this.x = x+this.x;
	y=x+y;
}

	public ThisConstructor(int x, int y) {
	this.x = x+this.x;
	this.y = y+this.y;
}

	public static void main(String[] args) {
		ThisConstructor t=new ThisConstructor();
		System.out.println(t.x+"  "+t.y);

	}

}


