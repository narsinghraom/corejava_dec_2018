package com.vtalent.swamy;
class Animal{
	void eat() {
		System.out.println("eating");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class cat extends Animal{
	void bark() {
		System.out.println("meowing");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		dog d=new dog ();
			d.bark();
			d.eat();
			cat c=new cat ();
			c.bark();
			c.eat();
	}

}
