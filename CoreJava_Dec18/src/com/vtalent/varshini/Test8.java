package com.vtalent.varshini;

class One10 {
	double a;
	public int function(double a) {
		this.a=this.a+a;
		return (int)a;
	}
}
class Two10 extends One10{ 
	int x,y;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
	
}
class Three10 extends Two10{
	int y;
	public int function (int x,int y) {
		this.x=this.x+super.function(x,y);
		this.y=x+this.y+y;
		return this.x+this.y;
	}

public int function(double a) {
	int k=super.function(a);
	this.a=(double)k+a;
	return k+(int)this.a;
}
}
public class Test8 {

	public static void main(String[] args) {
		Two10 t1=new Three10();
		int k=t1.function(2.0);
		k=t1.function(k, k);
		System.out.println(k);
		System.out.println(t1.x+t1.y);
		System.out.println(t1.a);
		
		One10 o1=new Three10();
		k=o1.function((double)k);
		//**compile time error k=o1.function(k,k);
		System.out.println(k);
		System.out.println(o1.a);
		//** compile time error System.out.println(o1.x+o1.y);
		
		One10 o2=new Two10();
		k=o2.function((double)k);
		 //k=o2.function(k,k);
		System.out.println(k);
		System.out.println(o2.a);
		//System.out.println(o2.x+o2.y);
		//** compile time error System.out.println(o1.x+o1.y);
		
	}

}
