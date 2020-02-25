package com.vtalent.corejava.sunil;

public class ConsEx1 {
int x;
int y;
ConsEx1(){
	x=2;
	y=5;
			
}
ConsEx1(int x){
	this();
this.x=this.x+y;
y=x+y;
}
ConsEx1(int x,int y){
	this(x+y);
this.x=this.x+x;
this.y=this.y+y;
}

	public static void main(String[] args) {
		/*
		 * ConsEx1 c1=new ConsEx1(); 
		 * System.out.println(c1.x+c1.y); 
		 * ConsEx1 c2=new
		 * ConsEx1(5); System.out.println(c2.x+c2.y);
		 */
		ConsEx1 c3=new ConsEx1(2,5);
         System.out.println(c3.x+c3.y);

	}

}
