package com.vtalent.bharathi.basics;


class one{
	int x, y,z;
	public void function(int x) {
		this.x = this.x+x;
		y = x;
	}
	public void function (int x,int y) {
		this.x = this.x+x;
		this.y = this.y+y;
		
	}
}
class Two extends one {
	int x;
	public void function() {
		x = 10;
		
	}
	public void function(int x) {
		this.x = this.x+x;
		
	}
}
	
	class Three extends Two{
		public void function(int x, int y, int z) {
			this.x  = this.x +x;
			this.y = this.y+y;
			this.z = this.z+z;
			
		}
		public void function(int x,int y)
		{
			this.x = this.x+x;
			this.y = y;
		}
	}




public class Test {
	public static void main(String[] args) {
		Two obj = new Three();
		obj.function();
		obj.function(5);
		obj.function(obj.x,obj.y);
		//obj.function(2,3,4);
		System.out.println(obj.x+obj.y);
		
		
		
		Three obj1 = new Three();
		obj1.function();
		obj1.function(5);
		obj1.function(obj1.x,obj1.y);
		obj1.function(2,3,4);
		System.out.println(obj1.x+obj1.y);  // 35
		
		
		Two obj2 = new Two();
		obj2.function();
		obj2.function(5);
		obj2.function(obj2.x,obj2.y);
		//obj2.function(2,3,4);
		System.out.println(obj2.x+obj2.y);  // 15
		
		
		 one obj3 = new Two ();
		//obj3.function();
		obj3.function(5);
		obj3.function(obj3.x,obj3.y);
		//obj3.function(2,3,4);
		System.out.println(obj3.x+obj3.y);  // 0
		


		one obj4 = new Three ();
		//obj.function();
		obj4.function(5);
		obj4.function(obj4.x,obj4.y);
		//obj4.function(2,3,4);
		System.out.println(obj4.x+obj4.y);  // 0
		
		
		
		
		
		
	}
	

}
