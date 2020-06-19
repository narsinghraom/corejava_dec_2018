package tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDigit {
	public static void main(String[] args) {
		String str = "hello12";
		Pattern p = Pattern.compile("\\d+");
		//System.out.println(p);
		Matcher m = p.matcher(str);
		int temp = 0;
		while(m.find()) {
			String s =m.group();
			System.out.println(s);
		}
	}

}
