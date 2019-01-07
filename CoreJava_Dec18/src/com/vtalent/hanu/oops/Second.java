//Inheritence
package com.vtalent.hanu.oops;
public class Second extends First{
	
	int i;
	
	public void function(int i, int j) {
		this.i=this.i+i;
		this.j=this.j+j;
		super.i=super.i+i;
	}
}
