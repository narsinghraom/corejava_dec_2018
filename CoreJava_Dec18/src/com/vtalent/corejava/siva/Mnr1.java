package com.vtalent.corejava.siva;

public class Mnr1 {
	Mnr1 mnr;
	int i;
	Mnr1()
	{
		mnr=new Mnr1();
	}
	public static void main(String[] args) {
		Mnr1 mnr=new Mnr1();
		mnr.i=5;
		System.out.println(mnr.i);
	}

}
