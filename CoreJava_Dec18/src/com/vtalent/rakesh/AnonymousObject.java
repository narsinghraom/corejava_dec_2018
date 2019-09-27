package com.vtalent.rakesh;

public class AnonymousObject {
	int q;
	private int f;
	static AnonymousObject h;

	public AnonymousObject() {
		try {
			int e = 10;
			int r = e / 2;
			this.q = r;
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	public int operations(int q) {

		AnonymousObject n1 = new AnonymousObject();
        f=20;
		this.q =	this.f+ q	;
		// this.q = 1;
		double m = 0;
		System.out.println(m);
		return (int) m;

	}

	public static void main(String[] args) {
		h = new AnonymousObject();
		// int l = new AnonymousObject().operations(8);

		// h.operations(1);
		// System.out.println(l);
	h.operations(h.q);
		System.out.println(h.q);
		// char f = ' ';
		// double q = 5.5555555;
		// double q1 = Math.round(q);
		// System.out.println(q1);
	}
}
