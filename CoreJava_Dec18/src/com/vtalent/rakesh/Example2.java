package com.vtalent.rakesh;

public class Example2 extends InterfaceExampleImplements implements Xyz {

	int x;

	public float function(int x, int y) {
		super.function(x, y);
		this.x = this.x + x;
		this.y = this.y + y;
		System.out.println("Excuted the method that is there in the Example2");
		return this.x + this.y;

	}

	public void function() {
		System.out.println(x + y);
	}

	public static void main(String arg[]) {

		InterfaceExampleImplements e1 = new Example2();

		float l = e1.function(2, 3);
		int k = e1.function(5);
		System.out.println(l);
		System.out.println(k);
		System.out.println(e1.x);
		System.out.println(e1.y);

	}
}
