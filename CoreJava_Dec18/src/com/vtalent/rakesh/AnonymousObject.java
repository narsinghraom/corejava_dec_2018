package com.vtalent.rakesh;

public class AnonymousObject {
	int q;
	static AnonymousObject h;

	public AnonymousObject() {
		try {
			int e = 7;
			int r = e / 0;
			this.q = r;
		} catch (Exception e) {
		}
	}

	public int operations(int q) {
		AnonymousObject n1 = new AnonymousObject();
		this.q = 5;
		// this.q = 1;
		double m = 0;
		System.out.println(m);
		return (int) m;

	}

	public static void main(String[] a) {
		h = new AnonymousObject();
		// int l = new AnonymousObject().operations(8);

		// h.operations(1);
		// System.out.println(l);
		System.out.println(h.q);
		// char f = ' ';
		// double q = 5.5555555;
		// double q1 = Math.round(q);
		// System.out.println(q1);
	}
}
