package com.vtalent.sujith.oops;

public interface Xyz extends Abc {

	public int function(int i);
	public void function();
	
}
 class XyzImp implements Xyz{
	public int function(int i) {
		return i+i;
	}
	public void function() {
		System.out.println(pi);
	}
	public int function(int i,int j) {
		return i*j;
	}
}
