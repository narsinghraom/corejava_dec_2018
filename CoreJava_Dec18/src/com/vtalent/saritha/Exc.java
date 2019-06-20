package com.vtalent.saritha;

public class Exc {
	int a;
	void display(){
		try{
			int a=4/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Exception handling");
	}
}
class Except{
	public static void main(String []args){
		Exc obj=new Exc();
		obj.display();
		
		
		}
	}


