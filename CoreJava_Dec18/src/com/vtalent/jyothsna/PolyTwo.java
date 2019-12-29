package com.vtalent.jyothsna;

class PolyTwo extends PolyOne{
	double a;
	public int function(double a) {
		super.function(a);
		this.a=this.a+a; //2+2.0
		b=b+a;//2.0
		return (int)(a+b);//6
	}
	public int function(double a,double b) {
		this.a=this.a+a;//8.0
		this.b=this.b+b;//6.0
		return (int)(a+b);//14
	}
	}