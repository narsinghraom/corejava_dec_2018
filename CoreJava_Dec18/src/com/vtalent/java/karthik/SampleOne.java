 package com.vtalent.java.karthik;

public class SampleOne {
	int x,y;//non static or instance
	static float f1,f2;//static variables
	public int functionOne(int x,int y){//local variables int a,b
		x=x+y;//
		y=x+y;//
		this.x=this.x+x;//
		this.y=this.y+y;//
		return x+y;//
	}
public static float functionTwo(float f1,float f2){//static method no need of this
	f1=f1+f2;//local variables
	f2=f1+f2;//local variables
	SampleOne.f1=SampleOne.f1+f1;//static method we have to call through context name
	SampleOne.f2=SampleOne.f2+f2;//
	//System.out.println(SampleOne.f1+3);
	//System.out.println(SampleOne.f2+5);
	return f1+f2;//
}
public static void main(String []args){
	float f=functionTwo(1.5f,1.5f);
	SampleOne s1=new SampleOne();
	f=f+s1.functionOne((int)f1,(int)f1+2);
	System.out.println(f);
	System.out.println(s1.x+s1.y);
	System.out.println(f1);
	System.out.println(f2);
}
}
