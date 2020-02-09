package com.vtalent.tarun.basics;

//4. Extract the number from the string?(String msg="you are about to delete 300 tasks please confirm";)
public class Question4 {

	public static void main(String[] args) {

		String msg = "you are about to delete 300 tasks please confirm";
		int value = Integer.parseInt(msg.replaceAll("[^0-9]", ""));
		System.out.println(value);
	}
}
