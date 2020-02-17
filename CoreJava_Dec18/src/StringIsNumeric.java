import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringIsNumeric {

	/*
	 * static Pattern pattern = Pattern.compile("^[0-9]$");
	 * 
	 * public static boolean isNumeric(String str) { if (str == null) { return
	 * false; } return pattern.matcher(str).matches(); }
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = s.nextLine();
		/*
		 * if (isNumeric(str) == true) { System.out.println("numeric"); } else
		 * System.out.println("not numeric"); }
		 */
		/*
		 * if (str.equals("^[0-9]+$")) { System.out.println("yes"); } else
		 * System.out.println("no"); }}
		 */
		Pattern p = Pattern.compile("\\d+");
		Pattern p1 = Pattern.compile("[a-zA-Z]+");
		Matcher m = p.matcher(str);
		Matcher m1 = p1.matcher(str);
		boolean b = m.matches();
		String sr = "";	
			while(m.find()) {
		sr = m.group();
			System.out.println("numeric: " +sr);
		}
		while(m1.find())	{	
			sr = m1.group();
				System.out.println("not numeric: " +sr);
				
			}
		
	}
}
