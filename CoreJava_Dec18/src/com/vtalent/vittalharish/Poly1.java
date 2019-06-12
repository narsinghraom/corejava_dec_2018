package com.vtalent.vittalharish;



public class Poly1 {
	float f1,f2;
	
	Poly1(){
		f1=1.5f;
		f2=2.5f;
	}
	public void function(float f1){
		this.f1=f1+f1;
		f2=this.f1+f1;
	}
	public float function(float f1,float f2){
		this.f1=this.f1+f1;
		
		
		this.f2=this.f2+f2;
		return (int)(f1+f2);
	}
	public void function(){
		System.out.println("f1  "+f1);
		System.out.println("f2  "+f2);
	}

}

