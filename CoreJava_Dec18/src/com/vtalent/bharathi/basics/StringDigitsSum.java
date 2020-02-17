package tasks;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author String str = page 14 of 99;
 *
 */
public class StringDigitsSum {
	//private static String string;

	public static void main(String[] args) {
		 String str ="page 14 of 99";
		 //int sum = 0;
		
		Pattern p= Pattern.compile("\\d+") ;
		Matcher m = p.matcher(str);
		int temp= 0;
		while(m.find())
		{
			String s = m.group();
			System.out.println(s);
			 temp =temp+Integer.parseInt(s);
		}System.out.println(temp);
	}

}
