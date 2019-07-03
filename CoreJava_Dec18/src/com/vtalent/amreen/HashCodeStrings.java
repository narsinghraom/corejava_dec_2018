package com.vtalent.amreen;

public class HashCodeStrings {

	String s;
	String s1;
	String s3 = new String();

	public static void main(String[] args) {
		HashCodeStrings obj = new HashCodeStrings();
		HashCodeStrings obj1 = new HashCodeStrings();
		obj.s = "amreen";
		obj.s1 = "sulthana";
		obj.s3 = "dds";
		obj1.s = "amreen";
		obj1.s1 = "sulthana";
		obj1.s3 = "dds";
		System.out.println(obj.equals(obj1));

		System.out.println(obj == obj1);
		System.out.println(obj.s == obj1.s);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		result = prime * result + ((s1 == null) ? 0 : s1.hashCode());
		result = prime * result + ((s3 == null) ? 0 : s3.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeStrings other = (HashCodeStrings) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		if (s1 == null) {
			if (other.s1 != null)
				return false;
		} else if (!s1.equals(other.s1))
			return false;
		if (s3 == null) {
			if (other.s3 != null)
				return false;
		} else if (!s3.equals(other.s3))
			return false;
		return true;
	}

}
