package com.vtalent.saritha;

public class Constructordemo {
	int x,y;
	Constructordemo()
	{
		this(5,5);
	}
	Constructordemo(int x){
		this.x=this.x+x;
		y=y+this.x;
	}
	Constructordemo(int x,int y)
	{
		this(x+y);
		this.x=this.x+x;
		this.y=this.y+y;
	}
	public static void main(String []args){
		Constructordemo c1=new Constructordemo();
		Constructordemo c2=new Constructordemo(5);
		Constructordemo c3=new Constructordemo(5,5);
		System.out.println(c1.x+c1.y);
		System.out.println(c2.x+c2.y);
		System.out.println(c3.x+c3.y);
	}
}
