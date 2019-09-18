package com.vtalent.java.vishnu;

interface Abc1{
	//in interface for variables and methods it default take it as public static final. 
	float pi=3.14f;
	int k=0;
	//int i;error value must be assiagn
	void function (int x);
	public void function(int x, int y);
}
class AbcImpl implements Abc1{
	int k;
	public void function (int x){
		System.out.println((int)pi+x);
		System.out.println(k);
	}

public void function(int x,int y){
	//pi=pi+x;
	k=k+(x+y);
	System.out.println(Abc1.k);
	System.out.println(k);
	
}
public void function(){
	System.out.println(k);
	
}

}
public class AbcInterface {
	public static void main(String[] args) {
		//AbcImpl abc=new AbcImpl();
		Abc1 abc=new AbcImpl();
		abc.k=5; //we can't assaign a value to the interface variables because those variables and methods are static final.
		abc.function(2);
		abc.function(2,3);
		//abc.function();//Runtime compilation error
	}
}
