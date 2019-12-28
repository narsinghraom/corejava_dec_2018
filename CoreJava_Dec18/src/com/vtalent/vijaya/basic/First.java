package com.vtalent.vijaya.basic;

public class First {
	int x,y;
	public void function() {
		x=10;
		y=20;
	}

}
class Second extends First{
	int x;
	public void functionOne() {
		x=super.x+x;
		y=x+y;
	}
}

