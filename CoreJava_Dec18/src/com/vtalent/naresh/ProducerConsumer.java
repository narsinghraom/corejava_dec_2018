package com.vtalent.naresh;

/* class Producer extends Thread{
	private PutGet pg;
	private int number;
		public Producer(PutGet pg1,int number) {
			this.pg=pg1;
			this.number=number;
		}
		
		public void run() {
			for(int i=0;i<10;i++) {
			pg.put(i);	
			System.out.println("Producer-- "+this.number+" Put-- "+i);
				try {
					sleep((int)Math.random()*100);
				}
				catch(InterruptedException e) {}
			}
		}
}

class Consumer extends Thread{
	private PutGet pg;
	private int number;
	public Consumer(PutGet pg1,int number) {
		pg=pg1;
		this.number=number;
		
	}
	
	public void run() {
		int valuegot=0;
		for(int i=0;i<10;i++) {
			valuegot=pg.get();
			System.out.println("Consumer-- "+this.number+" Got--"+valuegot);
		}
	}
}

class PutGet{
	private int contents;
	private boolean available=false;
	
		public synchronized int get() {
			while(available ==false) {
				try {
					wait();
				}
				catch(InterruptedException e) {}
			}
		
		
		available =false;
		notifyAll();
		return contents;
}



public synchronized void put(int value){
	while(available==true) {
		try {
			wait();
		}
		catch(InterruptedException e) {}
	}
	
	contents =value;
	available =true;
	notifyAll();
		
}



}
  class ProducerConsumer {
	public static void main(String[] args) {
		PutGet pg=new PutGet();
		Producer p=new Producer(pg,1);
		Consumer c=new Consumer(pg,1);
			p.start();
			c.start();

	}

} */

  
  
class ProducerConsumer{  
	   public static void main(String[] args) {
	      CubbyHole c = new CubbyHole();
	      Producer p1 = new Producer(c, 1);
	      Consumer c1 = new Consumer(c, 1);
	      p1.start(); 
	      c1.start();
	   }
	}
	class CubbyHole {
	   private int contents;
	   private boolean available = false;
	   
	   public synchronized int get() {
	      while (available == false) {
	         try {
	            wait();
	         } catch (InterruptedException e) {}
	      }
	      available = false;
	      notifyAll();
	      return contents;
	   }
	   public synchronized void put(int value) {
	      while (available == true) {
	         try {
	            wait();
	         } catch (InterruptedException e) { } 
	      }
	      contents = value;
	      available = true;
	      notifyAll();
	   }
	}
	class Consumer extends Thread {
	   private CubbyHole cubbyhole;
	   private int number;
	   
	   public Consumer(CubbyHole c, int number) {
	      cubbyhole = c;
	      this.number = number;
	   }
	   public void run() {
	      int value = 0;
	      for (int i = 0; i < 10; i++) {
	         value = cubbyhole.get();
	         System.out.println("Consumer #" + this.number + " got: " + value);
	      }
	   }
	}
	class Producer extends Thread {
	   private CubbyHole cubbyhole;
	   private int number;
	   public Producer(CubbyHole c, int number) {
	      cubbyhole = c;
	      this.number = number;
	   } 
	   public void run() {
	      for (int i = 0; i < 10; i++) {
	         cubbyhole.put(i);
	         System.out.println("Producer #" + this.number + " put: " + i);
	         try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
	      } 
	   }
	} 