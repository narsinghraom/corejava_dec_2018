package com.vtalent.anusha;

public class Sample2 {
long l1,l2;
static float f1,f2;
public int function(long l1,long l2){
this.l1=l1+l2;
this.l2=l1*l2;
return (int) (this.l1+this.l2);
}
public static void function(float f1,float f2) {
	Sample2.f1=f1+f2;
	Sample2.f2=f1*f2;
}
public static void main(String[] args) {
	Sample2 s=new Sample2();
	int k=s.function(2,5);
	function((float)k,(float)k+1);
	System.out.println(k);
	System.out.println(Sample2.f1);
	System.out.println(Sample2.f2);
	System.out.println("hello");
	
}
}


