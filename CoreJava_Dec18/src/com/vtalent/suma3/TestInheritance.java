package com.vtalent.suma3;

class Animall 
{
	void eat() 
	{
		System.out.println("eating...");
	}
}

class Dogg extends Animall 
{
	void bark() {
		System.out.println("barking...");
	}
}

class Catt extends Animall 
{
	void meow() 
	{
		System.out.println("meowing...");
	}
}

class TestInheritance
{
	public static void main(String args[]) 
	{
		Catt c = new Catt();
		c.meow();
		c.eat();
        //c.bark();
		// C.T.Error
	}
}



