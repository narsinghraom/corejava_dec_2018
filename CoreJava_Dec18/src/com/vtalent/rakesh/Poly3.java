package com.vtalent.rakesh;

public class Poly3 extends Poly2 {
	Poly3() {
		super();
	}

	public void function(long l1) {
		// l1 = super.function(l1);
		this.l1 = this.l1 + l1;
		System.out.println("poly3");
	}

}
