package com.vtalent.mohammad;

class One1{
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
class Two2 extends One1{
	int x;
	public void function() {
		x=10;
	}
	public void function(int x) {
		this.x=this.x+x;
	}
}
public class Test2 {
	public static void main(String[] args) {
		One1 one=new Two2();
		//one.function();
		one.function(5);
		one.function(one.x,one.y);
		
		System.out.println("Adding throughout Overriding "+(one.x+one.y));
	}

}