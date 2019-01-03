package src.com.vtalent.sujith;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=new First();
		f.function(2);
		f.function(2,3);
		
		System.out.println("first    "+f.i);
		System.out.println("first    "+f.j);

		Second s=new Second();
		s.function(2);
		s.function(2,3);
		System.out.println("second   "+s.i);
		System.out.println("second   "+s.j);
		
		Third t=new Third();
		t.function(2);
		t.function(2,3);
		System.out.println("third    "+t.i);
		System.out.println("third    "+t.j);
	}

}
