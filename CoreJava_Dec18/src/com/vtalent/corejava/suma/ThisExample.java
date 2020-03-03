package com.vtalent.corejava.suma;

	public class ThisExample {
		int a,b;
		public ThisExample() {
		System.out.println("Default");
		}
		public ThisExample(int a) {
		this(a,4);
		this.a = a;
		System.out.println("one parameter constructor");
		}
		public ThisExample(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println("second parameter constructor");
		}
		public static void main(String[] args) {
		ThisExample example=new ThisExample(5);
		}
		}

