package com.vtalent.suma3;

	class One{
		int x,y;
		public void function(int x)
		{
			this.x=this.x+x;
			y=x;
		}
	
	public void function (int x, int y)
	{
		this.x=this.x+x;
		this.y=y;
		
	}

}
	class Two extends One
	{
		int x;
		public void function()
		{
		x=10;
		}
		
	public void function( int x,int y)
	{
		this.x=this.x+x;
		this.y=this.y+y;
	}
	}
	class Three extends Two
	{
		int x,y,z;
		public void function( int x,int y,int z)
		
		{
			this.x=this.x+x;
			this.y=this.y+y;
			this.z=this.x+this.y;
		}
	}
	public class Test1
	
	{
		public static void main( String [] args)
		{
		Two t1= new Three();
		t1.function();
		t1.function(5);
		t1.function(t1.x,t1.y);
	System.out.println(t1.x+t1.y);
		
	}
	}