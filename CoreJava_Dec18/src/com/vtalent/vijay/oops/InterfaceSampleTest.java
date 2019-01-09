package com.vtalent.vijay.oops;

public class InterfaceSampleTest {

	public static void main(String[] args) {
		
		/*SampleImpl s1=new SampleImpl();
		System.out.println(s1.methodOne(2));*/

		InterfaceSample s2=new SampleOneImpl();
		System.out.println(s2.methodOne(5,5));
		System.out.println(s2.methodOne(5));
		//System.out.println(s2.i);
		
		
		SampleImpl s3=new SampleOneImpl();
		
		System.out.println(s3.methodOne(6));
		System.out.println(s3.methodOne(6,6));
		System.out.println(s3.i);
	}

}
