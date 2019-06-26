package com.vtalent.sukesh;

public class InnerOuterStatic {

	private static int p;

	static class Inner {
		int i = 5;

		public void Function() {
			System.out.println("Value =" + (i + p));
		}
	}

	public static void main(String[] args) {
		InnerOuterStatic IS = new InnerOuterStatic();
		InnerOuterStatic.Inner IS1 = new InnerOuterStatic.Inner();
		// InnerOuterStatic io = new InnerOuterStatic();
		// InnerOuterStatic.Inner in = new InnerOuterStatic.Inner();
		IS1.Function();

	}

}
