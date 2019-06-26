package com.vtalent.sneha;
interface TestA { String toString(); }

public class Test {
	 public static void main(String[] args) {
		  System.out.println(new TestA() {
		  public String toString() { return "test"; }
		 });
		 }
		}

