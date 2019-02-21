package sitha.vtalent;

public class Object1 {
	static Object1 demo;
	Object1 demo1;
	int i,j;
	public static Object1 Function(){
		demo=new Object1();
		demo.demo1=new Object1();
		demo.i=12;
		demo.j=23;
		demo.demo1.i=demo.i+demo.j;
		demo.demo1.j=demo.i*demo.j;
		return demo.demo1;
		}
   public static void main(String[] args) {
	   demo=Function();
	   System.out.println(demo.i);
	   System.out.println(demo.j);
	}

}
