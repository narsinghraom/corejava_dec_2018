package com.vtalent.java.mahesh;

public class ABC {
	static ABC abc=new ABC();
	float f1,f2;
	static long l1,l2;
	ABC abcRef;
	public ABC function(ABC abc){
		abcRef=abc;
		return abcRef;
	}
	public static long function1(){
		ABC abc1=abc.function(new ABC());
		abc1.f1=1.5f;
		abc1.f2=2.5f;
		abc=abc1;
		return (long)(abc1.f1+abc1.f2);
	}

	public static void main(String[] args) {
		l1=function1();
		l2=l1+5;
		System.out.println(l1+l2);
		System.out.println(abc.abcRef);
		System.out.println(abc.f1);
		System.out.println(abc.f2);
	}
}
