package com.vtalent.java.venkatesh;

public class DemoTwo {
	int x,y;
	static float f1,f2;
	public void function(int x,int y) {
		x=x+y;
		y=x*y;
	}
	public static void function(float f1) {
		f1=f1+f2;
	}
	public static void main(String[] args) {
		DemoTwo d1=new DemoTwo();
		d1.function(2,3);
		function(1.5f);
		System.out.println(d1.x+d1.y);
		System.out.println(f1+f2);
	}
	}

