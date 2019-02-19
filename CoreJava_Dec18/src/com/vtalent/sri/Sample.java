package com.vtalent.sri;

class Sample {
	long l1,l2;
	static float f1,f2 ;
	public int function(long l1,long l2)
	{
	this.l1=l1+l2;
	this.l2=l1*l2;
	
	return  (int)(this.l1+this.l2);
}
public static void function(float f1,float f2){
	Sample.f1=f1+f2;
	Sample.f2=f1-f2;
}
public static void main(String [] args) {
Sample sample=new Sample();
int k=sample.function(2,5);
function((float)k,(float)k+1);
System.out.println(k);
System.out.println(sample.l1);
System.out.println(sample.l2);
System.out.println(sample);
}
}



