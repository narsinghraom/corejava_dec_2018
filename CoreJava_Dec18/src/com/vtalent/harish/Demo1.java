package com.vtalent.harish;

public class Demo1 {
	static Demo demo;
	Demo demo1;
	Demo demo2;
	int i,j;
	public static Demo function()
	{
		demo=new Demo();
		demo.demo1=new Demo();
		demo.demo1.demo2=new Demo();
		demo.i=10;
		demo.j=20;
		demo.demo1.i=demo.i+demo.j;
		demo.demo1.j=demo.i*demo.j;
		demo.demo1.demo2.i=demo.i-demo.j;
		return demo.demo1.demo2;
	}
	public static void main(String[] args) {
		demo=function();
		System.out.println(demo.i);
		System.out.println(demo.j);
	}

}

