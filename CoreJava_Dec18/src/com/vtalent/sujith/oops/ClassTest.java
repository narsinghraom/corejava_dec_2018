package com.vtalent.sujith.oops;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1=new CalImp();
		System.out.println(c1.add(2, 5));
		System.out.println(c1.sub(2, 5));
		System.out.println(c1.mul(2, 5));
		System.out.println(c1.div(2, 5));
		
		CalImp2 c2=new CalImp2();
		c2.print("hi");
	}

}
