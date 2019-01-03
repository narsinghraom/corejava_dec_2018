package com.vtalent.hanu.oop;
public class Test_Abstarct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cc= new CalImpl();
		System.out.println(cc.add(2,5));
		System.out.println(cc.sub(2,5));
		System.out.println(cc.mul(2,5));
		System.out.println(cc.div(2, 5));

	}

}
