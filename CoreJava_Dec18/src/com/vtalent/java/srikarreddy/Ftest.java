package com.vtalent.java.srikarreddy;

class O1 {
	double a;
	public int function(double a) {
		this.a=this.a+a;
		return (int)a;  
	}
}
class T2 extends O1{
	int x,y;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
}
class T3 extends T2{
	int y;
	public int function(int x,int y) {
		this.x=this.x+super.function(x,y);  
		this.y=x+this.y+y;
		return this.x+this.y;
	}
	public int function(double a) {
		int k=super.function(a);
		this.a=(double)k+a;
		return k+(int)this.a;
	}
	public static void fun()   {
		System.out.println("srikar");
	}
	
}
public class Ftest {
	public static void main(String[] args) {
		T2 g=new T3();
		int k=g.function(2.0);
		k=g.function(k,k);
		System.out.println(k);
		System.out.println(g.x+g.y);
		System.out.println(g.a);
		O1 b=new T3();
		k=b.function((double)k);
//		k=b.function(k,k);
		System.out.println(k);
//		System.out.println(b.x+b.y);
		System.out.println(b.a);
		O1 l=new T2();
		k=l.function((double)k );
//		k=l.function(k,k);
		System.out.println(k);
//		System.out.println(l.x+l.y);
		System.out.println(l.a);
		T3.fun();
		
	}

}
