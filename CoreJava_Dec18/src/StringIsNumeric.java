import java.util.*;
import java.util.regex.*;

public class StringIsNumeric {

	static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

	public static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		}
		return pattern.matcher(str).matches();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = s.nextLine();
		if (isNumeric(str) == true) {
			System.out.println("numeric");
		} else
			System.out.println("not numeric");
	}
}