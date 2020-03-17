package com.vtalent.corejava.siva;

public class Test1 {
	public static void main(String[] args) {
		First first=new First();
		first.function(5);
		System.out.println(first.x);
		Second second=new Second();
		second.function(5);
		second.function(2,3);
		System.out.println(second.x+second.y);
		
		
	}

}
