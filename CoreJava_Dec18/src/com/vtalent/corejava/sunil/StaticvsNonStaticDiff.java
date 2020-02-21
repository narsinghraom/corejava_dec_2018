package com.vtalent.corejava.sunil;

public class StaticvsNonStaticDiff {
	int a,b;
	public void function(int a,int b) {
    this.a=a+this.b;
     this.b=this.a;
     a=this.a+this.b;
     b=a;
     System.out.println(this.a);
     System.out.println(this.b);
     System.out.println(a);
     System.out.println(b);
	}
	public static int functionOne(int x,float y) {
		x=x+x;
		y=y+x;
		return  (int) (x+y);
	}
	public static void main (String[]args) {
		int st1= functionOne(5, 5.5f);
		System.out.println(st1);
		StaticvsNonStaticDiff sn=new StaticvsNonStaticDiff();
		sn.function(5, 6);
		
	} 

}
