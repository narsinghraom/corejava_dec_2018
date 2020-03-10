package com.vtalent.corejava.sunil;

class DemoP2 {
	int x, y;

	public void functionone(int x) {
		this.x = this.x + x;
		y = x + y;
	}
}

class Demo1P2 extends DemoP2 {
	int x;

	public void functiontwo(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Demo1P2 d1p = new Demo1P2();
		d1p.functionone(5);
		d1p.functiontwo(5, 10);
		System.out.println(d1p.x + "  " + d1p.y);//5,15

		DemoP2 dp = new Demo1P2();
		dp.functionone(5);
		System.out.println(dp.x + "  " + dp.y);//5,5
	}
}
