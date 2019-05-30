package com.vtalent.rakesh;

public class InterfaceTest {
	public static void main(String args[]) {
		Abc abc1 = new MnrImpl();
		// abc1.function(2);
		// abc1.function();
		abc1.function(2, 3);

		Mnr mnr = new MnrImpl();
		// mnr.function(2);
		mnr.function(2, 3);
		mnr.function();

		Xyz xyz = new MnrImpl();
		// xyz.function(2);
		// xyz.function(2, 3);
		xyz.function();
	}
}