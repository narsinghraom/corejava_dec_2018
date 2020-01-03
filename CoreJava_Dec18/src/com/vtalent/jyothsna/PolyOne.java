package com.vtalent.jyothsna;

public class PolyOne {
	double a,b;
	static int x,y;
	public int function(double a) {
		this.a=this.a+a;
		b=b+a;
		return (int)a;
		}
public double function(int x,int y) {
	PolyOne.x=PolyOne.x+x;
	PolyOne.y=PolyOne.y+y;
	return (double)(x+y);
}
}
