package com.vtalent.rakesh;

public class StringAdd {
	int n;
	String s = "rakesh";
	String s1 = "proddutur";

	public String function(String q, String h) {
		String r = "";
		this.s = q;
		r = q + h;
		this.s1 = r;
		return r;

	}

	public StringAdd(int l) {
		this.n = l;
	}

	public StringAdd() {

	}

	public static void main(String[] args) {
		StringAdd q = new StringAdd();
		String s2 = q.s + q.s1;
		StringAdd q1 = new StringAdd(7);

		String s4 = s2;

		String s3 = s4;
		s2.isEmpty();
		System.out.println(s4);
		char[] ch = new char[q.s.length()];
		for (int i = 0; i <= q.s.length() - 1; i++) {
			ch[i] = q.s.charAt(i);
		}
		for (int i = 0; i <= ch.length - 1; i++) {
			System.out.print(ch[i]);
		}
		String y = q.function("ra", "ke");
		System.out.println(y);
		System.out.println(q.s1);

		double p = 5.0;
		int x = (int) p;
		System.out.println(x);

		StringAdd h = new StringAdd(6);
		System.out.println(h);
		String s = new String("abc");
		String s1 = new String("abc");
		if (s.equals(s1)) {
			System.out.println("equals");
		}
		String f = "abc";
		String d = "abc";
		if (f == d) {
			System.out.println("==");
		}
		if (s.equals(d)) {
			System.out.println("String object to literal comparision");
		}
		Integer itr = new Integer(5);
		String z = itr.toString();
		System.out.println(z);
		String m = "12";
		Integer o = new Integer(m);
		Integer r = new Integer("14");
		int r1 = 8;
		String i1 = r.toString();
		System.out.println(o);

	}

}
