package com.vtalent.java.venkatesh;

public class LocalOuter {
public int i;
public int function() {
	class Local{
		int lo;
		public int function() {
			System.out.println("local class methods");
			return lo+5;
		}
	}
	Local l=new Local();
	l.lo=10;
	return l.function();
}
public static void main(String[] args) {
	LocalOuter le=new LocalOuter();
	le.i=le.function();
	System.out.println(le.i);
	
}
}
