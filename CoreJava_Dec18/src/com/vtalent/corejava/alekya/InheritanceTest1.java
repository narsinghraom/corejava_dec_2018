package com.vtalent.corejava.alekya;


	class Demo1A {
		int x, y;

		public void functionThree(int x, int y) {
			this.x = this.x + x;
			this.y = this.y + y;
		}

	}

	class Demo2A extends Demo1A {
		static int z;
		int x;

		public void functionTwo(int x) {
			this.x = this.x + x + z;
		}
	}

	class Demo3A extends Demo2A {
		public void functionOne() {
			System.out.println( x);
			System.out.println( y);
		}

	}

	public class InheritanceTest1 {
		public static void main(String[] args) {
			Demo1A d = new Demo3A();
			d.functionThree(5, 2);
			Demo2A d2 = new Demo3A();
			d2.functionTwo(3);
			d2.functionThree(3, 2);


			Demo3A d3 = new Demo3A();
			d3.functionTwo(3);
			d3.functionThree(3, 2);
			d3.functionOne();

			System.out.println(d.x + " first " + d.y);
			System.out.println(d2.x + "2nd  " + d2.y);
			System.out.println(d3.x + "  3rd" + d3.y);
		}
	}

