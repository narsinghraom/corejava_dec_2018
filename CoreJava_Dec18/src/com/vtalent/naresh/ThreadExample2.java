package com.vtalent.naresh;

class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class Hello extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try {Thread.sleep(1000);}catch(Exception e) {}
	}
}
}
public class ThreadExample2 {
	public static void main(String[] args)throws Exception {
			Hi obj1=new Hi( );
			Hello obj2=new Hello();
			
			//System.out.println(obj1.getName());
				obj1.start();
				obj1.join();
				System.out.println(obj1.isAlive());
				try {Thread.sleep(500);}catch(Exception e) {}
					obj2.start();
		//wait for obj1 and obj2 to complete their process and then it will join main method.
				//	obj1.join();
					obj2.join();
					System.out.println("Bye");
					System.out.println(obj1.isAlive());
					
	}

}
