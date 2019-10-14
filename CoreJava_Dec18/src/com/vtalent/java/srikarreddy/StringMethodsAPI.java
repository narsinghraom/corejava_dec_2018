package com.vtalent.java.srikarreddy;

public class StringMethodsAPI {
 
		public void charArt( ){
			String e="srikarreddy";
			char f1=e.charAt(0);
			char f2=e.charAt(5);
			char f3=e.charAt(7);
			char f4=e.charAt(2);
			System.out.println("Character at 0 index is: "+f1);
			System.out.println("Character at 5 index is: "+f2);
			System.out.println("Character at 7 index is: "+f3);
			System.out.println("Character at 2 index is: "+f4);
			
		}
		public void codePoint() {
			String e="srikarreddy";
			System.out.println("Given String : " + e); 
			 int obj1 = e.codePointAt(3);  
			 int obj2 = e.codePointAt(6); 
			 System.out.println("Character Value = " + obj1); 
			 System.out.println("Character Value = " + obj2); 
			 
		}
		public void codePointBefore() {
			String e="srikarreddy";
			System.out.println("Given String : " + e); 
			 int obj1 = e. codePointBefore(3);  
			 int obj2 = e. codePointBefore (6); 
			 System.out.println("Character Value = " + obj1); 
			 System.out.println("Character Value = " + obj2); }
		public void charactercodePointCountMethod () { 

	        // Initialize a new CharSequence object  
	        CharSequence c1 = "Srikarreddy!";  
	    	System.out.println(c1 );
	    	  
	        // Initialize beginIndex and endIndex  
	        int beginIndex1 = 2;  
	        int endIndex1 =  8  ;  
	        int result1 = Character.codePointCount(c1, beginIndex1,endIndex1);  
	        System.out.println("The result comes to be: "+result1); 
	        }
		public void compareToString() {
			String j1="SRIKAR";
			String j2="VENKATESH";
			String j3="SRIKAR";
			String j4="SRIKAR";
			String j5="SRIKAR";
			String j6="srikar"; 
			System.out.println(j5.compareTo(j6));
			System.out.println(j1.compareTo(j2));
			System.out.println(j3.compareTo(j4));
		}
		public void compareToIgnoreCase() {
			String j1="SRIKAR";
			String j2="SRIKAR"; 
			String j3="SRIKAR";
			String j4="VENKATESH";
			String j5="SRIKAR";
			String j6="srikar"; 
			System.out.println(j5.compareToIgnoreCase(j6));
			System.out.println(j1.compareToIgnoreCase(j2));
			System.out.println(j3.compareToIgnoreCase(j4));
		}
		  public   void  Stringconcat() {
			String mystring = "Reddy";
			String mystr = "Srikar".concat(mystring);
			System.out.println(mystr);
		}	
		 public void contains() {
			 String a = "Srikar reddy baddam";  
				System.out.println(a.contains("Sri"));
				System.out.println(a.contains("kar")); 
				System.out.println(a.contains("REDDY")); 
				System.out.println(a.contains("baddam")); 
				 String b = "Srikar reddy baddam"; 
				 String c= "REDDY";
				System.out.println(b.toLowerCase().contains(c.toLowerCase()));
				System.out.println(b.toUpperCase().contains(c.toUpperCase()));
				}
			 public void contentEquals() {
				 String a = "Madhukar Reddy";
			       String b = "Srikar Reddy";
			       StringBuffer c = new StringBuffer("Madhukar Reddy"); 
			       StringBuffer d = new StringBuffer("Srikar Reddy");  
			       System.out.println("a equals to c:"+a.contentEquals(c));
			       System.out.println("b equals to c:"+b.contentEquals(c));
			       System.out.println("a equals to d:"+a.contentEquals(d));
			       System.out.println("b equals to d:"+b.contentEquals(d));
			 }
			 public void contentEquals1() {
				 String a = "Madhukar Reddy";
			       String b = "Srikar Reddy";
			       System.out.println("a equals to b:"+a.contentEquals(b));
			 }
	public void   StringcopyValueOf() {
		 char[] data = {'a','b','c','d','e','f','g','h','i','j','k'};
	     String str1 = "Text";
	     String str2 = "String";
	     //Variation 1:String copyValueOf(char[] data)
	     str1 = str1.copyValueOf(data);
	     System.out.println("str1 after copy: " + str1);

	     //Variation 2:String copyValueOf(char[] data,int offset,int count)
	     str2 = str2.copyValueOf(data, 5, 6 );
	     System.out.println("str2 after copy: " + str2);
	}
	public void endsWith() {
		String str1 = new String("This is a test String");
	    String str2 = new String("Test ABC");
	    boolean var1 = str1.endsWith("String");
	    boolean var2 = str1.endsWith("ABC");
	    boolean var3 = str2.endsWith("String");
	    boolean var4 = str2.endsWith("ABC");
	    System.out.println("str1 ends with String: "+ var1);
	    System.out.println("str1 ends with ABC: "+ var2);
	    System.out.println("str2 ends with String: "+ var3);
	    System.out.println("str2 ends with ABC: "+ var4);
	} 
	 public void equals() {
		 String str1= new String("Hello");
			String str2= new String("Hi");
			String str3= new String("Hello");
			System.out.println("str1 equals to str2:"+str1.equals(str2));
			System.out.println("str1 equals to str3:"+str1.equals(str3));
			System.out.println("str1 equals to Welcome:"+str1.equals("Welcome"));
			System.out.println("str1 equals to Hello:"+str1.equals("Hello"));
			System.out.println("str1 equals to hello:"+str1.equals("hello"));
			}
	 public void equalsIgnoreCase() {
		 String str1= new String("Apple");
			String str2= new String("MANGO");
			String str3= new String("APPLE");
			System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
			System.out.println("str1 equals to str3:"+str1.equalsIgnoreCase(str3));
			System.out.println("str1 equals to Welcome:"+str1.equalsIgnoreCase("Welcome"));
			System.out.println("str1 equals to Apple:"+str1.equalsIgnoreCase("Apple"));
			System.out.println("str2 equals to mango:"+str2.equalsIgnoreCase("mango"));
	 }
		 
		 
	 
	 
				
			 
		  
	 
		 
		     
		
	public static void main(String[] args) {
		StringMethodsAPI q=new   StringMethodsAPI();
		q.charArt();
		q.codePoint();
		 q.codePointBefore();
		 q.charactercodePointCountMethod();
		 q.compareToString();
		 q.compareToIgnoreCase();
		 q.Stringconcat();
		 q.contains();
		 q.contentEquals();
		 q.contentEquals1();
		 q.StringcopyValueOf();
		 q.endsWith();
		 q.equals();
		  q.equalsIgnoreCase(); 
	}}
	 


 
