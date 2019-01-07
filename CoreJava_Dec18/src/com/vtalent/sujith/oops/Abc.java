package com.vtalent.sujith.oops;

public interface Abc {

	public abstract int function(int i);
	public static final float pi=3.14f;
	public abstract int function(int i,int j);
}
  class AbcImp implements Abc{
	
	public int function (int i) {
		return i*i;
	}
	public int function (int i,int j) {
		return i*j;
	}
	public void display() {
		System.out.println("display");
	}
}