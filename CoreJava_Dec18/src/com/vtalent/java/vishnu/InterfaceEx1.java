package com.vtalent.java.vishnu;

interface Ab {
	// int i=0;
	float pi = 3.14f;

	public static final int k = 10;

	public void function(int i);

	public void function(float f);
}

class Ab1 implements Ab {
	int k = 5;

	public void function(int i) {
		// k=i+i;
		i = k + i;
		System.out.println(i);
	}

	public void function(float f) {
		f = pi + f;
		System.out.println(f);
		System.out.println(pi);
		System.out.println(k);
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ab1 a = new Ab1();
		a.function(2);
		a.function(2.5f);
	}

}
