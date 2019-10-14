package com.vtalent.prashanth;

public class ExceptionEx {
	int k;
	int [] arr = new int[2];
	String st;
	public void function() {
		try {
			k = 1/k;
			arr[2] = 5;
			char ch = st.charAt(0);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
		}
		catch (NullPointerException k) {
			System.out.println(k);
		}
		catch(Exception s) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		ExceptionEx e = new ExceptionEx();
		e.function();

	}

}
