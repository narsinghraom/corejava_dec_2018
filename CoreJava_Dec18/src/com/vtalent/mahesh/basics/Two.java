package com.vtalent.mahesh.basics;

class Two extends One{
	int x;
	public int function(int x) {
	this.x=this.x+x;
	super.x=super.x+x;
	return super.x+x;
	}
}