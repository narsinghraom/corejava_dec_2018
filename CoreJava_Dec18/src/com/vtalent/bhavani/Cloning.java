package com.vtalent.bhavani;

class Cloning implements Cloneable {
	int rollno;
	String name;

	Cloning(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	/*
	 * there is three types to copy an object 1.shallow copy 2.deep copy
	 * 3.clone()
	 */

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			Cloning s1 = new Cloning(101, "bhanu");

			Cloning s2 = (Cloning) s1.clone();
			s2.rollno = 10000;
			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}

	}
}
