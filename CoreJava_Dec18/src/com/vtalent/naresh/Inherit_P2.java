package com.vtalent.naresh;


class DemoP2{
	int x,y;
	public void function(int x) {
		this.x=this.x+x;
		y=x+y;
	}
	
	public void function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
	}
	
}
class Demo1P2 extends DemoP2{
	int x;
	public void function(int x) {
		this.x=this.x+x;	
	}
	}


public class Inherit_P2 {
	public static void main(String[] args) {
			Demo1P2 d1p=new Demo1P2();
				d1p.function(5);
				d1p.function(5, 10);
				System.out.println(d1p.x+"  "+d1p.y); //5  10
				
				DemoP2 dp=new Demo1P2();
					dp.function(5);
					dp.function(10, 5);
					System.out.println(dp.x+"  "+dp.y );//10  5
	}

}
