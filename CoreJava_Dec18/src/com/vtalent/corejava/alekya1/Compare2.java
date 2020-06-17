package com.vtalent.corejava.alekya1;

public class Compare2 {
	public static void main(String[] args)
    {
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
System.out.println();
System.out.println("String 1: " + str1);
System.out.println("String 2: " + str2); 

        // Compare the two strings.
int result = str1.compareTo(str2);

        // Display the results of the comparison.
if (result < 0)
        {
System.out.println("\"" + str1 + "\"" +
" is less than " +
                "\"" + str2 + "\"");
System.out.println();
        }
else if (result == 0)
        {
	System.out.println("\"" + str1 + "\"" +
			" is equal to " +
			                "\"" + str2 + "\"");
			System.out.println();
			        }
			else // if (result > 0)
			        {
			System.out.println("\"" + str1 + "\"" +
			" is greater than " +
			                "\"" + str2 + "\"");
			System.out.println(); 
			        }
    }
}
        
