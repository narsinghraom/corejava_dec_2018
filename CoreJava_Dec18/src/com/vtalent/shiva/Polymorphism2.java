package com.vtalent.shiva;

public class Polymorphism2 extends Polymorphism1 {
	
	int y;
	public int function(int y) {
		this.y=this.y+y;
		x=x+y;
		return y;
	}
	public int function(int x, int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}

}
