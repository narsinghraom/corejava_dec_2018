package com.vtalent.corejava.suma;

interface Suma11 {
	public static final float PI = 3.14f;
	int k = 0;

	public abstract void function(int x);

	public abstract void function(int x, int y);
}

class AbcImpl implements Suma11 {
	public void function(int x) {
		System.out.println(x + k);
	}

	public void function(int x, int y) {
		System.out.println(x + y + PI);
	}

	public void function() {
		System.out.println(PI);
	}
}

class InterfaceEx {

	public static void main(String args[]) {

		AbcImpl abc = new AbcImpl();
		abc.function(2);
		abc.function(2, 3);
		abc.function();
	
	Suma11 abc1=new AbcImpl();
	abc1.function(3);
	abc1.function(2,5);
}
}
