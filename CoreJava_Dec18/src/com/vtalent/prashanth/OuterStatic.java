package com.vtalent.prashanth;

public class OuterStatic {
	
	private int i;
	public void function() {
		System.out.println("Outer class function. " +i);
	}
	
	static class Inner{
		float f;
		public void function() {
			OuterStatic out1 = new OuterStatic();
			out1.i = 3;
			System.out.println("Inner class function. " +(f+out1.i));
		}
	}

	public static void main(String[] args) {
		OuterStatic out = new OuterStatic();
		out.i = 10;
		out.function();
		OuterStatic.Inner in = new OuterStatic.Inner();
		in.f = 1.5f;
		in.function();
	}

}
