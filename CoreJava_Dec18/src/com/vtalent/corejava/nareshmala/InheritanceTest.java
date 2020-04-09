package com.vtalent.corejava.nareshmala;

class Demop2 {
int x,y;
public void function(int x){
this.x=this.x+x;
y=x+y;
}
}
class Demo1p2 extends Demop2{
	int x;
	public void functionone(int x,int y){
	this.x=this.x+x;
	this.y=this.y+y;
	}
}
public class InheritanceTest{
	public static void main(String[] args){
		Demo1p2 dip=new Demo1p2();
		dip.function(5);
		dip.functionone(5,10);
		System.out.println(dip.x+" "+dip.y);
		Demop2 dp=new Demop2();
		dp.function(5);
		System.out.println(dp.x+" "+dp.y);
	}	
	}