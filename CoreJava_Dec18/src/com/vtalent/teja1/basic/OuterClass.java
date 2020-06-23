package com.vtalent.teja1.basic;

class MyMainClass {
	  
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}

	public class OuterClass  {
	  public class InnerClass {

		public int y;

		}

	private int x;

	public static void main(String[] args) {
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	  }
	}
