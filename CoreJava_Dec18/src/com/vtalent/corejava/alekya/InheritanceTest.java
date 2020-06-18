package com.vtalent.corejava.alekya;

public class InheritanceTest {
	public static void main(String[] args) {
		Demo1P2 d1p = new Demo1P2();
		d1p.functionone(5);
		d1p.functiontwo(5, 10);
		System.out.println(d1p.x + "  " + d1p.y);

		DemoP2 dp = new Demo1P2();
		dp.functionone(5);
		System.out.println(dp.x + "  " + dp.y);
	}
}


              
