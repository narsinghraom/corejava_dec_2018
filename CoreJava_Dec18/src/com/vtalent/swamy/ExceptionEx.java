package com.vtalent.swamy;

public class ExceptionEx {
		String s=null;
	static	 int age=25;
	int i=0,k;
	void match() {
		try {
			k=3/i;
			System.out.println(k);
		}
		catch (Exception e) {
		System.out.println(e);
e.printStackTrace();
		}
		
	}
}

