package com.vtalent.varshini;

interface Readable {
	void reads();
   
}
 interface Writable {
	void writes();
   
}
	
		class Student12 implements Readable, Writable {
			
			public void reads() {
				System.out.println("reading");
			}

			public void writes() {
				System.out.println("writing");
			}

			public static void main(String args[]) {
				Student12 s = new Student12();
				s.reads();
				s.writes();
			}
		}
		// TODO Auto-generated method stub

	

