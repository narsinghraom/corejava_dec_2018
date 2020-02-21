package com.vtalent.corejava.siva;

public class Sampleone {
	static int x,y;
	public static int method(int x,int y)
	{
		x=x+y;
		y=x+y;
		Sampleone.x=Sampleone.x+y;
		Sampleone.y=Sampleone.x+y;
		return x+y;
	}
	public static void main(String[] args) {
		//Sampleone obj=new Sampleone();
		method(5,6);
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}

}
