package com.vtalent.tarun.basics.mysystemprintln;

public class MyPrintStream {
	MyPrintStream(MyOutputStream out){
		
	}
	public void println(String str) {
		print(str);
		
	}
	public void print(String str) {
		System.out.println(str);
		
	}
	public void println(int i) {
		System.out.println(i);
	}
	public void println(char ch) {
		System.out.println(ch);
	}
	public void println(float f) {
		System.out.println(f);
	}
	public void println(double d) {
		System.out.println(d);
	}
}