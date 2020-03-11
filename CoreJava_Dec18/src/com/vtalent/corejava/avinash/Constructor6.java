package com.vtalent.corejava.avinash;

public class Constructor6 {
	int x,y;
	Constructor6(){
		this(1);
		x=2;
		y=5;
	}
	Constructor6(int x){
		this(3,3);
		this.x=this.x+x;
	}
	Constructor6(int x,int y){
		this.x=this.x+x;
		this.y=this.y+y;
	}
	public static void main(String[]args) {
		Constructor6 c1=new Constructor6();
		System.out.println(c1.x+c1.y);
	}

}
