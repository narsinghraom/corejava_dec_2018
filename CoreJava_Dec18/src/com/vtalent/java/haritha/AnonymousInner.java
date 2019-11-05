package com.vtalent.java.haritha;

interface Bcd{
	public void function();
}
public class AnonymousInner  {
	public void function(Bcd bcd) {
		bcd.function();
	}

	public static void main(String[] args) {
		AnonymousInner a=new AnonymousInner();
		a.function(new Bcd() {
			public void function() {
				System.out.println("AnonymousInner example");
			}
		});

	}

}
