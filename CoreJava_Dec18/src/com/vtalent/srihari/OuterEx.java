package com.vtalent.srihari;

class OuterEx {
	private static int param;

	static class Inner {
		int i = 5;

		public void fun() {
			System.out.println("Value " + (i + param));
		}
	}

	public static void main(String[] args) {
		// OuterEx.Inner in= new OuterEx().Inner();
		OuterEx o = new OuterEx();
		OuterEx.Inner o1 = new OuterEx.Inner();
		o1.fun();

	}
}
