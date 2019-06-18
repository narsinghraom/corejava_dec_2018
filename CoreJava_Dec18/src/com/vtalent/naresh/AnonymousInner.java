package com.vtalent.naresh;

interface AInner{
	public void display();
}

	


public class AnonymousInner implements AInner{
	public void display() {
		System.out.println("Heheh wear a smile :)");
	}
	public static void main(String[] args) {
		AInner ai=new AInner() {
			public void display() {
				System.out.println("display method");
			}
		};
		AnonymousInner bi=new AnonymousInner() ;
		ai.display();
		bi.display();
	}

}
