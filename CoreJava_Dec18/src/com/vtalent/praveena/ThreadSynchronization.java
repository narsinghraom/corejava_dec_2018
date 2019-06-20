package com.vtalent.praveena;
class counter
{
	int count;
	public synchronized void increment()
	{
	count++;	
	}
}

public class ThreadSynchronization {
public static void main(String[] args) throws Exception
{
	final counter C=new counter();
	Thread t1=new Thread(new Runnable()
	{
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			C.increment();
		}
	}
	});
	Thread t2=new Thread(new Runnable(){
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			C.increment();
		}
	}
	});
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println("count value is: "+C.count);
	
}
}
