package com.vtalent.java.mahesh;
public class sample {
int x,y;
static float f;
public void function(){
	x=5;
	y=x+5;
}
public static float function(int x){
	f=x+0.5f;
	return f;
}
public static void main(String[] args){
	sample sample=new sample();
	sample.function();
	f=function(sample.y);
	System.out.println(sample.x+sample.y);
	System.out.println(f);
}
}