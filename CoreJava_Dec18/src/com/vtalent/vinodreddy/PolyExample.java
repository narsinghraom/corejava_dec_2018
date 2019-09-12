package com.vtalent.vinodreddy;

class PolyA{
	int x,y;
	public int function(int x) {
		this.x =this.x+x;
		y=y+x;
		return x;
		
	}
}
class PolyB extends PolyA{
	int y ;
	public int function(int y) {
		this.y =this.y+y;
		x=x+y;
		return y;
	}
	public int function(int x,int y) {
		this.x =this.x +x;
		this.y =this.y+y;
		return x+y;
		
	}
}
 
class PolyC extends PolyB{
	int x;
	public int function(int x,int y) {
		this.x =this.x +x;
		this.y =this.y +y;
		return x+y;
	}
}

public class PolyExample {
	public static void main(String[] args) {
	  PolyA a =new PolyB();
	  int k = a.function(5);
		/* k=a.function(k,k); */
		System.out.println(a.x+a.y);
	    System.out.println(k);
	    PolyA b =new PolyA();
	    k = b.function(k);
		/*
		 * k=b.function(k,k);
		 */		System.out.println(b.x+b.y);
	    System.out.println(k);
	    PolyB c =new PolyB();
	    k = c.function(k);
		
		k=c.function(k,k);
		System.out.println(c.x+c.y);
	    System.out.println(k);
	    	  
	}

}
