
package com.vtalent.srihari;
class MyThread extends Thread {
	public void start(){
		super.start();
		System.out.println("start");
		
	}
	public void run(){
		for (int i = 0; i <=2; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class MultiTest {

	public static void main(String[] args) {
		 MyThread t = new MyThread();
		 t.start();
		 System.out.println("Parent Thread,, ");
		 
	}

}
