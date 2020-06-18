package com.vtalent.suma3;


class First4{
	int x,y;
	public int function(int x) {
		this.x=this.x+x;
		y=y+x;
		return x;
	}
}
class Second4 extends First4{
	int y;
	public int function(int y) {
		this.y=this.y+y;
		x=x+y;
		return y;
	}
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
	}
class Third4 extends Second4{					
	int x;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
	}

public class Test8
{

	public static void main(String[] args) {
		First4 f1=new First4();
		int k=f1.function(5);
		System.out.println(k);  // 5
		System.out.println(f1.x+f1.y);     // 10
		
		First4 f2=new Second4();
		 k=f2.function(k);
		System.out.println(k); // 5
		System.out.println(f2.x+f2.y);  //5
		
		First4 f3=new Third4();
		k=f3.function(k);
		System.out.println(k); // 5
		System.out.println(f3.x+f3.y);  //5
		
		Second4 s1=new Second4();
		k=s1.function(k);
		k=s1.function(k,k);
		System.out.println(k);  //10
		System.out.println(s1.x+s1.y); //20
		
		Second4 s2=new Third4();
		k=s2.function(k);
		k=s2.function(k,k);
		System.out.println(k); //20
		System.out.println(s2.x+s2.y);  // 30
		
		Third4 t1=new Third4();
		k=t1.function(k);
		k=t1.function(k,k);  
		System.out.println(k); // 40 
		System.out.println(t1.x+t1.y); //60
		}

}

