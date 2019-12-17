package com.vtalent.mohammad;

public class This_Example {
	
	int x, y;
	static float f1,f2;
	public void function()
	{
		f1=2.5f;
	}
	public int function(int x,int y)
	{
		this.x=x+(int)x;
		this.y=y+(int)y;
		return this.x+this.y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Example t1=new This_Example();
		t1.function();
		int k =t1.function(4, 5);
		System.out.println(k);
		System.out.println(t1.x+t1.y);
		System.out.println(f1);
	}

}
