package com.vtalent.java.venkatesh;

public class FirstClass {
		public void function() {
			System.out.println("method in First Class");
		}

		public void function(int x) {

		}

		public static void main(String args[]) {
			FirstClass a1 = new FirstClass();
			a1.function();
			FirstClass a2 = new SecondClass();
			a2.function();
			SecondClass a3 = new ThirdClass();
			a3.function();
	        SecondInterface a4 = new ThirdClass();
			a4.function();
		}

	}
interface FirstInterface {
	public void function();
	
	public void function(int x, int y);
}
class SecondClass extends FirstClass {
	public void function() {
		System.out.println("method in SecondClass");
	}

}
interface SecondInterface extends FirstInterface{
public void function();
}
class ThirdClass extends SecondClass implements SecondInterface{
public void function() {
	System.out.println("method in ThirdClass");
}

public void function(int x, int y) {
	System.out.println("method in ThirdClass with two parameters");
	
}
}
