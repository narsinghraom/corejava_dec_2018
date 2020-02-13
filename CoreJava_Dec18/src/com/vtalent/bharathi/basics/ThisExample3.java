package com.vtalent.bharathi.basics;

public class ThisExample3 {
			int x,y;
			
			ThisExample3(){
				this(2,3); // calling a constructor with two signature
				x= 5;
				y = 7;
				
			}
			ThisExample3(int x){
				this();
				this.x = this.x+x;
				y = x+y;
				
				
			}
			ThisExample3(int x,int y){  //x = 5, y = 6
				this.x = this.x+x;  
				this.y = this.y+y;
				
			}
			public static void main(String[] args) {
				/*ThisExample3 obj1 = new ThisExample3();
				System.out.println(obj1.x);
				System.out.println(obj1.y);*/
				
				ThisExample3 obj2 = new ThisExample3(5);
				System.out.println(obj2.x);
				System.out.println(obj2.y);

				/*ThisExample3 obj3 = new ThisExample3(5,6);
				System.out.println(obj3.x);
				System.out.println(obj3.y);
				*/
			}
		}

