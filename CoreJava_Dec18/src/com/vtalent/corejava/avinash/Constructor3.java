package com.vtalent.corejava.avinash;

public class Constructor3 {
	int x,y;
	Constructor3(){
		this(3,8);
		x=2;
		y=5;
	}
	Constructor3(int x){
		this.x=this.x+x;
		y=y+x;
	}
	Constructor3(int x,int y){
		this(7);
		this.x=this.x+x;
		this.y=this.y+y;
	}
	public static void main(String[]args) {
		Constructor3 c1=new Constructor3();
		System.out.println(c1.x+c1.y);
	}
}
