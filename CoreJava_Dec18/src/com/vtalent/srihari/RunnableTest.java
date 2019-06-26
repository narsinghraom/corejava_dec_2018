package com.vtalent.srihari;

class MyRun implements Runnable {

	@Override
	public void run() {

		System.out.println("Child");
	}

}

public class RunnableTest {

	public static void main(String[] args) {
		MyRun r = new MyRun();
		Thread t2 = new Thread(r);
	    //r.run();
		t2.start();
		System.out.println("parent");

	}

}
