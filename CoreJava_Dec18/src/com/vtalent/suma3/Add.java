package com.vtalent.suma3;



 class Animal{
	 
	 void eat()
	 {
	 System.out.println("Eating");
 }
	 
 }
 class Dog extends Animal{
	 
	 void bark()
	 {
		 System.out.println("barking");
	 }
	 
 }
class Cat extends Animal{
	void meow()
	{
		System.out.println("ba");
	}
}

public class Add {
	public static void main(String[] args) 
	{
		Dog c= new Dog();
		c.eat();
		c.bark();
		Cat d=new Cat();
		d.eat();
		d.meow();
		
	}
		
	}

