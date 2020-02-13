package tasks;

/**
 * @author win10
 * Swap a program without using Temp, Third Variable, StirngBuffer, StringBuilder?
     s="Hello";
     s1="World";
 *
 */
public class SwapcaseWuthoutThirdVariable {
	
	public static void main(String[] args) {
		String s = "Bharathi";
		String s1 = "Hello";
		System.out.println("Before Swap "+s+" "+s1);
		s = s+s1;
		s1 = s.substring(0, s.length() - s1.length());//(0,(13-5)=8) it will prints 0 to 7th index
		s = s.substring(s1.length()); // it will prints from 8 
	    System.out.println("After : " + s + " " + s1); 
		
	}
	

}
