package com.vtalent.jyothsna;
class One11{
	int x,y,z;
	public void function(int x) {
		this.x=this.x+x;
		y=x;
		
	}
	public void function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
	}
}
class Two11 extends One11{
	int x,z;
	public void function() {
		x=10;
	}
	public void function(int x) {
		this.x=this.x+x;
		
	}
}
class Three11 extends Two11{
	int z;
	public void function(int x,int y,int z) {
		this.x=this.x+x;
		this.y=this.y+y;
		this.z=this.z+z;
		
	}
	public void function(int x,int y) {
		this.x=this.x+x;
		this.y=y;
	}
	
}
public class Test {
	public static void main(String[] args) {
		Two11 t1=new Three11();
		t1.function();
		t1.function(5);
		t1.function(t1.x,t1.y);
		//t1.function(t1.x,t1.y,t1.z);
		System.out.println(t1.x+t1.y);
		One11 o1=new Three11();
		//o1.function();
		o1.function(10);
		o1.function(o1.x,o1.y);
		//t1.function(o1.x,o1.y,o1.z);
		System.out.println(o1.x+o1.y);
		One11 on=new Two11();
		//on.function();
		on.function(3);
		on.function(on.x,on.y);
		//t1.function(on.x,on.y,on.z);
		System.out.println(on.x+on.y);
		Three11 th=new Three11();
		
		th.function();
		th.function(3);
		th.function(th.x,th.y);
		th.function(th.x,th.y,th.z);
		System.out.println(th.x+th.y);
	}

}