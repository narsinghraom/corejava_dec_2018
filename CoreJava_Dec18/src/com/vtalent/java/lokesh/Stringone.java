package com.vtalent.java.lokesh;

public class Stringone {
	public static void main (String args[]) {
	String zero = "saisree";
	char ch1 =zero.charAt (0);
	char ch2 = zero.charAt (3);
	char ch3 = zero.charAt(5);
	System.out.println("1st value ="+ch1);
	System.out.println("2nd value ="+ch2);
	System.out.println("3rd value ="+ch3);
	int i = zero.codePointAt(4);
	int j = zero.codePointAt(6);
	System.out.println("int i ="+i);
	System.out.println("int j =" +j);
	//
	String one = "saisree";
	System.out.println("String ="+one);
	int two = one.codePointBefore(3);
	System.out.println("point ="+two);
	//
	String three = "saisree";
	System.out.println("String="+zero);
	int four = three.codePointCount(0,6);
	System.out.println("points="+four);
	//
	String h = "lokesh";
	String k = "venkatesh";
	String l = "srikar";
	int x = h.compareTo(h);
	int y = k.compareTo(k);
	int z = l.compareTo(l);
	System.out.println("pen=" +x);
	System.out.println("pencil=" +y);
	System.out.println("watch=" +z);
			//
			String x1 = "LOKE";
			String y1 = "Loke";
			String z1 = "loke";
			int zero1 = x1.compareToIgnoreCase(y1);
			int one1 = y1.compareToIgnoreCase(z1);
			int two1 = z1.compareToIgnoreCase(x1);
			System.out.println("x1 and y1 compassion:"+zero1);
			System.out.println("y1 and z1 compassion:"+one1);
			System.out.println("z1 and x1 compassion:"+two1);
			//
			String a1 = "lokesh";
			String b1 = " venkat";
			String c1 = " srikar";
			 a1= a1.concat(b1);
			System.out.println(a1);
			a1 = a1.concat(b1).concat(c1);
			System.out.println(a1);
			//
			String s = "lokesh";
			System.out.println(s.contains("l"));
			System.out.println(s.contains("m"));
			System.out.println(s.contains("K"));
			//
			String Q= "venkatesh", w= "srikar";
			CharSequence cs = "venkatesh";
			System.out.println("char:"+ Q.contentEquals(cs));
			System.out.println("char:"+Q.contentEquals("srikar"));
			System.out.println("char:"+w.contentEquals("lokesh"));
			//contentEquals(stringBuffer sb);//
			String x2 = "lokesh";
			String y2 = "tejaswi";
			StringBuffer z2 = new StringBuffer ("lokesh");
			boolean Result = x2.contentEquals("y2");
			System.out.println(Result);
			Result = x2.contentEquals("x2");
			System.out.println(Result);
			//COPY VALUE OF (char[] data)
			char [] data = {'1','2','3','4','5','6','7','8','9',};
			String AB = "TEXT";
			String CD = "String";
			AB = String.copyValueOf(data);
			System.out.println("AB After copy:" +AB);
			CD = String.copyValueOf(data,5,3);
			System.out.println("CD After copy" +CD);
			//copy value of (char,intoffset,intcount) programee is same like upper one programee//
			//String ends with 
			String i1 = "tejaswi";
			System.out.println("End with character 'i':" + i1.endsWith("i"));
			System.out.println("End with character 'k':" + i1.endsWith("k"));
			System.out.println("End with character 'swi':" + i1.endsWith("swi"));
			//
			
			
	}

}
