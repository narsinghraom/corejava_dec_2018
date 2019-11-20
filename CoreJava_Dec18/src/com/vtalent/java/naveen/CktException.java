package com.vtalent.java.naveen;

public class CktException extends RuntimeException {
	/*
	 * public int overs(double i) throws Exception { int result = 0; try { if(i>50)
	 * { result++; throw new Exception("overs exceeded"); } }catch(Exception e) {
	 * 
	 * System.out.println("please enter  lessthan 50"); CktmemP.playing(); }
	 * 
	 * return result; } public void runrate(double d) throws Exception { if(d>10) {
	 * throw new Exception("runrate not exceeded "); }
	 */
	/*
	 * }
	 * 
	 * 
	 * public static void rainException() throws Exception { throw new
	 * Exception("match stopped due to heavy rain"); }
	 */ 
 class OversException{
	public int overs(double i) throws Exception {
		if(i>50) {
			throw new Exception("overs exception  ");
		}
		return (int) i;
		
	}
 }
 class RainException{
	 public String toStrring() {
		 
			return "due to rain match stopped";
			 
		 }
 }

 
 
 
 
 
 
 
 //conditions by runrate to wickets
 public static int conditions(double d) {
	 if(d<=3) {
		return 3; 
	 }else if(d<=4) {
		 return 6;
	 }else if(d<=6) {
		 return 10;
	 }else
	return 0;
 
 }
 
}
