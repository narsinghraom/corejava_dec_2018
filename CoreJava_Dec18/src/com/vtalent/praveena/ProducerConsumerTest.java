package com.vtalent.praveena;

class InterThread
{
	int i;
//To get the value after put the value we need to use boolean and make the put method to wait until get completes and viceversa
	boolean valueSet=false;
	public synchronized void put(int i)
	{
		while(valueSet)
		{
			try{wait();}catch(Exception e){}
		}
		valueSet=true;
		this.i=i;
		System.out.println("Producer Put value is : "+i);
		valueSet=true;
		//this notify will notify consumer's thread 

		notify();

	}
	public synchronized void get()
	{
		
		while(!valueSet)
		{
			try{wait();}catch(Exception e){}

		}
		System.out.println("consumer get value is :"+i);

		valueSet=false;
		//this notify will notify producer's thread 
		notify();
	}
	
}
class ProducerThread extends Thread
{
	InterThread obj=new InterThread();

	//creating constructor with one argument with an object(where communication of producer and consumer is happening)
	
	public ProducerThread(InterThread Ith)
	{
	obj=Ith;
	Thread Pth=new Thread(this,"ProducerThread");
	Pth.start();
	
	}
	public void run()
	{
		int i=0;
		for(int j=0;j<5;j++)
		//while(true)
		{
			obj.put(i++);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
		
		
	}
}

//class ConsumerThread implements Runnable
class ConsumerThread extends Thread

{
	InterThread obj=new InterThread();
	public ConsumerThread(InterThread Ith)
	{
	obj=Ith;
	//Thread Cth=new Thread(this,"ConsumerThread");
	//Cth.start();
	
	}
	public void run()
	{
		for(int j=0;j<5;j++)

		//while(true)
		{
			obj.get();
			try{Thread.sleep(1000);}catch(Exception e){}

		}
	
	}
}

public class ProducerConsumerTest {

	public static void main(String[] args)
	{
		//created object of the synchronized class and passing to the threads
		InterThread Ith=new InterThread();
		new ProducerThread(Ith);
		ConsumerThread Cth=new ConsumerThread(Ith);
		Cth.start();
		//new ConsumerThread(Ith);
	}
}

