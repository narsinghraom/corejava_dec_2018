package com.vtalent.corejava.siva;

public class Threadss extends Thread{
	public void run(){
		System.out.println("the run method call by state method");
		for(int i=0;i<=5;i++){
			System.out.println("the value of i:"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]){
		Threadss t1 = new Threadss();
		t1.start();
		//t1.start();
		t1.run();
		Threadss t2 = new Threadss();
		t2.start();
		t2.run();
		
	}

}
