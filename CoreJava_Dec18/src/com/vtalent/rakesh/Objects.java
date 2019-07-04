package com.vtalent.rakesh;

public class Objects {
	int x = 0;

	public static void main(String[] args) {
		Objects o = new Objects();

		Objects o1 = new Objects();
		System.out.println(o);
		System.out.println(o1);

		System.out.println(o.equals(o1));

	}

}
