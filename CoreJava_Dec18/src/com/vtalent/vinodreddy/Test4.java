package com.vtalent.vinodreddy;
class Ek {
	double a;
	public int function (double a) {
		this.a =this.a+a;
		return (int) a;
		
	}
}
class Dho extends Ek{
	int x ,y;
	public int function (int x ,int y) {
		this.x=this.x +x;
		this.y =this.y+y;
		return x+y;
	}
}
class Theen extends Dho{
	int y;
	public int function(int x,int y) {
		this.x =this.x+super.function(x,y);
		this.y =x+this.y+y;
		return this.x+this.y;
		
	}
	public int function(double a ) {
		int  k =super.function(a);
		this.a =(double)k+a;
		return k+(int)this.a;
		
	}
}
public class Test4 {
	public static void main(String[] args) {
		Dho d1 =new Theen();
		int k =d1.function(2.0);
		k = d1.function(k,k);
		System.out.println(k);
		System.out.println(d1.x+d1.y);
		System.out.println(d1.a);
		
	}

}
