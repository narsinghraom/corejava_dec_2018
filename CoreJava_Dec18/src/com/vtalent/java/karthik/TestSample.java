package com.vtalent.java.karthik;

public class TestSample {
int a,b;//non static or instance
static float x,y;//static variables

public void functionOne(int a,int b)//local variables
{
	this.a=a+b;//25 
	this.b=b+a;//25
	this.a=this.b+a+b;//25+10+15=50
	System.out.println(this.a+" and "+this.b);
	
}
	
public static void functionTwo(float x,float y)
{
TestSample.x=x+y;//25.0
TestSample.y=y+x;//25.0
System.out.println(TestSample.x+TestSample.y );
}
	
	public static void main(String[] args ){
	TestSample ts=new TestSample();
	ts.functionOne(10, 15);
 functionTwo(10.0f, 15.0f);
	System.out.println(ts.a);
	System.out.println(ts.b);
	
	}

}
