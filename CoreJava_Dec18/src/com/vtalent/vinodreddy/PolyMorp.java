package com.vtalent.vinodreddy;

class PolyFirst{
int x,y;
public int function(int x) {
	this.x =this.x+x;
	y=y+x;
	return x;
	
}
}
class PolySecond extends PolyFirst{
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
class PolyThird extends PolySecond{
	int x;
	public int function(int x,int y) {
		this.x =this.x+x;
		this.y =this.y+y;
		return x+y;
	}
	

}

public class PolyMorp {
	public static void main(String[] args) {
		PolyThird t1 =new PolyThird();
		int k = t1.function(5);
		k=t1.function(k,k);
		System.out.println(t1.x+t1.y);
	    System.out.println(k);
	    PolySecond s1 =new PolyThird();
	    k =s1.function(k);
	    k =s1.function(k, k);
	    System.out.println(s1.x+s1.y);
	    System.out.println(k);
	    PolyFirst f1 =new PolyThird();
	    k =f1.function(k);
		/*
		 * k =f1.function(k, k);
		 */	    
	    System.out.println(f1.x+f1.y);
	    System.out.println(k);
	    
	    
	    
	    
	    
		
	}

}



