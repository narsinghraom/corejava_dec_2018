package com.vtalent.prashanth;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i = 100;
		float f = 24.89f;
		double d = 530.972;
		char c = 'A';
		
		c = (char) i;
		System.out.println("i = " + i + " c = " + c);
		
		i = (int) f;
		System.out.println("f = " + f + " i = " + i);
		
		i = (int) d;
		System.out.println("d = " + d + " i = " + i);
		
		b = (byte) i;
		System.out.println("i = " + i + " b = " + b);
//		Explicit Type Casting
		
		f = i;
		System.out.println("i = " + i + " f = " + f);

		d = c;
		System.out.println("c = " + c + " d = " + d);
//		Implicit Type Casting

	}

}
