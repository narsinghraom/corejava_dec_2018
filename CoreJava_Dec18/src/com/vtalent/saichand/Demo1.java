package com.vtalent.saichand;

public class Demo1 {
	static Demo1 demo;
	Demo1 demo1;
	int i, j;

	public static Demo1 function() {
		demo = new Demo1();
		demo.demo1 = new Demo1();
		demo.i = 10;
		demo.j = 20;
		demo.demo1.i = demo.i + demo.j;
		demo.demo1.j = demo.i * demo.j;
		return demo.demo1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo = function();
		System.out.println(demo.i);
		System.out.println(demo.j);

	}

}
