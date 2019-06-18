package com.vtalent.mahadev1;
  class Myclass {
	private String name;

	   // Getter
	   public String getName() {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) {
	     this.name = newName;
	   }
	}
	

	public class Person {
	  public static void main(String[ ] args) {
	   Myclass myObj = new Myclass();
	    myObj.setName("John");
	    System.out.println(myObj.getName());
	  }
	}



