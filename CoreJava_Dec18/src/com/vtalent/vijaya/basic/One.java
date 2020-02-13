package com.vtalent.vijaya.basic;

public class One {
	int x,y;
	public void function(int x) {
		this.x=this.x+x;
		y=x;
	}
	public void function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
	}
}
class Two extends One{
	int x;
	public void function() {
		x=10;
	}
	public void function(int x) {
		this.x=this.x+x;
	}
}
class Three extends Two{
	int x,y;
	public void function (int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
	}
}
