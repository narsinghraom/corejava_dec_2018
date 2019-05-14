import com.vtalent.sampath.orange;

public class Example {
	double d1,d2;
	public long functionone(double d1,double d2) {
		d1=d1+d2;
		this.d2=this.d1+d2;
		return   (long )((long)d1+d2);
	}
	public static void main(String args[]) {
		Example enp=new Example();
		enp.functionone(10.0,15.0);
		System.out.println(enp.d1+enp.d2);

		System.out.println(enp);
		
		
		
		

	}

}
