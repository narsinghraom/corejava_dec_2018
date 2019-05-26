package com.vtalent.naresh;


class Demo1{
	int x,y;
	static int z;
	public void function(int z) {
		this.x=this.x+x;
		y=x+y;
		this.z=x+y;	
	}
	
	public void function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
	}
	
}
class Demo2 extends Demo1{
	static int z;
	int x;
	public void function(int x) {
		this.x=this.x+x+z;	
	}
	}

class Demo3 extends Demo2{
	public void function() {
		System.out.println(x); 	//6
		System.out.println(y);	//2
	}
	
	public void function(int x, int y) {
		this.x=this.x+x+z;
		this.y=this.y+y+z;
	}
}


public class Inherit_P3 {
	public static void main(String[] args) {
		Demo1 d =new Demo3();
		d.function(5);
		d.function(5, 2);
		//dp3.function();
		
		Demo2  d2 =new Demo3();
		d2.function(3);
		d2.function(3, 2);
		//dp3.function();
		
		Demo3 d3=new Demo3();
		d3.function(3);
		d3.function(3, 2);
		d3.function();	
		
			System.out.println(d.x+"  "+d.y); // 0  2
			System.out.println(d2.x+"  "+d2.y);//6  2
			System.out.println(d3.x+"  "+d3.y);//6  2
	}

}
