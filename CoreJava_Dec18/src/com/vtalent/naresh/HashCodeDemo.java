	package com.vtalent.naresh;

class HashDemo{
	int i;
	int j;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + j;
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
		HashDemo other = (HashDemo) obj;
		if (i != other.i)
			return false;
		if (j != other.j)
			return false;
		return true;
	}
	
}

public class HashCodeDemo {
	public static void main(String[] args) {
				HashDemo hd=new HashDemo();
					hd.i=10;
					hd.j=10;
					
					HashDemo hd1=new HashDemo();
						hd1.i=10;
						hd1.j=10;
						
						System.out.println("HashCode of hd"+hd.hashCode());
						System.out.println("HashCode of hd1"+hd1.hashCode());
						if(hd.equals(hd1)) {
						 System.out.println(true);
						}
						else {
							 System.out.println(false);
						}
						
						
	}
}
