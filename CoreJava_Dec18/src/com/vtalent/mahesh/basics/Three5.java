package com.vtalent.mahesh.basics;

class Three5 extends Two5{
	int y;
	public int function(int x,int y) {
		this.x=super.function(x, y)+this.x;
		this.y=x+this.y+y;
		return this.x+this.y;
	}
	public int function(double a) {
	int k=super.function(a);
	this.a=(double)k+a;
	return k+(int)this.a;
	}
}