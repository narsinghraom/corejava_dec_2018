package com.vtalent.corejava.alekya;


	abstract class Bike{  
		  abstract void run();  //abstract methods will not have body
		}  
		class HondaAbstra1 extends Bike{  
		void run(){System.out.println("running safely");}  
		public static void main(String args[]){  
		 Bike obj = new HondaAbstra1();  
		 HondaAbstra1 obj1 = new HondaAbstra1();  
		 obj.run();  
		}  
		}  


