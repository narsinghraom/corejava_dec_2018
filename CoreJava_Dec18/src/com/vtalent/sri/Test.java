package com.vtalent.sri;

 class Remo1 {
float f1,f2;
public void function(float f1){
	this.f1=f1+f1;
	f2=this.f1+f1;
}
public float function(float f1,float f2){
	this.f1=this.f1+f1;
	this.f2=this.f2+f2;
	return(int)(f1+f2);
	
}
public void function(){
	System.out.println("f1"+f1);
	System.out.println("f2"+f2);
	
}
}
class RemoOne extends Remo1{
	long l1,l2;
	float f1;
	public void function(long l1){
		this.l1=l1+l1;
		l2=this.l1+l1;
	}
	public float function(float f1,float f2){
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
		super.f1=super.f1+f1;
		return f1+f2;
		
	}
}
class Test{
	public static void main(String args[]) {
		RemoOne r1=new RemoOne();
		float f1=r1.function(2.5f,1.5f);
		r1.function((long) f1);
		r1.function(f1);
		r1.function();
		System.out.println(r1.f1);
		System.out.println(r1.f2);
		System.out.println(r1.l1);
		System.out.println(r1.l2);
	}
}
