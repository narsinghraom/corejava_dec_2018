package com.vtalent.rakesh;

public class Exceptions {
	int[] array = new int[4];
	String str;

	public void function() throws Exception {
		int i = 1 / array[0];
		char ch = str.charAt(0);
		array[3] = 2;
		array[5] = 2;

	}

	public static void main(String[] args) {
		Exceptions e = new Exceptions();
		try {
			e.function();
		} catch (Exception y) {
			System.out.println(y);
		} finally {
			e.array[3] = 2;

			try {
				e.array[7] = 7;
			} catch (Exception q) {

			}
		}
		e.array[3] = 3;
		for (int i = 0; i <= e.array.length - 1; i++) {
			System.out.print(e.array[i]);

		}
		e.str = "rakesh";

	}
}
