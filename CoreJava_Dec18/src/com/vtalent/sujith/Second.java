package src.com.vtalent.sujith;

public class Second extends First {
 
	int i;
	public void function(int i,int j) {
		super.function(i, j);
		this.i=this.i+i;
		this.j=this.j+j;
		super.i=super.i=i;
	}
}
