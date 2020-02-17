package tasks;


/**
 * @Print the string char by Char(String str1="page 14 of 99";)
 *
 */
public class StringChar2 {
	public static void main(String[] args) {
		String str = "page 14 of 99";
		for (int i = 0; i<str.length();i++) {
			
			System.out.println(str.charAt(i));
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				String ie = "";
				//ie+=charcter.tostriing(ch);
			}
		}
	}
	

}
