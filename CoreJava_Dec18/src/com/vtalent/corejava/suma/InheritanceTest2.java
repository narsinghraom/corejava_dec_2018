package com.vtalent.corejava.suma;


	class A {
		int i, j;

		public void funtionOne(int i) {
			this.i = this.i + i;
			j = this.j + j;
			System.out.println("Void Type is Called");
			
		}
	}

	class B extends A {
		int j;

		public void functionThree(int i, int j) {
			this.j = this.j + j;
			super.j = super.j + this.j;
			System.out.println(super.j);
			this.i = this.i + i;
			System.out.println(this.i);

		}

	}

	class Third extends A {
		public int function(int i) {
			System.out.println("int Type is Called");
			return i * i;	
		}

		class Four extends A {

			public int function(int i) {
				System.out.println("hi");
				System.out.println("hi");
				return 1;
			}
			
		}
	}

	public class InheritanceTest2 {
		public static void main(String[] args) {
			A f = new A();
			f.funtionOne(5);

			B s = new B();
			s.functionThree(5, 5);
			s.funtionOne(7);

			Third d = new Third();
			d.function(15);
			int k = d.function(10);
			System.out.println(k);

			System.out.println(s.j);
			System.out.println(s.i);
		}
	}

