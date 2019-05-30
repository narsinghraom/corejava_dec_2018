package com.vtalent.rakesh;

public class ContextTwo {
	static ContextTwo demo;
	ContextTwo demo1;
	int i, j;

	public static ContextTwo function() {
		demo = new ContextTwo();
		demo.demo1 = new ContextTwo();
		demo.i = 10;
		demo.j = 20;
		demo.demo1.i = demo.i + demo.j;
		demo.demo1.j = demo.i * demo.j;
		return demo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo = function();
		System.out.println(demo.i);
		System.out.println(demo.j);

	}

}
