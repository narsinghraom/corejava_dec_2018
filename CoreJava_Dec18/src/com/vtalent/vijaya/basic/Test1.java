package com.vtalent.vijaya.basic;

public class Test1 {
	public static void main(String[] args) {
		Two t2=new Three();
		t2.function();
		t2.function(5);
		t2.function(t2.x,t2.y);
		System.out.println(t2.x+t2.y);
	}

}
