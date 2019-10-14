package com.vtalent.swamy;
	 interface FirstInterface {
		public void function();
		
		public void function(int x, int y);
	}
	interface SecondInterface extends FirstInterface{
public void function();
}
public class Interface2 {
	public void function() {
		System.out.println("method in First Class");
	}
	public void function(int x) {
	}
	public static void main(String args[]) {
		Interface2 a1 = new Interface2();
		a1.function();
		Interface2 a2 = new SecondClass();
		a2.function();
		SecondClass a3 = new ThirdClass();
		a3.function();
        SecondInterface a4 = new ThirdClass();
		a4.function();
	}
}
 class SecondClass extends Interface2 {
	public void function() {
		System.out.println("method in SecondClass");
	}
}
 class ThirdClass extends SecondClass implements SecondInterface{
public void function() {
	System.out.println("method in ThirdClass");
}

public void function(int x, int y) {
	System.out.println("method in ThirdClass with two parameters");
	
}
}

