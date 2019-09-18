package com.vtalent.java.haritha;
interface Writable{
	void writes();
}
interface Readable{
	void reads();
}

class Student12 implements Readable, Writable {
	public void reads() {
		System.out.println("reading");
	}

	public void writes() {
		System.out.println("writing");
	}

	public static void main(String args[]) {
		Student12 s = new Student12();
		s.reads();
		s.writes();
	}
}

 


