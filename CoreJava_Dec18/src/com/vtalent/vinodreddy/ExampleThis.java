package com.vtalent.vinodreddy;

public class ExampleThis {
	int x,y;
	static float f1,f2;
	public int function(int x,int y) {
		this.x =this.x+x;
		this.y =this.y*y;
		return this.x+this.y;
		
	}
	
public static float function(float f1) {
	ExampleThis d2 =new ExampleThis();
	f1 =f1 + d2.function(2,3);
	d2.f2=f1;
	return f1;
		
}
public static void main(String[] args) {
	ExampleThis d1 =new ExampleThis();
	d1.f1=ExampleThis.function(1.5f);
	System.out.println(f1+f2);
	System.out.println(d1.x+d1.y);
}
}