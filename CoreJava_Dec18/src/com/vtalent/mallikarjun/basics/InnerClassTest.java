package com.vtalent.mallikarjun.basics;

public class InnerClassTest {
	public void display(InnerClassEx1 i) {
		i.function();
	}
	public static void main(String[] args) {
		InnerClassTest inner=new InnerClassTest();
		inner.display(new InnerClassEx1() {
			public void function() {
				System.out.println("Inner class");
			}
		});
	}
}
