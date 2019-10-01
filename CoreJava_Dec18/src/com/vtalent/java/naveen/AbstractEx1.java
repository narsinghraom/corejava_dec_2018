package com.vtalent.java.naveen;

abstract class Demo14 {
	int x, y;

	public int add(int x, int y) {
		System.out.println(x + y + "aadd");
		return x + y;
	}

	public abstract String details(String name, String id);

	public abstract Float sub(float x, int y);

	public int div(int x, int y) {
		return x / y;
	}

}

public class AbstractEx1 extends Demo14 {

	public static void main(String[] args) {
		AbstractEx1 an = new AbstractEx1();
		System.out.println(an.add(14, 27));
		an.sub(11, 02);
		System.out.println(an.div(523, 206));
		an.details("NAVEEN", " 1");

	}

	@Override
	public String details(String name, String id) {
		System.out.println(name + " " + id);
		return name + id;
	}

	@Override
	public Float sub(float x, int y) {
		System.out.println(x - y);
		return x - y;
	}

}
