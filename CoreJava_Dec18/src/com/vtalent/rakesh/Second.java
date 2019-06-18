package com.vtalent.rakesh;

public class Second extends First {
	int j;

	public void function(int j, int i) {
		this.j = this.j + j;
		super.j = super.j + this.i;
	}
}
