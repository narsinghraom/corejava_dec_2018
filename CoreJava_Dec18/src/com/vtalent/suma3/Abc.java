package com.vtalent.suma3;

public class Abc {
	static Abc abc= new Abc();
	float f1,f2; // initial values( f1=0, f2=0)
	static long l1,l2; // initial values(l1=0,l2=0)
	Abc abcRef;
	public Abc function(Abc abc) {
		abcRef = abc;
		return abcRef;
		
	}
	public static long function1() {
		Abc abc1=abc.function( new Abc() );
		abc1.f1=1.5f;
		abc1.f2=2.5f;
		abc=abc1;
		return (long) (abc1.f1+abc1.f2); //1.5+2.5=4
		
	}
	public static void main( String[] agrs) {
		l1=function1();//4
		l2=l1+5; // 4+5=9
		System.out.println(l1+l2); // 4+9=13
		System.out.println(abc.abcRef); //null value
		System.out.println(abc.f1); // 1.5
		System.out.println(abc.f2); // 2.5
		
		
	}


}
