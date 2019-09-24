package com.vtalent.mamathasri1;


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

