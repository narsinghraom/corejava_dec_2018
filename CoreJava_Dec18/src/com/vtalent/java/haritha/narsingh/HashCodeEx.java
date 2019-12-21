package com.vtalent.java.haritha.narsingh;

public class HashCodeEx {
	String str;
	int i;
	
	
	
	  @Override public int hashCode() { final int prime = 31; int result = 1;
	  result = prime * result + i; result = prime * result + ((str == null) ? 0 :
	  str.hashCode()); return result; }
	 


	
	  @Override public boolean equals(Object obj) { if (this == obj) return true;
	  if (obj == null) return false; if (getClass() != obj.getClass()) return
	  false; HashCodeEx other = (HashCodeEx) obj; if (i != other.i) return false;
	  if (str == null) { if (other.str != null) return false; } else if
	  (!str.equals(other.str)) return false; return true; }
	 

	public static void main(String[] args) {
		HashCodeEx h1 = new HashCodeEx();
		h1.str ="ABC";
		h1.i=10;
		
		HashCodeEx h2 = new HashCodeEx();
		h2.str ="ABC";
		h2.i=10;
		if(h1.equals(h2)) {
			System.out.println("h1 and h2 are same object");
		}else {
			System.out.println("h1 and h2 are diff address");
		}
		if(h1.hashCode() == h2.hashCode()) {
			System.out.println("h1 and h2 are same add");
		}else {
			System.out.println("h1 and h2 are diff add");
		}
	}

}












