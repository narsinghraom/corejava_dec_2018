package com.vtalent.hanu.oop;

public class Sample {
	
	
	float f1,f2;
	
	void function(float f1,float f2){
		this.f1=f1+f2;
		this.f2=f2+this.f2;
	}
	void function(long l){
		this.f1=this.f1+(float)l;
	}

}
