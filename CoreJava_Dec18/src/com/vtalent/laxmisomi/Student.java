package com.vtalent.laxmisomi;
 interface Readable {
	void reads();
   
}

 interface Writable {
	void writes();
   
}



class Student implements Readable, Writable {
	public void reads() {
		System.out.println("reading");
	}

	public void writes() {
		System.out.println("writing");
	}

	public static void main(String args[]) {
		Student s = new Student();
		s.reads();
		s.writes();
	}
}



