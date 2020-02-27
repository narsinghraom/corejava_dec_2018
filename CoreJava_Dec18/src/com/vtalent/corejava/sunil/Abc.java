package com.vtalent.corejava.sunil;

public class Abc {
static Abc abc=new Abc();
float f1,f2;
static long l1,l2;
Abc abcref;

public Abc function(Abc abc) {
	abcref=abc;
	return abcref;
}
public static long function() {
	Abc abc1=abc.function(new Abc());
	abc1.f1=1.5f;
	abc1.f2=2.5f;
	abc=abc1;
			return (long)(abc1.f1+abc1.f2); 
			
}
	public static void main(String[] args) {
l1=function();
l2=l1+5;
System.out.println(l1+l2);
System.out.println(abc.abcref);
System.out.println(abc.f1);
System.out.println(abc.f2);

	}

}
