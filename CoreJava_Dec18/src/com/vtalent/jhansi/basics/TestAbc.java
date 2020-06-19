package com.vtalent.jhansi.basics;


	class TestAbc{
		public void display(Abc abc) {
			abc.function();
		}
		public static void main(String[] args) {
			TestAbc t1=new TestAbc();
			t1.display(new Abc() {
				public void function() {
				System.out.println("Anonymous class");	
				}});
				}
			
		}


