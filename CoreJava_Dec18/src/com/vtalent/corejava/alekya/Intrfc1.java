package com.vtalent.corejava.alekya;

class Intrfc1 {
	public static void main(String args[]) {
		Son obj=new Son();
		obj.disp();
		
		
	}

}
class Father{
	int a=10;
	int add(int y)
	{
		int b=y;//b=20
		System.out.println(y);
		return(a+b);//10+20
	}
}
interface Mother{
	int c=30;
	void disp();
}
class Son extends Father implements Mother{
	int m=a*Mother.c;//10*30=300 will store in m
	int sum=add(20);//add(20) is returning 30 so 30 will store in sum 
	public void disp()
	{
		System.out.println("Add ="+sum);
		System.out.println("Multi ="+m);
		
	}
	}

