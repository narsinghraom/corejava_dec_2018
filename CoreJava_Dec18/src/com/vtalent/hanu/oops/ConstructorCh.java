package com.vtalent.hanu.oops;

public class ConstructorCh {
	
	public ConstructorCh() {
		this("Hanuman");
		System.out.println("Super no param");
		// TODO Auto-generated constructor stub
	}
	public ConstructorCh(String n) {
		this(n,239);
		System.out.println("Super one paraam");
		// TODO Auto-generated constructor stub
	}
	public ConstructorCh(String n,int m) {
		System.out.println("Super two param");
		// TODO Auto-generated constructor stub
	}

}
