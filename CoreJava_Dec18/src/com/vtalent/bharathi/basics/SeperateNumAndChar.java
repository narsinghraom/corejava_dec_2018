package tasks;

/**
 * @author win10
 *Separate the numbers and characters from the given string
 */
public class SeperateNumAndChar {
	public static void main(String[] args) {
		String s[]= {""};
		String str="I got 456 out of 600 in 7th Standard in 2008";
		for (int i= 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				
				System.out.print(ch);
			
			}}
		System.out.println("\n");
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i); 
			if(Character.isAlphabetic(ch)) {
				System.out.print(ch);
			}
		}
			 
	                  
			
		}
}
