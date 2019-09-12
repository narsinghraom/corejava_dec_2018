package com.vtalent.shiva;

public class Polymorphism3 extends Polymorphism2 {
	int x;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}

}
