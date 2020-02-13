package tasks;

/**
 * @author win10
 *
 * WAP using this, Super, InstanceVariables?
 */
class Pogramme1 {
	int x =1;
	int y = 2;
	int sum() {
		System.out.println(x+y);
		return x+y;
		
	}
}
	 public class Pogramme extends Pogramme1{
		 int n1= 2;
		int n2 = 5;
		int sum() {
			super.sum();
			int n1 = 10;
			int n2 =15;
			
			System.out.println(this.n1+this.n2);
			System.out.println(n1+n2);
			System.out.println(super.x+super.y);
			
			
			return x+y;
		}
		
	
	public static void main(String[] args) {
		Pogramme p = new Pogramme();
		p.sum();
		
		
	}
	}



