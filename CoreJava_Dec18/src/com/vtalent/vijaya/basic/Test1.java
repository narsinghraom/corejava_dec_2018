package com.vtalent.vijaya.basic;

public class Test1 {
	public static void main(String[] args) {
		Two t1=new Two();
		t1.function();
		t1.function(5);
		t1.function(t1.x,t1.y);
		System.out.println(t1.x+t1.y);
	}

}
