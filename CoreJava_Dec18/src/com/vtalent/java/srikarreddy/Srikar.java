package com.vtalent.java.srikarreddy;

public class Srikar {
	int x,y;
	static float f1;
	public void m1() {
		x=5;
		y=x+5;
	}
	public static float m2(int x) {
		f1=x+0.5f;
		return f1;
	}
	public static void main(String[] args) {
		Srikar reddy=new Srikar();
		reddy.m1();
		f1=m2(reddy.y);
		System.out.println(reddy.x+reddy.y);
		System.out.println(f1); 
		
	}
	 

}
