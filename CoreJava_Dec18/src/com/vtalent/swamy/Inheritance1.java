package com.vtalent.swamy;
 class one{
	 int x,y;
	public int function(int x) {
		this.x=this.x+x;
	this.y=y+x;
		return x;
	}
 }
 class two extends one {
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
 class three extends two {
	 int x;
	 public int function(int x,int y) {
		 this.x=this.x+x;
		 this.y=this.y+y;
		 return x+y;
	 }
 }
public class Inheritance1 {
	public static void main(String[] args) {
three t=new three();
int k=t.function(5);
k=t.function(k,k);
System.out.println(k);
System.out.println(t.x+t.y);
two t2=new three();
k=t2.function (k);
k=t2.function (k,k);
System.out.println(k);
System.out.println(t2.x+t2.y);
one o=new three();
k=o.function(k);
//k=o.function(k,k);
System.out.println(k);
System.out.println(o.x+o.y);
	}
	}
