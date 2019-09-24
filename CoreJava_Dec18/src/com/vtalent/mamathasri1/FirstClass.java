package com.vtalent.mamathasri1;


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
		a4.function(1,3);
	}



}
