package com.vtalent.sampath;

public class EncapsulationDemo {
	private String name;
	
	public String getName() {
		System.out.println("some one is accesing your name");
		return name;
	}
	public void setName(String name) {
		System.out.println("some one is changing your name");
		this.name=name;
	}

}
