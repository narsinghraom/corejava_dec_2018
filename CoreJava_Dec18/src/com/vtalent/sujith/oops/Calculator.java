package com.vtalent.sujith.oops;

 abstract public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public abstract int mul(int a,int b);
	public abstract int div(int a, int b);
}
 
 class CalImp extends Calculator{
	 public int mul(int a,int b) {
		 return a*b;
	 }
	 public int div(int a,int b) {
		 return a/b;
	 
	 }
 }
 class CalImp2 extends CalImp{
	 public void print(String ch) {
		 System.out.println(ch);
	 }
 }
