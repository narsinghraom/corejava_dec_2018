package com.vtalent.mamathasri1;

public class one {
	int x,y;
	public int function(int x,int y)
	{
	this.x  =this.x+x;
	this.y =this.y+y;
	return x+y;
	}
}
class two extends one
{
	public int function(int x)
	{
		this.x=this.x+x;
		super.x=super.x+x;
		return super.x+x;
class third extends two
{
	float f1;
	int y;
	public float functionone(int y,float f1)
	{
		super.y=super.y+y;
		this.y=this.y=super.y;
		this.f1=this.f1+f1;
		return f1;
	}
}
class test
{
	public static void main() {
		Three t1=new Three();
		
	int k=t1.function(t1.function(2,3));
		float f1=t1.fuctionone(k,t1.y);
		System.out.println(k);
		System.out.println(f1);
	}
}

	
	
	

	
	

}
