package com.vtalent.vijaya.basic;

class One5{
	double a;
	public int function(double a) {
		this.a=this.a+a;
		return (int)a;
	}
	}
class Two5 extends One5{
	int x,y;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
}
class Three5 extends Two5{
	int y;
	public int function(int x,int y) {
		this.x=super.function(x, y)+this.x;
		this.y=x+this.y+y;
		return this.x+this.y;
	}
	public int function(double a) {
	int k=super.function(a);
	this.a=(double)k+a;
	return k+(int)this.a;
	}
}
public class Test6 {
public static void main(String[] args) {
	Two5 t1=new Three5();
	int k=t1.function(2.0);
	k=t1.function(k,k);
	System.out.println(k);
	System.out.println(t1.x+t1.y);
	System.out.println(t1.a);
	One5 o1=new Three5();
	k=o1.function((double)k);
	//k=o1.function(k,k);
	System.out.println(k);
	//System.out.println(o1.x+o1.y);
	System.out.println(o1.a);
	One5 o2=new Two5();
	k=o2.function((double)k);
	//k=o2.function(k,k);
	System.out.println(k);
	//System.out.println(o2.x+o2.y);
	System.out.println(o2.a);
	}
}

