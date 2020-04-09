package com.vtalent.corejava.suma;

class Sample{
	int x;
	public void function(int x){
		this.x=this.x+x;
	}
	public void function(){
		System.out.println(x);
	}
	
}
class Sample1 extends Sample{
	 int x,y;
	public void function(int x){
		this.x=this.x+x+2;
		y=x;
		
	}
	public void function(int x, int y){
		this.x=this.x+x;
		this.y=this.y+y;
		
	}
}
class PolyMorph {
	public static void main(String[] args){
		Sample1 s1=new Sample1();
		s1.function(2);
		s1.function(2,3);
		s1.function();
		System.out.println(s1.x);
		System.out.println(s1.y);
		
		
	}

	
}
