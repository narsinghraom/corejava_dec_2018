package com.vtalent.java.venkatesh;

public class OuterEx1 {
private int i;
public void function() {
	System.out.println("outer class function"+i);
}
class Inner{
	float f;
	public void function() {
		System.out.println("inner class function"+(f+i));
	}
}
public static void main(String[] args) {
	OuterEx1 o=new OuterEx1();
	o.i=10;
	o.function();
	OuterEx1.Inner in=o.new Inner();
	in.f=(float) 1.5;
	in.function();
}
}
