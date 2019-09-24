package com.vtalent.java.prashanth;

public abstract class AbstractEx {
	public void f1() {
		System.out.println("this is f1");
	}
	public void f2() {
		System.out.println("this is f2");
	}
	public abstract void f3();
}

class Abex extends AbstractEx{
	public void f3() {
		System.out.println("this is f3");
	}
}
class Test9{
public static void main(String[] args) {
	//type mismatch error cannot convert from abex to Test9
	//Test9 t1=new Abex();  
	//parent reference no error
	AbstractEx ex=new Abex();
	//child class direct object we can create because it is a fully structured class
	Abex ex1=new Abex();

}
}