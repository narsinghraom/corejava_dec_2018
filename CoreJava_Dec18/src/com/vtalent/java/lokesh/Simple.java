package com.vtalent.java.lokesh;

public class Simple {
	int x,y;
	static float f1;
	public void function() {
		x=9;
		y=x+9;
	}
public static float function(int x) {
	f1=x+0.5f;
	return f1;
}
public static void main (String[]args) {
	Simple simple = new Simple();
	simple.function ();
	f1=function(simple.y);
	System.out.println(simple.x+simple.y);
	System.out.println(f1);
}

}