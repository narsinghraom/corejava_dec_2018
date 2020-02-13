package tasks;


/**
 * @Print the string char by Char
 *
 */
public class StringChar {
	public static void main(String[] args) {
		int count =0;
		char str[] = "g eeks for ge eeks ".toCharArray(); 
		
		for (int i = 0;i<str.length;i++) {
			if (str[i] != ' ') 
			     str[count++] = str[i];
				
			
		}
		int i = count;
		System.out.println(String.valueOf(str).subSequence(0, i));
		//System.out.println(String.valueOf(str));
	}
}
	
	
	