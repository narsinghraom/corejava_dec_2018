package com.vtalent.corejava.siva;

class Q{
	Q q;
	int z;	
}
class P{
	float f1;
	float f2;
	P(){
		f1=2.5f;
		f2=f1+f1;
	}	
	 public static P call(){
		 P p1 = new P();
		return p1;
	 }
	 public float value(){
		return f1;		 
	 }
}
public class Mnr {
	P p;
	Q q;
	int x,y;
	
	public P sample(){
		q=new Q();
		q.q=new Q();				
		p=P.call();			
		x=(int) p.value();
		y=x+(int) p.value();		
		q.z=x+y;
		
		System.out.println("q"+" "+q.z);		
		System.out.println(p.f1+p.f2);		
		return p;
	}
	public static void main(String[] args) {
		Mnr mnr = new Mnr();
		mnr.sample();
		System.out.println(mnr.x+mnr.y);
		
	}

}
