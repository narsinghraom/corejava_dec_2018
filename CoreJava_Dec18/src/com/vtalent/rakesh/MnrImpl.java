package com.vtalent.rakesh;

public class MnrImpl extends AbcImpl implements Mnr {

	public void function() {

		System.out.println("function method value =" + (x + y));

	}

	public static void main(String args[]) {
		MnrImpl q = new MnrImpl();
		q.function();

	}

	public class Qwerty {

	}
}
