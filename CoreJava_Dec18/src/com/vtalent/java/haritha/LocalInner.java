package com.vtalent.java.haritha;

public class LocalInner {
public int i;
public int function() {
	class Local{
		int lo;
		public int function() {
			System.out.println("Local class methods");
			return lo+5;
		}
	}//local class end
	Local l=new Local(); 
	l.lo=10;
	return l.function();	
}
public static void main(String[] args) {
	LocalInner le=new LocalInner();
	le.i=le.function();
	System.out.println(le.i);
}
}
