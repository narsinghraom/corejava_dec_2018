package com.vtalent.java.mahesh;

public class Outer {
int i;
public void function(){
	System.out.println("Outerclass function:"+i);
}
static class Inner{
	float f;
	public void function(){
		Outer o=new Outer();
		f=1.5f;
		System.out.println("Innerclass function:"+(f+o.i));
	}
}
public static void main(String args[]){
	Outer o=new Outer();
	o.i=10;
	o.function();
	Outer.Inner in=new Outer.Inner();
	in.function();	
}
}