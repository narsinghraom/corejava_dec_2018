package com.vtalent.java.haritha.narsingh;

public class RunnableEx implements Runnable{

	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println(Thread.currentThread()+"= " +i);
		}
	}
public static void main(String[] args) {
	RunnableEx r1= new RunnableEx();
	Thread t1 = new Thread(r1);
	t1.start();
}
}
