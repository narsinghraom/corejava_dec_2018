package com.vtalent.rakesh;

public class CalculatorThree extends CalculatorTwo {
	public static void main(String args[]) {
		CalculatorTwo q = new CalculatorThree();

		String z = q.addStrings("rak", "esh");
		System.out.println(z);
	}
}