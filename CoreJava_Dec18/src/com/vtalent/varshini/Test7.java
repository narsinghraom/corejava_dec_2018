package com.vtalent.varshini;

class First10
{
	int x,y;
	public int function(int x) {
		this.x=this.x+x;
		y=y+x;
		return x;
	}
}
 class Second10 extends First10 {
	
	int y;
	public int function(int y) {
		this.y=this.y+y;
		x=x+y;
		return y;
	}
public int function (int x,int y) {
	this.x=this.x+x;
	this.y=this.y+y;
	return x+y;
}
}
 class Third10 extends Second10{
	int x;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Third10 t1=new Third10();
    int k=t1.function(5);
    k=t1.function(k, k);
    System.out.println(k);
    System.out.println(t1.x+t1.y);
    
    Second10 s1=new Third10();
    k=s1.function(k);
    k=s1.function(k, k);
    System.out.println(k);
    System.out.println(t1.x+t1.y);
    
    First10 f1=new Third10();
    k=f1.function(k);
   // k=f1.function(k,k);
    System.out.println(k);
    System.out.println(f1.x+f1.y);
	}

}
