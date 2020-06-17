package com.vtalent.tarun.basics;

public class RunnableEx implements Runnable{

		public static void main(String[] args) {

			RunnableEx r1 = new RunnableEx();
			Thread t1 = new Thread(r1);
			t1.start();
		}

		public void run() {
			System.out.println("This is run method");
			
		}

	}
