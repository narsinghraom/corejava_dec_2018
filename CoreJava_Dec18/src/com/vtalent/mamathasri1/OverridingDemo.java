package com.vtalent.mamathasri1;

public class OverridingDemo {
	void msg() {
		System.out.println("parent method");
		
	}

}
class Demo extends OverridingDemo{
	void msg() {
		System.out.println("child method");
		
	}
	public static void main(String arhgs[]) {
		Demo d=new Demo();
		d.msg();
	}
	}