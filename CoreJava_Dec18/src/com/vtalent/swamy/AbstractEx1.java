package com.vtalent.swamy;
abstract class Demo{
	int x,y;
	public int add(int x,int y) {
		return x+y;
	}
	public int sub (int x,int y) {
		return x-y;
	}
	abstract int mul (int x,int y);
}
public class AbstractEx1 extends Demo {
int mul(int x, int y) {
	return x*y;
}
public static void main(String[] args) {
AbstractEx1 a= new AbstractEx1();
 System.out.println(a.add(34,98));
System.out.println(a.sub(656, 522));
System.out.println(a.mul(200, 3000));
System.out.println(a.x+" "+a.y);
}
}
