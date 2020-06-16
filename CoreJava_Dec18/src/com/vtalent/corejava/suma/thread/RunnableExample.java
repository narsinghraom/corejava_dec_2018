package com.vtalent.corejava.suma.thread;


public class RunnableExample implements Runnable{

	public static void main(String[] args) {

		RunnableExample r1 = new RunnableExample();
		Thread t1 = new Thread(r1);
		t1.start();
		//t1.start= calling multiple times(java doesn't support multiple inheritance
		t1.run();
	}

	public void run() {
		System.out.println("This is run method");
		
	}

}
