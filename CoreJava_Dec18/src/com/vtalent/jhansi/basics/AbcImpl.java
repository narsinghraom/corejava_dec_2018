package com.vtalent.jhansi.basics;

interface Abc1{
	public static final float pi=3.14f;
	public int k=0;
	int i=0;
	public abstract void function(int x);
	public void function(int x,int y);
}
class AbcImpl implements Abc1{
int k;
public void function(int x) {
	System.out.println((int)pi+x);
	System.out.println(k);
	}
public void function(int x,int y) {
	k=k+(x*y);
	System.out.println(Abc1.k);
	System.out.println(k);
}
public void function() {
	System.out.println(k);
}
	
}
