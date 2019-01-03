
package com.vtalent.hanu.oop;

public class Third extends Second{
	
	int j;
	public void function(int j) {
		super.function(j);
		this.j=this.j+j;
		super.j=super.j+j;
	}

}
