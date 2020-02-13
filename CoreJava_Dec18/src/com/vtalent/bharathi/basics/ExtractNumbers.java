package tasks;
//import java.util.regex.Pattern;

/**
 * @author win10
 * Extracting the numbers from the string
 *
 */

public class ExtractNumbers {

	static String ExtractInt(String str) {
	str = str.replaceAll("[^\\d]", " ");
	str = str.trim(); 
	 str = str.replaceAll(" +", " "); 
	  
     if (str.equals("")) 
         return "-1"; 

     return str; 
	
	}

	public static void main(String[] args) {
		String str = "98hello World1234 hii";
		System.out.println(ExtractInt(str));
		
		
	}
	
	/*
	
	
	static String extractInt(String str) 
    { 
       
        str = str.replaceAll("[^\\d]", " "); 
  
        
       // str = str.trim(); 
  
        str = str.replaceAll(" +", " "); 
  
        if (str.equals("")) 
            return "-1"; 
  
        return str; 
    } 
    public static void main(String[] args) 
    { 
        String str = "98hello World1234 hii"; 
        System.out.print(extractInt(str)); 
    } 
	
*/
}
