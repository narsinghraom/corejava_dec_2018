package com.vtalent.java.vishnu;
interface Example {
	int k=10;
	 void method1();
	 void method2(int x,double y); 
	
}
class Xyz implements Example{
	int k;
	int x;
	double y;
	
	public void method2(int x,double y){
	System.out.println(x+(int)y);
	
	
}
public class Test {

}
