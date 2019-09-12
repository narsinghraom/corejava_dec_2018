package com.vtalent.java.srikarreddy;
class First{
	int x,y;
	public int function(int x) {
		this.x=this.x+x;
		y=y+x;
		return x;
	}
}
class Second2 extends First{
	int y;
	public int function(int y) {
		this.y=this.y+y;
		x=x+y;
		return y;
	}
 
public int function(int x,int y) {
	this.x=this.x+x;
	this.y=this.y+y;
	return x+y;
}
	
}
class Third3 extends Second2{
	int x;
	public int function(int x, int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
}
public class Rtest {
	public static void main(String[] args) {
		First f1=new Second2();
		int k=f1.function(3);
//		k=f1.function(k,k);  
		System.out.println(k);
		System.out.println(f1.x+f1.y);
		First f2=new First();
		int k1=f2.function(2);
		k1=f2.function (k1);
		System.out.println(k1);
		System.out.println(f2.x+f2.y);
		Second2 f3=new Second2();
		int k2=f3.function(1);
		k2=f3.function(k2,k2);
		System.out.println(k2);
		System.out.println(f3.x+f3.y);
		Third3 s=new Third3();
		int d=s.function(5);
		d=s.function(d,d);
		System.out.println(d);
		System.out.println(s.x+s.y);
		Second2 r=new Third3();
		int h=r.function(5);
		h=r.function(h,h);
		System.out.println(h);
		System.out.println(r.x+r.y);
		First t=new Third3();
		int l=t.function(5);
	      System.out.println(l);
		System.out.println(t.x+t.y);
		
		
		
		
	}

}
