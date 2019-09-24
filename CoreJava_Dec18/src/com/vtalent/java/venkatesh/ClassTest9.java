package com.vtalent.java.venkatesh;

class First7{
	int x,y;
	public int function(int x) {
		this.x=this.x+x;
		y=y+x;
		return x;
	}
}
class Second7 extends First7{
	int y;
	public int function(int y) {
		this.y=this.y+y;
		x=x+y;
		return y;
	}		
		public int function(int x,int y) {
			this.x=this.x+x;
			this.y=y+y;
			return x+y;
		}
	}
class Third7 extends Second7{
	int x;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
}
public class ClassTest9 {
public static void main(String[] args) {
	//third to third
	Third7 t1=new Third7();
	int k=t1.function(5);
	k=t1.function(k,k);
	System.out.println(k);
	System.out.println(t1.x+t1.y);
	//second to third
	Second7 s1= new Third7();
	k=s1.function(k);
	k=s1.function(k,k);
	System.out.println(k);
	System.out.println(s1.x+s1.y);
	//first to third
	First7 f1=new Third7();
	k=f1.function(k);
	/* k=f1.function(k,k); */
	System.out.println(k);
	System.out.println(f1.x+f1.y);
	//first to second
	First7 f2=new Second7();
	k=f2.function(k);
	/* k=f2.function(k,k); */
    System.out.println(k);
    System.out.println(f1.x+f1.y);
    //first to first
    First7 f3=new First7();
    k=f3.function(k);
	/* k=f3.function(k,k); */
    System.out.println(k);
    System.out.println(f1.x+f1.y);
    //second to third
    Second7 s2= new Third7();
	k=s2.function(k);
	k=s2.function(k,k);
	System.out.println(k);
	System.out.println(s1.x+s1.y);
}
}
