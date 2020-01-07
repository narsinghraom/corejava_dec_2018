package com.vtalent.mohammad;
class One{
	int x,y;
	public void function(int x) {
		this.x=this.x+x;
		y=x;
	}
	public void function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
	}
}
class Two extends One{
	int x;
	public void function() {
		x=10;
	}
	public void function(int x) {
		this.x=this.x+x;
	}
}
public class Test {
	public static void main(String[] args) {
		Two t1=new Two();
		t1.function();
		t1.function(5);
		t1.function(t1.x,t1.y);
		
		System.out.println("Adding throughout Overriding "+(t1.x+t1.y));
	}

}
