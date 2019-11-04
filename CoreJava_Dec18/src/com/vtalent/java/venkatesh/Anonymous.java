package com.vtalent.java.venkatesh;

interface Bcd{
	public void function();
}
public class Anonymous {
	public void function(Bcd  bcd) {
		bcd.function();
	}
public static void main(String[] args) {
	Anonymous a=new Anonymous();
	a.function(new Bcd() {
		public void function() {
			System.out.println("array ex");
		}
	});
}}
