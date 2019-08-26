package com.vtalent.java.prashanth;

public class Demo6 {
	public void casting() {

		byte b=100;
		short s=200;
		int i=125;
		long l=2000;
		float f=200.89f;
		double d=20000.56;
		
		
		
	}
	public void casting1() {

		double d=2000.49;
		float f=(float) d;
		long l=(long) f;
		int i=(int) l;
		short s=(short) i;
		byte b=(byte) s;
		
		System.out.println("This is double value  "+d);
		System.out.println("This is float value  "+f);
		System.out.println("This is long value  "+l);
		System.out.println("This is int value  "+i);
		System.out.println("This is short value  "+s);
		System.out.println("This is byte value  "+b);
	}
	public void casting2() {

		double d=61;
		float f=(float) d;
		long l=(long) f;
		int i=(int) l;
		short s=(short) i;
		byte b=(byte) s;
		
		System.out.println("This is double value  "+d);
		System.out.println("This is float value  "+f);
		System.out.println("This is long value  "+l);
		System.out.println("This is int value  "+i);
		System.out.println("This is short value  "+s);
		System.out.println("This is byte value  "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 d=new Demo6();
		d.casting1();
		d.casting2();


	}

}
