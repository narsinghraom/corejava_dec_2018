package com.vtalent.praveena;


	public class ConstructorEx1 {
		int x, y;

		ConstructorEx1() {
			x = 5;
			y = 7;
		}

		ConstructorEx1(int x) {
			this(x, x + 1);
			this.x = this.x + x;
			y = y + x;

		}

		ConstructorEx1(int x, int y) {
			this();
			this.x = this.x + x;
			this.y = this.y + y;
		}

		public void function() {
			System.out.println(x + y); //12
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//ConstructorEx1 c1 = new ConstructorEx1();
			ConstructorEx1 c2 = new ConstructorEx1(5);
			// ConstructorEx c3 = new ConstructorEx(4, 5);
			// System.out.println(c1.x);
			// System.out.println(c2.x);

			c2.function();
			System.out.println(c2.y);
			 System.out.println(c2.x);

		}

	}



