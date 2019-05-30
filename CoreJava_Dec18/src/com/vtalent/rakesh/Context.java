package com.vtalent.rakesh;

public class Context {

	static Context abc = new Context();
	float f1, f2;
	static long l1, l2;
	Context abcRef;

	public Context function(Context abc) {
		abcRef = abc;
		return abcRef;
	}

	public static long function1() {
		Context abc1 = abc.function(new Context());
		abc1.f1 = 1.5f;
		abc1.f2 = 2.5f;
		abc = abc1;
		return (long) (abc1.f1 + abc1.f2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l1 = function1();
		l2 = l1 + 5;
		System.out.println(l1 + l2);
		System.out.println(abc.abcRef);
		System.out.println(abc.f1);
		System.out.println(abc.f2);

	}

}
