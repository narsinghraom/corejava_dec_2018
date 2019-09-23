package com.vtalent.shiva;

 class Student implements Readable,Writable {
	


public void read() {
	System.out.println("reading");
}

public void write() {
	System.out.println("writing");
}

public static void main(String args[]) {
	Student s = new Student();
	s.read();
	s.write();
}

	
}
