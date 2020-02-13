package tasks;

/**
 * @author win10
 * Count the spaces in a given string(String s="This is java 
 * Class and here we have got many friends";)	
 *
 */
public class CountTheSpacesInAString {
	public static void main(String[] args) {
		int count =0;
		String s="This is java Class and here we have got many friends"; 
		for(int i = 0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
			char ch = s.charAt(i);
			if(ch==' ') {
				count+=1;
				
				
			}
		}
		System.out.println(count);
	}

}
