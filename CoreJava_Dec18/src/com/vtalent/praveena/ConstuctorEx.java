package com.vtalent.praveena;


	public class ConstructorEx {
		int x, y;

		ConstructorEx() {
			x = 5;
			y = 7;
		}

		ConstructorEx(int x) {
			this(x, x + 1);
			this.x = this.x + x;
			y = y + x;

		}

		ConstructorEx(int x, int y) {
			this();
			this.x = this.x + x;
			this.y = this.y + y;
		}

		public void function() {
			System.out.println(x + y); //12
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ConstructorEx c1 = new ConstructorEx();
			//ConstructorEx c2 = new ConstructorEx(5);
			// ConstructorEx c3 = new ConstructorEx(4, 5);
			// System.out.println(c1.x);
			// System.out.println(c2.x);

			c1.function();
			System.out.println(c1.y);
			 System.out.println(c1.x);

		}

	}


}
