package com.vtalent.hanu.oops;

public class ConstructorChain extends ConstructorCh {
	
	public ConstructorChain() {
		super();
	System.out.println("Child no param");
		// TODO Auto-generated constructor stub
	}
	public ConstructorChain(String name) {
		this();
		System.out.println("Child one param");
			// TODO Auto-generated constructor stub
		}
	public ConstructorChain(String name, int no) {
		this(name);
		System.out.println("Child two param");
			// TODO Auto-generated constructor stub
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChain cc= new ConstructorChain("Hanuman",239);

	}

}
