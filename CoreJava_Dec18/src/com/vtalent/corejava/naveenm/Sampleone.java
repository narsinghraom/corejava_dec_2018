package com.vtalent.corejava.naveenm;

public class Sampleone {
static float f1,f2;
int x,y;
public int function(int x,int y){
	x=x+y;
	y=x+y;
	this.x=this.x+x;
	this.y=this.y+y;
	return x+y;
}
public static float function(float f1,float f2){
	f1=f1+f2;
	f2=f1+f2;
	Sampleone.f1=Sampleone.f1+f1;
	Sampleone.f2=Sampleone.f2+f2;
	return f1+f2;
}
public static void main(String[] args) {
	float f1=function(1.5f,1.5f);
	Sampleone s1=new Sampleone();
	f1=f1+s1.function((int)f1,(int )(f1+2));
	
System.out.println(f1);
System.out.println(s1.x+s1.y);
System.out.println(s1.f1+f2);
}
}

