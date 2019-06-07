package com.vtalent.venkatesh;



public class Poly1 {
	float f1,f2;
    
//long l1;

//long l2;    
	Poly1(){
		f1=1.5f;//4 //6.5
		f2=2.5f;//4

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
