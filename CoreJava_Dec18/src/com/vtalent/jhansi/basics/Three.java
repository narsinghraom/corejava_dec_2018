package com.vtalent.jhansi.basics;

public class Three extends Two{
	float f1;
	int y;
	public float functionOne(int y,float f1) {
	super.y=super.y+y;
	this.y=this.y+super.y;
	this.f1=this.f1+f1;
	return f1;
	}
}