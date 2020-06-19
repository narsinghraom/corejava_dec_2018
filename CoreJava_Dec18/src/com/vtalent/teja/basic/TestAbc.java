package com.vtalent.teja.basic;


class TestAbc{
	public void display(Abc abc) {
		abc.fucnction();
	}
	public void main() {
		TestAbc t1=new TestAbc();
		t1.display(new Abc() {
	     public void function() {
				System.out.println("Anonymous class");
			}

		public void fucnction() {
			// TODO Auto-generated method stub
			
		}
		});
	}
}
