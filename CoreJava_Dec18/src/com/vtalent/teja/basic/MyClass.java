package com.vtalent.teja.basic;




class Outer{
	int x = 20;
	public String toString() {
		return "WelCome to Outer Class";
	}	
	
	class Inner{
		int y = 30;
		
		
	public String toString() {
	return "WelCome to Inner Class";
}	

}}
class MainClass{
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(outer);
		System.out.println(inner);
		
		
		
	}
}
