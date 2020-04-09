package com.vtalent.corejava.sunil;

public class Singleton {
		private static Singleton mc=null;
	private Singleton() {
		
	}
	public static Singleton getSingleton() {
		if(mc==null) {
		mc=new Singleton();
		}
		return mc;
	}
	public static void main(String[] args) {
        System.out.println(Singleton.getSingleton().hashCode());	
        System.out.println(Singleton.getSingleton().hashCode());	
        System.out.println(Singleton.getSingleton().hashCode());	

	}

}
