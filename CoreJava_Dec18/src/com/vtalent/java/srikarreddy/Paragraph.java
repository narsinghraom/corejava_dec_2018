
public class Paragraph {
public static void main(String[] args) {
	String s="  srikar reddy baddam  ";
	s=s.replaceAll("srikar",   "madhukar");
	s=s.replaceAll("\\s", "" );
	s=s.trim();
	
	System.out.println(s);
}
}
