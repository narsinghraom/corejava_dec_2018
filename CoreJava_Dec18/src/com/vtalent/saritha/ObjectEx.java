package com.vtalent.saritha;

public class ObjectEx {
		static ObjectEx oe = new ObjectEx();
		int i = 20;

		public void function() {
			System.out.println(i);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ObjectEx oe1 = new ObjectEx();
			oe1.i = 10;
			oe.i = 10;
			// oe1.function();
			System.out.println(oe.i);

		}

	}


