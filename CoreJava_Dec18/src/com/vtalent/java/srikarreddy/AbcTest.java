package com.vtalent.java.srikarreddy;
interface Abc11{
	public static final float pi=3.14f;
	int k=0;
//	int i;
	public abstract void function(int x);
	public void function(int x,int y);
}
class AbcImpl implements Abc11{
	int k;
	public void function(int x) {
		System.out.println((int)pi+x);
		System.out.println(k);
	}
	public void function(int x,int y) {
//		pi=pi+x;
		k=k+(x*y);
		System.out.println(Abc11.k);
		System.out.println(k);
		 
	}
	public void function() {
		System.out.println(k);
	}
 
}
public class AbcTest {
	public static void main(String[] args) {
		 
	AbcImpl d=new AbcImpl();
	d.k=5;
	d.function(d.k);
	d.function(d.k,d.k);
	d.function();
	
	Abc11 v=new AbcImpl();
//	v.k=5;
	v.function(2);
	v.function(2,3);
//	v.function( );
	}
}
