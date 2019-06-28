package com.vtalent.amreen;

public class HashCodeEx {
	static String s;
	static String q = new String("abc");
	static String q1 = new String("abc");
	static String s1 = "abc";
	int i;
	int j;

	public static void main(String[] args) {
		HashCodeEx obj = new HashCodeEx();
		HashCodeEx obj1 = new HashCodeEx();
		/*
		 * String s = "abc"; String q = new String("abc"); String s1 = "abc";
		 * System.out.println(s.equals(q)); System.out.println(s == q);
		 * System.out.println(s.equals(s1)); System.out.println(s == s1);
		 * System.out.println(q.equals(q1)); System.out.println(q == q1);
		 */
		obj.i = 10;
		obj.j = 10;

		obj1.i = 10;
		obj1.j = 11;

		System.out.println(obj.equals(obj1));
		int result = obj.hashCode();
		System.out.println(result);
		int result2 = obj1.hashCode();
		System.out.println(result2);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeEx other = (HashCodeEx) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}

}