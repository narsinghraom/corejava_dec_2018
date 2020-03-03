
public class SampleWord {
	int X,Y,k;
	float f1;
	public void alekya(){
		X=10;
		Y=20;
		f1=20.5f;
		k=X+Y;
	}
	public static void Nikhil(){
		System.out.println("hw r u");
		System.out.println("who r u");
		
	}
	public void akhila(){
	System.out.println("Hey girl");
	System.out.println("My value of X"+" "+X);
	}

	public static void main(String[] args) {
		
		Nikhil();
		SampleWord sampleword = new SampleWord();
		sampleword.alekya();
		sampleword.akhila();
		System.out.println(sampleword.X*sampleword.Y);
		System.out.print(sampleword.f1+sampleword.X+sampleword.Y);
		System.out.println(sampleword);
		System.out.println(sampleword.k);
		
		
		
		
	}
	}
