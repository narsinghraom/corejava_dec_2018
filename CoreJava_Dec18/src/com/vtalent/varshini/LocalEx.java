package com.vtalent.varshini;

 class LocalEx {
 public int i;
 public int function() {
	 class Local{
		 int lo;
		 public int function() {
			 System.out.println("local class method");
			 return lo+5;
		 }
	 }
	 Local l=new Local();
	 l.lo=10;
	 return l.function();
 }
	public static void main(String[] args) {
		LocalEx le=new LocalEx();
		le.i=le.function();
		System.out.println(le.i);
	}

}
