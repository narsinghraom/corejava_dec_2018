package com.vtalent.sampath;

 class Constructor{
	int x,y;
	Constructor() {
		x=5;
		y=7;
	}
	Constructor (int x){
		this.x=this.x+x;
		y=y+this.x;
	}
	Constructor (int x,int y){
		this.x=this.x+x;
		this.y=this.y+y;
		
	}
	public static void main(String args[]) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(5);
		Constructor c3=new Constructor(5,5);
		System.out.println(c1.x+c1.y);
		System.out.println(c2.x+c2.y);
		System.out.println(c3.x+c3.y);
		
	}
	
	

}
