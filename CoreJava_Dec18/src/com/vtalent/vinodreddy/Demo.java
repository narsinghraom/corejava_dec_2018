package com.vtalent.vinodreddy;

public class Demo {
	
	int x,y;
	static float f1;
	public void function() {
		
		x=5;
		y=x+5;
		
	}

public static float function(int x) {
	
	f1=x+0.5f;
	return f1;
	
	
}
public static void main(String[] args) {
	Demo d =new Demo();
	d.function();
	f1=function(d.y);
	System.out.println(d.x+d.y);
	System.out.println(f1);
}
}
