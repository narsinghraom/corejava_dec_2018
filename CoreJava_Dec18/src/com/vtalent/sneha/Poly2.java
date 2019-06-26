package com.vtalent.sneha;

public class Poly2 extends Poly1{
	long l1,l2;
	float f1;
	Poly2(){
		super();
		f1=super.f1;
		l1=(long)f2;
	}
	public long function(long l1){
		this.l1=l1+l2;
		//return l2=this.l1+l1;
	}
	public float function(float f1,float f2){
		f1=super.function(f1,f2);
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
		super.f1=super.f1+f1;
		return f1+f2; 
}
}