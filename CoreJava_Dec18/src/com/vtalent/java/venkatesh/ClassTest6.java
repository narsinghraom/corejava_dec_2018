package com.vtalent.java.venkatesh;

class One6{
double a;
public int function(double a) {
this.a=this.a+a;
return(int)a;
}
}
class Two6 extends One6{
	int x,y;
	public int function(int x, int y) {
this.x=this.x+x;
this.y=this.y+y;
return x+y;
}
}
class Three6 extends Two6{
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
}
class ClassTest6 {
public static void main(String[] args) {
	Two6 t1=new Three6();
	int k=t1.function(2.0);
	k=t1.function(k,k);
	System.out.println(k);
	System.out.println(t1.x+t1.y);
	System.out.println(t1.a);
	One6 t2=new Three6();
	k=t2.function((double)k);
	//k=t2.function(k,k);
	System.out.println(k);
	//System.out.println(t2.x+t2.y);
	System.out.println(t2.a);
	One6 t3=new Two6();
	k=t3.function((double) k);
//	k=t3.function(k, k);
	System.out.println(k);
//	System.out.println(t3.x+t3.y);
	System.out.println(t3.a);
}
}
