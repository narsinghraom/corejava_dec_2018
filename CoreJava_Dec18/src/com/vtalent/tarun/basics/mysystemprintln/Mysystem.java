package com.vtalent.tarun.basics.mysystemprintln;

public class Mysystem {

	public static Readable in;
	private Mysystem() {
		
	}
	static final MyPrintStream out=new MyPrintStream(new MyOutputStream() {
		public void console() {
		
		}
	});
	
	
}