import java.util.*;
public class RevString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = s.next();
		String rev = "";
		int leng = str.length();
		for(int i=leng-1; i>=0; --i) {
			rev = rev + str.charAt(i);
			rev = rev.toLowerCase();
		}
		System.out.println("Reversed String of " +str +" " +"is: " +rev);
	}

}
