package com.vtalent.jhansi.basics;

public class Test {
public static void main(String[] args) {
	First f1=new First();
	Second s1=new Second();
	f1.function();
	System.out.println(f1.x+f1.y);
	s1.function();
	s1.functionone();
	System.out.println(s1.x+s1.y);
}

}
