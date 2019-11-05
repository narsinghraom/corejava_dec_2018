package com.vtalent.java.haritha;

public class Outer {
	/*private int i;
	public void function() {
		System.out.println("Outer class function:"+i);
	}
	class Inner{
		float f;
		public void function() {
			System.out.println("Inner class function:"+(f+i));
		}
	}
	public static void main(String[] args) {
		Outer o=new Outer();
		o.i=10;
		o.function();
		Outer.Inner in=o.new Inner();//inner class ref through outer class
		in.f=1.5f;
		in.function();
	}
}
*/
	private int i;
	public void function() {
		System.out.println("Outer class function:"+i);
	}
	static class Inner{
		float f;
		public void function() {
			Outer o=new Outer();
			//o.i=5;
			System.out.println("Inner class function:"+(f+o.i));
		}
	}
	static class Inner2{
		public static  void function() {
		System.out.println();
	}
	}
	public static void main(String args[]) {
		Outer o=new Outer();
		o.i=10;
		o.function();
		//Outer.Inner in=Outer.new Inner();
		Outer.Inner in=new Outer.Inner();
		in.function();
		Inner2.function();
	}
	
	}
