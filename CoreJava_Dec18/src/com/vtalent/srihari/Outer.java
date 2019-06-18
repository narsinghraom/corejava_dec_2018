package com.vtalent.srihari;

public class Outer {
	int n;

	public void function() {

		class Inner {
			int k;

			public int function(int k) {
				return this.k + k;
			}
		}
		Inner l = new Inner();
		n = l.function(5);
	}

	public static void main(String[] args) {

		Outer o = new Outer();
		o.function();
		System.out.println(o.n);
	}
}
