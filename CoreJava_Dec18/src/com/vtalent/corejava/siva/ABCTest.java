package com.vtalent.corejava.siva;

class ABC {
	ABC()
	{
		System.out.println("hello john");
	}
	ABC(int x)
	{
		this();
		System.out.println("welcome to india");
	}

}
public class ABCTest{
	public static void main(String[] args) {
		ABC obj=new ABC(12);
		
	}
}
