package com.vtalent.tarun.basics;

interface Phone {
	void show();

	public class LambdaDemo {

		public static void main(String[] args) {
			Phone p;
			p= () -> //LambdaExprssion
			{
				System.out.println("Hello");
			};
			p.show();

		}
	}
}
