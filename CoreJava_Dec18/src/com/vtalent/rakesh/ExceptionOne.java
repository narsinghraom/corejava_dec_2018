package com.vtalent.rakesh;

public class ExceptionOne {

	int[] array = new int[4];

	String str;

	public void Function() {
		String str;
		try {
			int i = 1 / array[0];

			char ch = this.str.charAt(0);

			array[4] = 7;
		} catch (ArithmeticException e) {
			System.out.println("1st learn Maths");
		} catch (NullPointerException e) {
			System.out.println(" Null pointer ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}

	public static void main(String[] args) {
		ExceptionOne ex = new ExceptionOne();
		ex.Function();

	}
}