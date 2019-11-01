package com.vtalent.java.venkatesh;

public class OuterStatic {
private int i;
public void function() {
	System.out.println("outer class function"+i);
}
static class InnerEx{
	float f;
	public void function() {
		OuterStatic o=new OuterStatic();
		System.out.println("Inner class function"+(f+o.i));
	}
}
public static void main(String[] args) {
	OuterStatic o1=new OuterStatic();
	o1.i=10;
	o1.function();
	OuterStatic.InnerEx in=new OuterStatic.InnerEx();
	in.f = (float) 1.5;
	in.function();
	
}
}
