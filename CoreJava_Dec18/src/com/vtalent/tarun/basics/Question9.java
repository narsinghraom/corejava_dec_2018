package com.vtalent.tarun.basics;

//Count the words in a given sentence(String s="This is Automation project Class";)
public class Question9 {

	public static void main(String[] args) {
		String s = "This is Automation project Class";
		int word = 1;

		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == ' ')
				word++;
		}

		System.out.println("Number of Words= " + word);
	}
}
