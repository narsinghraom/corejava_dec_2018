
class First {
		int x,y;
		public int fucntion (int x) {
			this.x = this.x +x;
			y=y+x;
			return x;
		}
	}
class Second extends First {
	int y;
	 public int function (int y) {
		 this.y = this.x+y;
		 x=x+y;
		 return y;
	 }
	 public int function (int x, int y) {
		 this.x=this.x+x;
		 this.y = this.y+y;
		 return x+y;
	 }
}
class Third extends Second {
	int x;
	public int function(int x, int y) {
		this.x = this.x+x;
		this.y = this.y+y;
		return x+y;
	}
}
class Test {
 public static void main (String[] args) {
	 Third t1 = new Third();
	 int k=t1.function (5);
	 k=t1.function(k,k);
	 System.out.println(k);
	 System.out.println(t1.x+t1.y);
	 Second s1 = new Third();
	 k= s1.function(k);
	 k= s1.function(k,k);
	 System.out.println (k);
	 System.out.println(s1.x+s1.y);
	 First f1 = new Third();
	 k= f1.fucntion(k);
	 k=f1.fucntion(k);
	 System.out.println(k);
	 System.out.println(f1.x+f1.y);
 }
}
	 

 }
