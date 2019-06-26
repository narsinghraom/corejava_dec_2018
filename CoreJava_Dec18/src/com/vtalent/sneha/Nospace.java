package com.vtalent.sneha;

public class Nospace {
	   public static void main(String[] args) {  
	        String str = "public    static    void    main";  
	        //1st way  
	        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
	        System.out.println(noSpaceStr);  

}
}
