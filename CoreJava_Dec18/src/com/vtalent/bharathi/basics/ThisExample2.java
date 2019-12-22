package com.vtalent.bharathi.basics;

public class ThisExample2 {
		int x,y;
		
		ThisExample2(){
			this(8); // calling a constructor with one signature
			x= 5;
			y = 7;
			
		}
		ThisExample2(int x){
			this(5,6);
			this.x = this.x+x;
			y = x+y;
			
			
		}
		ThisExample2(int x,int y){  //x = 5, y = 6
			
			this.x = this.x+x;  
			this.y = this.y+y;
			
		}
		public static void main(String[] args) {
			ThisExample2 obj1 = new ThisExample2();
			System.out.println(obj1.x);
			System.out.println(obj1.y);
			
			/*ThisExample obj2 = new ThisExample(5);
			System.out.println(obj2.x);
			System.out.println(obj2.y);

			ThisExample1 obj3 = new ThisExample1(5,6);
			System.out.println(obj3.x);
			System.out.println(obj3.y);
			*/
		}
	}


