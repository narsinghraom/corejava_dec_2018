package coreconcepts;

public class sample {

	static int a,b;
	long l1;
	public long function (int a, int b){
		sample . a = a + b;
		sample . b = a * b;
		return a + b;
	}
	public static sample function(){
		sample sample = new sample();
		sample.l1 =sample.function(2, 5);
		return sample;
	}
	public static void main(String[] args){
		sample s1 = function();
		System.out.println(a + b);
		System.out.println(s1.l1);
		System.out.println(s1);
	}
}
