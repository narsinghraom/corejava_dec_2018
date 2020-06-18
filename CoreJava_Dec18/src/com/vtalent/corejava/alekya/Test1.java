package com.vtalent.corejava.alekya;

public class Test1 {
	public static void main(String[] args) {
		First fr =new First();
		fr.function(5);
		System.out.println(fr.x);
		Second scr=new Second();
		scr.function(5);
		scr.functionone(2,3);
		System.out.println(scr.x+scr.y);
		System.out.println(scr.x);
		
		
	}
}
