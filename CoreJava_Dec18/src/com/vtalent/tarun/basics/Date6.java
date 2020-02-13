package com.vtalent.tarun.basics;

class Outer {
	int k;
	public void function(int k) {
		this.k = k + this.k;
	}
	class Inner {
		int i;
		public void display() {
			System.out.println(i+k);
			System.out.println("$$$$$This is inner class$$$$$");
		}}}
 class InnerDemo{
		public static void main(String[] args) {
			Outer o1 = new Outer();
			o1.k = 2;
			o1.function(3);
			Outer.Inner t = o1.new Inner();
			t.i = 5;
			t.display();
		}
}