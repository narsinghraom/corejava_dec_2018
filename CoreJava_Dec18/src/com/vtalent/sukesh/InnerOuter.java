package com.vtalent.sukesh;

public class InnerOuter {

	private int p;

	class Inner {
		int i;

		public void Function() {
			System.out.println("Value =" + (i + p));
		}
	}

	public static void main(String[] args) {

		InnerOuter IO = new InnerOuter();
		IO.p = 10;
		System.out.println("Outer class P value" + IO.p);
		InnerOuter.Inner IOI = IO.new Inner();
		IOI.i = 10;
		IOI.Function();

	}

}
